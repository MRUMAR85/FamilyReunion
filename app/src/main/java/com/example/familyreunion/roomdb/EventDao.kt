package com.example.familyreunion.roomdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface EventDao {

    @Query("SELECT * FROM events")
    fun getAll(): List<Event>
    @Insert
    suspend fun insertEvent(event: Event)


}
