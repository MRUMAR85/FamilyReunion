package com.example.familyreunion.activities

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.R

class AddNewEventActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_event)

        // Set up your save and discard buttons
        findViewById<Button>(R.id.saveButton).setOnClickListener {
            // Save the announcement
            // Add your save logic here
        }

        findViewById<Button>(R.id.discardButton).setOnClickListener {
            // Discard and close the activity
            finish()
        }
    }
}