package com.example.familyreunion.splash
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.databinding.ActivitySplashOneBinding

class SplashOneActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SplashTwoActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
}
}