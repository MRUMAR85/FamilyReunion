package com.example.familyreunion.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.familyreunion.databinding.ActivitySplashOneBinding
import com.example.familyreunion.databinding.ActivitySplashTwoBinding

class SplashTwoActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}