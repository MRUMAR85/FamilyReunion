package com.example.familyreunion.Adapter.RecyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.familyreunion.R

class ChatAdapter(context: Context, messages: List<ChatMessage>) : ArrayAdapter<ChatMessage>(context, 0, messages) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val message = getItem(position)
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.chat_list_item, parent, false)

        val avatar: ImageView = view.findViewById(R.id.avatar)
        val username: TextView = view.findViewById(R.id.username)
        val timestamp: TextView = view.findViewById(R.id.timestamp)
        val messageText: TextView = view.findViewById(R.id.message)

        // Load avatar (you can use libraries like Glide or Picasso)
        avatar.setImageResource(message?.avatarResourceId ?: R.drawable.ic_member1)

        username.text = message?.username
        timestamp.text = message?.timestamp
        messageText.text = message?.message

        return view
    }
}
