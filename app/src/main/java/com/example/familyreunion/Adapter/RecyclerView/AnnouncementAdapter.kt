package com.example.familyreunion.Adapter.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.familyreunion.R
import com.example.familyreunion.roomdb.Announcement

class AnnouncementAdapter(private var announcements: List<Announcement>) :

    RecyclerView.Adapter<AnnouncementAdapter.AnnouncementViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnnouncementViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_announcement, parent, false)
        return AnnouncementViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AnnouncementViewHolder, position: Int) {
        val current = announcements[position]
        holder.title.text = current.title
        holder.description.text = current.description
        holder.author.text = current.author
        holder.date.text = current.date
    }

    override fun getItemCount() = announcements.size

     fun updateAnnouncementAdapter(announcements: List<Announcement>)
    {
        this.announcements = announcements
    }


    class AnnouncementViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.tvTitle)
        val description: TextView = itemView.findViewById(R.id.tvDescription)
        val author: TextView = itemView.findViewById(R.id.tvAuthor)
        val date: TextView = itemView.findViewById(R.id.tvDate)
    }
}
