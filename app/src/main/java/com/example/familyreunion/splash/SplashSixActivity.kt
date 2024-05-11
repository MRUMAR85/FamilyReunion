package com.example.familyreunion.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.familyreunion.databinding.ActivitySplashSixBinding

class SplashSixActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashSixBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashSixBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}