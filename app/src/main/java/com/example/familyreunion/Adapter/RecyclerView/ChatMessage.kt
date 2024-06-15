package com.example.familyreunion.Adapter.RecyclerView

data class ChatMessage(
    val avatarResourceId: Int,  // This can be a URL or resource ID
    val username: String,
    val timestamp: String,
    val message: String
)
