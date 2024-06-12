package com.example.familyreunion.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.familyreunion.repositry.AnnouncementRepository
import com.example.familyreunion.roomdb.Announcement
import com.example.familyreunion.roomdb.AppDatabase
import kotlinx.coroutines.launch

class AnnouncementViewModel(application: Application) : AndroidViewModel(application) {

    private val db = AppDatabase.getDatabase(application)

    private val _announcementList = MutableLiveData<List<Announcement>>()
    val announcementList: LiveData<List<Announcement>> get() = _announcementList

    init {
            fetchAllAnnouncements()
    }

    fun insertAnnouncement(announcement: Announcement) {
        viewModelScope.launch {
            db.announcementDao().insertAnnouncement(announcement)
            fetchAllAnnouncements()
        }
    }

    private fun fetchAllAnnouncements()
    {
        viewModelScope.launch {
            val list = db.announcementDao().getAll()
            _announcementList.postValue(list)
        }
    }

}
