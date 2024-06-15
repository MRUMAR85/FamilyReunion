package com.example.familyreunion.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.familyreunion.roomdb.EventDatabase
import com.example.familyreunion.viewmodel.EventViewModel

class EventViewModelFactory(private val db: EventDatabase) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(EventViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return EventViewModel(db) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
