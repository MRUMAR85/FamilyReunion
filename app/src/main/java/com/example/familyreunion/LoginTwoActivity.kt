package com.example.familyreunion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.familyreunion.databinding.ActivityLoginTwoBinding

class LoginTwoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
