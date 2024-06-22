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
import com.example.familyreunion.viewmodel.EventViewModel
import kotlin.properties.ReadOnlyProperty

class EventFragment : Fragment() {

    private lateinit var rvUpcomingEvents: RecyclerView
    private lateinit var btnCreateEvent: Button
    private lateinit var eventAdapter: EventAdapter
    private lateinit var val viewModel: EventViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this)[EventViewModel::class.java]

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_event, container, false)


        // Set click listener for the button
        btnCreateEvent.setOnClickListener {
            // Handle create event button click
        }

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        rvUpcomingEvents = view.findViewById(R.id.rvUpcomingEvents)
        btnCreateEvent = view.findViewById(R.id.btnCreateEvent)

        // Set up RecyclerView
        eventAdapter = EventAdapter(emptyList()) // Initialize with an empty list
        rvUpcomingEvents.adapter = eventAdapter

        rvUpcomingEvents.layoutManager = LinearLayoutManager(context)


        // Observe the event list from the ViewModel
        eventViewModel.eventList.observe(viewLifecycleOwner, Observer { events ->
            events?.let {
                eventAdapter.submitList(it) // Update the adapter with new list
            }
        })

    }
}
