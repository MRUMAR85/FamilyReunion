import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.familyreunion.R
import com.example.familyreunion.roomdb.Event

class EventAdapter(emptyList: List<Any>) : ListAdapter<Event, EventAdapter.EventViewHolder>(EventDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.event_card, parent, false)
        return EventViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event = getItem(position)
        holder.bind(event)
    }

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvEventDate: TextView = itemView.findViewById(R.id.tvEventDate)
        private val tvEventName: TextView = itemView.findViewById(R.id.tvEventName)
        private val tvEventLocation: TextView = itemView.findViewById(R.id.tvEventLocation)
        private val ivEventImage: ImageView = itemView.findViewById(R.id.ivEventImage)

        fun bind(event: Event) {
            tvEventDate.text = event.eventName
            tvEventName.text = event.eventDescription
            tvEventLocation.text = event.location
            // Assuming you have a way to load images, e.g., using Glide or Picasso
            // Glide.with(itemView.context).load(event.imageUrl).into(ivEventImage)
        }
    }

    class EventDiffCallback : DiffUtil.ItemCallback<Event>() {
        override fun areItemsTheSame(oldItem: Event, newItem: Event): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Event, newItem: Event): Boolean {
            return oldItem == newItem
        }
    }
}
