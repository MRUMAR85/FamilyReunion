package com.example.familyreunion.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.databinding.ActivitySplashFourBinding

class SplashFourActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashFourBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashFourBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView1.setOnClickListener {
            startActivity(Intent(this, SplashFiveActivity::class.java))        }
    }
}