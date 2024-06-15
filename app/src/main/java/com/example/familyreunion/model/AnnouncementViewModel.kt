package com.example.familyreunion.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.familyreunion.roomdb.Announcement
import com.example.familyreunion.roomdb.MainAppDB
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnnouncementViewModel(application: Application) : AndroidViewModel(application) {

    private val db = MainAppDB.getDatabase(application)

    private val _announcementList = MutableLiveData<List<Announcement>>()
    val announcementList: LiveData<List<Announcement>> get() = _announcementList

    init {
            fetchAllAnnouncements()
    }

    fun insertAnnouncement(announcement: Announcement) {
        viewModelScope.launch(Dispatchers.IO) {
            db.announcementDao().insertAnnouncement(announcement)
            fetchAllAnnouncements()
        }
    }

    private fun fetchAllAnnouncements()
    {
        viewModelScope.launch(Dispatchers.IO) {
            val list = db.announcementDao().getAll()
            _announcementList.postValue(list)
        }
    }

}
