package com.example.familyreunion.roomdb

import android.content.Context

@Database(entities = [Announcement::class, Event::class], version = 1, exportSchema = false)
abstract class MainAppDB : RoomDatabase() {

    abstract fun announcementDao(): AnnouncementDao
    abstract fun eventDao(): EventDao

    companion object {
        @Volatile
        private var INSTANCE: MainAppDB? = null

        fun getDatabase(context: Context): MainAppDB {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainAppDB::class.java,
                    "Main-App-database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
