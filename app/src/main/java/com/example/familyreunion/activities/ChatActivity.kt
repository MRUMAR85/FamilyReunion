package com.example.familyreunion.activities
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.Adapter.RecyclerView.ChatAdapter
import com.example.familyreunion.Adapter.RecyclerView.ChatMessage
import com.example.familyreunion.R
import com.example.familyreunion.databinding.ActivityCommitteeBinding

class ChatActivity : AppCompatActivity() {
private lateinit var binding: ActivityCommitteeBinding
    private lateinit var chatListView: ListView
    private lateinit var messageInput: EditText
    private lateinit var sendButton: ImageView
    private lateinit var chatAdapter: ArrayAdapter<ChatMessage>

    private val messages: MutableList<ChatMessage> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_chat)
        binding.backButton.setOnClickListener {
            startActivity(Intent(this, CommitteDetailActivity::class.java))

        }
        chatListView = findViewById(R.id.chat_list)
        messageInput = findViewById(R.id.message_input)
        sendButton = findViewById(R.id.send_button)

        chatAdapter = ChatAdapter(this, messages)
        chatListView.adapter = chatAdapter

        sendButton.setOnClickListener {
            val messageText = messageInput.text.toString()
            if (messageText.isNotEmpty()) {
                val newMessage = ChatMessage(
                    avatarResourceId = R.drawable.ic_member1,
                    username = "You",
                    timestamp = "Now",
                    message = messageText
                )
                messages.add(newMessage)
                chatAdapter.notifyDataSetChanged()
                messageInput.text.clear()
            }
        }
    }
}
