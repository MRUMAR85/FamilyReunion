package com.example.familyreunion
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.databinding.ActivityLoginOneBinding

class LoginOneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            startActivity(Intent(this, LoginTwoActivity::class.java))
        }

    }
}