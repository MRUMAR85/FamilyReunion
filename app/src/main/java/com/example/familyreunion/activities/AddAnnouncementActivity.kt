package com.example.familyreunion.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.familyreunion.R
import com.example.familyreunion.model.AnnouncementViewModel
import com.example.familyreunion.roomdb.Announcement

class AddAnnouncementActivity : AppCompatActivity() {
    private lateinit var viewModel : AnnouncementViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_announcement)

        viewModel = ViewModelProvider(this)[AnnouncementViewModel::class.java]

        // Set up your save and discard buttons
        findViewById<Button>(R.id.btnSaveAnnouncement).setOnClickListener {
            val title = findViewById<EditText>(R.id.etAnnouncementTitle).text.toString()
            val description = findViewById<EditText>(R.id.etAnnouncementDescription).text.toString()

            val dataObject = Announcement(0,title,description,"null","null")
            viewModel.insertAnnouncement(dataObject)
            startActivity(Intent(this, HomeActivity::class.java))
        }

        findViewById<Button>(R.id.btnDiscardAnnouncement).setOnClickListener {
            // Discard and close the activity
            finish()
        }
    }
}
