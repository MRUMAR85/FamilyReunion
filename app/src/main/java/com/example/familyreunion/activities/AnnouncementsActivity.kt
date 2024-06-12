package com.example.familyreunion.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.familyreunion.Adapter.RecyclerView.AnnouncementAdapter
import com.example.familyreunion.R
import com.example.familyreunion.model.AnnouncementViewModel

class AnnouncementsActivity : AppCompatActivity() {

    private lateinit var announcementAdapter : AnnouncementAdapter

    // Initialize the AnnouncementViewModel using by viewModels()
    private lateinit var viewModel : AnnouncementViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_announcements)

        val rvAnnouncements = findViewById<RecyclerView>(R.id.rvAnnouncements)

        announcementAdapter = AnnouncementAdapter(emptyList())
        viewModel = ViewModelProvider(this)[AnnouncementViewModel::class.java]

        rvAnnouncements.adapter = announcementAdapter
        rvAnnouncements.layoutManager = LinearLayoutManager(this)


        // Observe announcements and update UI accordingly
        viewModel.announcementList.observe(this) {
            announcementAdapter.updateAnnouncementAdapter(it)
        }
    }
}
