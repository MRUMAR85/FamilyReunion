package com.example.familyreunion.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.familyreunion.R

class EventFragment : Fragment() {

    private lateinit var rvUpcomingEvents: RecyclerView
    private lateinit var btnCreateEvent: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_event, container, false)

        rvUpcomingEvents = view.findViewById(R.id.rvUpcomingEvents)
        btnCreateEvent = view.findViewById(R.id.btnCreateEvent)

        // Set up RecyclerView
        rvUpcomingEvents.layoutManager = LinearLayoutManager(context)
        // Assuming you have a list of events, set the adapter

        // Set click listener for the button
        btnCreateEvent.setOnClickListener {
            // Handle create event button click
        }

        return view
    }

}

