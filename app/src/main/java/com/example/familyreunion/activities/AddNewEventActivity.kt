package com.example.familyreunion.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.familyreunion.R
import com.example.familyreunion.roomdb.Event
import com.example.familyreunion.viewmodel.EventViewModel

class AddNewEventActivity : AppCompatActivity() {

    private lateinit var viewModel : EventViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_event)

        viewModel = ViewModelProvider(this)[EventViewModel::class.java]

        // Set up your save and discard buttons
        findViewById<Button>(R.id.btnEventSaveButton).setOnClickListener {

            val eName = findViewById<EditText>(R.id.eventName).text.toString()
            // find, getText and store other properties as well for event

            val event = Event(0, eName, "description", "startDate", "EndDate", "StartTime", "EndTIme", "Location")

            viewModel.insertEvent(event)
            finish()


            // Save the announcement
            // Add your save logic here
        }

        findViewById<Button>(R.id.btnEventDiscardButton).setOnClickListener {
            // Discard and close the activity
            finish()
        }
    }
}