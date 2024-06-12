package com.example.familyreunion.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.familyreunion.R
import com.example.familyreunion.model.AnnouncementViewModel

class AnnouncementsActivity : AppCompatActivity() {

    // Initialize the AnnouncementViewModel using by viewModels()
    private lateinit var viewModel : AnnouncementViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_announcements)

        viewModel = ViewModelProvider(this)[AnnouncementViewModel::class.java]

        // Observe announcements and update UI accordingly
        viewModel.announcementList.observe(this) {
            updateAnnouncementAdapter(it)
        }
    }
}
