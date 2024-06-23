package com.example.familyreunion.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.databinding.ActivitySplashThreeBinding

class SplashThreeActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashThreeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.onboardingImage.setOnClickListener {
            startActivity(Intent(this, SplashFourActivity::class.java))
        }
    }
}