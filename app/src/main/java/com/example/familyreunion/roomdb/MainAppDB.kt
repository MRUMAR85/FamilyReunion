package com.example.familyreunion.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Announcement::class, Event::class, User::class], version = 2, exportSchema = false)
abstract class MainAppDB : RoomDatabase() {
    abstract fun announcementDao(): AnnouncementDao
    abstract fun eventDao(): EventDao
    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: MainAppDB? = null

        fun getDatabase(context: Context): MainAppDB {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainAppDB::class.java,
                    "Main-App-database"
                )
                    .fallbackToDestructiveMigration() // Ensure this line is added
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
