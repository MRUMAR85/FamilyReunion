package com.example.familyreunion.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.activities.OnboardingActivity
import com.example.familyreunion.databinding.ActivitySplashTwoBinding

class SplashTwoActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, OnboardingActivity::class.java)
                startActivity(intent)
                finish()
            }, 3000)

        }
    }