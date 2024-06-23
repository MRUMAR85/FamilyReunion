package com.example.familyreunion.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.databinding.ActivitySplashFiveBinding

class SplashFiveActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashFiveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashFiveBinding.inflate(layoutInflater)
        binding.textView.setOnClickListener {
            startActivity(Intent(this, SplashSixActivity::class.java))
        }
    }
}