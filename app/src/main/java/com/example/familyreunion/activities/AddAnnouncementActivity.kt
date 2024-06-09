package com.example.familyreunion.activities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.R

class AddAnnouncementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_announcement)

        // Set up your save and discard buttons
        findViewById<Button>(R.id.btnSaveAnnouncement).setOnClickListener {
            // Save the announcement
            // Add your save logic here
        }

        findViewById<Button>(R.id.btnDiscardAnnouncement).setOnClickListener {
            // Discard and close the activity
            finish()
        }
    }
}
