package com.example.familyreunion

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.activities.HomeActivity
import com.example.familyreunion.databinding.ActivityLoginTwoBinding

class LoginTwoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView4.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))}
            binding.button.setOnClickListener {
                startActivity(Intent(this, HomeActivity::class.java))}
                binding.textView9.setOnClickListener {
                    startActivity(Intent(this, ForgetPasswordActivity::class.java))
                }

        }
    }
