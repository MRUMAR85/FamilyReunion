package com.example.familyreunion.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.familyreunion.databinding.ActivitySplashFourBinding
import com.example.familyreunion.databinding.ActivitySplashOneBinding

class SplashFourActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashFourBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashFourBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}