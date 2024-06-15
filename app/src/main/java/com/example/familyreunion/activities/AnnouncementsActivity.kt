package com.example.familyreunion.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.familyreunion.Adapter.RecyclerView.AnnouncementAdapter
import com.example.familyreunion.databinding.ActivityAnnouncementsBinding
import com.example.familyreunion.model.AnnouncementViewModel

class AnnouncementsActivity : AppCompatActivity() {

    private lateinit var announcementAdapter: AnnouncementAdapter
    private lateinit var viewModel: AnnouncementViewModel
    private lateinit var binding: ActivityAnnouncementsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnnouncementsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        announcementAdapter = AnnouncementAdapter(emptyList())
        viewModel = ViewModelProvider(this)[AnnouncementViewModel::class.java]

        binding.rvAnnouncements.adapter = announcementAdapter
        binding.rvAnnouncements.layoutManager = LinearLayoutManager(this)

        // Observe announcements and update UI accordingly
        viewModel.announcementList.observe(this) {
            announcementAdapter.updateAnnouncementAdapter(it)
        }

        // Set up click listener for the button
        binding.btn.setOnClickListener {
            startActivity(Intent(this, AddAnnouncementActivity::class.java))
        }
    }
}
