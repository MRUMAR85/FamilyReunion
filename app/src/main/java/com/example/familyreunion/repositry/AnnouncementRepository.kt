package com.example.familyreunion.repositry

import android.app.Application
import com.example.familyreunion.roomdb.Announcement
import com.example.familyreunion.roomdb.AppDatabase

class AnnouncementRepository(application: Application) {

    val db = AppDatabase.getDatabase(application)

    val announcementDao = db.announcementDao()

    fun insertAnnouncement(announcement : Announcement)
    {

    }
}
