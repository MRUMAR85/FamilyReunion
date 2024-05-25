package com.example.familyreunion.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.databinding.ActivityCommitteDetailBinding

class CommitteDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCommitteDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommitteDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.groupChatButton.setOnClickListener {
            startActivity(Intent(this, ChatActivity::class.java))

        }
    }
}