package com.example.familyreunion.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.LoginOneActivity
import com.example.familyreunion.databinding.ActivitySplashSixBinding

class SplashSixActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashSixBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashSixBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.setOnClickListener {
            startActivity(Intent(this, LoginOneActivity::class.java))
        }
    }
}