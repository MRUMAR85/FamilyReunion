import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.familyreunion.R
import com.example.familyreunion.model.EventViewModelFactory
import com.example.familyreunion.roomdb.EventDatabase
import com.example.familyreunion.viewmodel.EventViewModel
import kotlin.properties.ReadOnlyProperty

class EventFragment : Fragment() {

    private lateinit var rvUpcomingEvents: RecyclerView
    private lateinit var btnCreateEvent: Button
    private lateinit var eventAdapter: EventAdapter
    private val eventViewModel: EventViewModel by viewModels {
        EventViewModelFactory(EventDatabase.getDatabase(requireContext()))
    }

    private fun viewModels(function: () -> EventViewModelFactory): ReadOnlyProperty<EventFragment, EventViewModel> {
        TODO("Not yet implemented")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_event, container, false)

        rvUpcomingEvents = view.findViewById(R.id.rvUpcomingEvents)
        btnCreateEvent = view.findViewById(R.id.btnCreateEvent)

        // Set up RecyclerView
        rvUpcomingEvents.layoutManager = LinearLayoutManager(context)
        eventAdapter = EventAdapter(emptyList()) // Initialize with an empty list
        rvUpcomingEvents.adapter = eventAdapter

        // Observe the event list from the ViewModel
        eventViewModel.eventList.observe(viewLifecycleOwner, Observer { events ->
            events?.let {
                eventAdapter.submitList(it) // Update the adapter with new list
            }
        })

        // Set click listener for the button
        btnCreateEvent.setOnClickListener {
            // Handle create event button click
        }

        return view
    }
}
