package com.example.familyreunion.repositry

import com.example.familyreunion.roomdb.User
import com.example.familyreunion.roomdb.UserDao

class UserRepository(private val userDao: UserDao) {

    suspend fun insert(user: User): Long {
        return userDao.insert(user)
    }

    suspend fun login(email: String, password: String): User? {
        return userDao.login(email, password)
    }

//    val db = AppDatabase.getDatabase(application)
//
//    val announcementDao = db.announcementDao()
//
//    fun insertAnnouncement(announcement : Announcement)
//    {
//
//    }
}


