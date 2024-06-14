import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.familyreunion.R
import com.example.familyreunion.roomdb.Event

class EventAdapter(private val events: List<Event>) : RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.event_card, parent, false)
        return EventViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


    override fun getItemCount() = events.size

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvEventDate: TextView = itemView.findViewById(R.id.tvEventDate)
        val tvEventName: TextView = itemView.findViewById(R.id.tvEventName)
        val tvEventLocation: TextView = itemView.findViewById(R.id.tvEventLocation)
        val ivEventImage: ImageView = itemView.findViewById(R.id.ivEventImage)
    }
}
