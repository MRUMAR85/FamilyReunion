package com.example.familyreunion.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.familyreunion.databinding.ActivitySplashOneBinding
import com.example.familyreunion.databinding.ActivitySplashThreeBinding

class SplashThreeActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashThreeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}