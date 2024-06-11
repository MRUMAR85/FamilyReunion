package com.example.familyreunion.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.R
import com.example.familyreunion.model.AnnouncementViewModel

class AnnouncementsActivity : AppCompatActivity() {

    // Initialize the AnnouncementViewModel using by viewModels()
    private val viewModel: AnnouncementViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_announcements)

        // Observe announcements and update UI accordingly
        viewModel.allAnnouncements.observe(this) {
            // Update UI with announcements
            // e.g., update a RecyclerView adapter
        }
    }
}
