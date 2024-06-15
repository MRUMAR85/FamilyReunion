package com.example.familyreunion.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.familyreunion.roomdb.Event
import com.example.familyreunion.roomdb.EventDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EventViewModel(private val db: EventDatabase) : ViewModel() {

    private val _eventList = MutableLiveData<List<Event>>()
    val eventList: LiveData<List<Event>> get() = _eventList

    init {
        fetchAllEvents()
    }

    fun insertEvent(event: Event) {
        viewModelScope.launch(Dispatchers.IO) {
            db.EventDao().insertEvent(event)
            fetchAllEvents()
        }
    }

    private fun fetchAllEvents() {
        viewModelScope.launch(Dispatchers.IO) {
            val list = db.EventDao().getAll()
            _eventList.postValue(list)
        }
    }
}
