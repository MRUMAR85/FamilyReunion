package com.example.familyreunion.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.familyreunion.roomdb.Event
import com.example.familyreunion.roomdb.MainAppDB
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EventViewModel(application: Application) : AndroidViewModel(application) {

    val db = MainAppDB.getDatabase(application)
    private val _eventList = MutableLiveData<List<Event>>()
    val eventList: LiveData<List<Event>> get() = _eventList

    init {
        fetchAllEvents()
    }

    fun insertEvent(event: Event) {
        viewModelScope.launch(Dispatchers.IO) {
            db.eventDao().insertEvent(event)
            fetchAllEvents()
        }
    }

    private fun fetchAllEvents() {
        viewModelScope.launch(Dispatchers.IO) {
            val list = db.eventDao().getAll()
            _eventList.postValue(list)
        }
    }
}
