package com.example.familyreunion.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.familyreunion.databinding.ActivitySplashOneBinding

class SplashOneActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView2.setOnClickListener {
            startActivity(Intent(this, SplashTwoActivity::class.java))
        }
    }
}