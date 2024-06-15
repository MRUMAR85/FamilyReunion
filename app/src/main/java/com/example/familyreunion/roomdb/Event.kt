package com.example.familyreunion.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "events")
data class Event(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val eventName: String,
    val eventDescription: String,
    val startDate: String,
    val endDate: String,
    val startTime: String,
    val endTime: String,
    val location: String
)