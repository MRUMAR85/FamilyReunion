package com.example.familyreunion.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.familyreunion.databinding.ActivitySplashFiveBinding

class SplashFiveActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashFiveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashFiveBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}