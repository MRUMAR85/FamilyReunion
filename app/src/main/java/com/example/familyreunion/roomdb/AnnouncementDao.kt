package com.example.familyreunion.roomdb

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AnnouncementDao {
    @Query("SELECT * FROM announcement")
    fun getAll(): LiveData<List<Announcement>>

    @Insert
    suspend fun insert(announcement: Announcement)
}
