package com.example.familyreunion.roomdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AnnouncementDao {
    @Query("SELECT * FROM announcement")
    fun getAll(): List<Announcement>

    @Insert
    suspend fun insertAnnouncement(announcement: Announcement)

}
