package com.example.familyreunion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.familyreunion.databinding.ActivityLoginOneBinding

class LoginOneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}