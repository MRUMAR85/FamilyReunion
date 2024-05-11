package com.example.familyreunion.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.familyreunion.databinding.ActivitySplashOneBinding

class SplashOneActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}