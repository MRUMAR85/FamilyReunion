package com.example.familyreunion.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.R
import com.example.familyreunion.model.AnnouncementViewModel
import com.example.familyreunion.roomdb.Event
import com.example.familyreunion.viewmodel.EventViewModel

class AddNewEventActivity : AppCompatActivity() {

    private lateinit var viewModel : EventViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_event)

        viewModel = ViewModelProvider(this)[EventViewModel::class.java]

        // Set up your save and discard buttons
        findViewById<Button>(R.id.saveButton).setOnClickListener {

            val eName = findViewById<EditText>(R.id.etEventName).text.toString()
            // find, getText and store other properties as well for event

            val event = Event(0, eName, "description", "startDate", "EndDate", "StartTime", "EndTIme", "Location")

            viewModel.insertEvent(event)
            finish()


            // Save the announcement
            // Add your save logic here
        }

        findViewById<Button>(R.id.discardButton).setOnClickListener {
            // Discard and close the activity
            finish()
        }
    }
}