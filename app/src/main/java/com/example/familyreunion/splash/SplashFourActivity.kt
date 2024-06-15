package com.example.familyreunion.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.familyreunion.databinding.ActivitySplashFourBinding

class SplashFourActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashFourBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashFourBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView3.setOnClickListener {
            startActivity(Intent(this, SplashFiveActivity::class.java))        }
    }
}