package com.example.familyreunion.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.familyreunion.databinding.ActivitySplashTwoBinding

class SplashTwoActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, SplashThreeActivity::class.java)
                startActivity(intent)
                finish()
            }, 3000)

        }
    }