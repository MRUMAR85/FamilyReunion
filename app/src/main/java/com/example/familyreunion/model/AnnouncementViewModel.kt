package com.example.familyreunion.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.familyreunion.repositry.AnnouncementRepository
import com.example.familyreunion.roomdb.Announcement
import kotlinx.coroutines.launch

class AnnouncementViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = AnnouncementRepository(application)
    val allAnnouncements: LiveData<List<Announcement>> = repository.announcementDao.getAll()

    fun insert(announcement: Announcement) = viewModelScope.launch {
        repository.announcementDao.insert(announcement)
    }
}
