package com.example.familyreunion

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.databinding.AcitivityPasswordChangedBinding

class PassowrdChangedActivity : AppCompatActivity() {
    private lateinit var binding: AcitivityPasswordChangedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AcitivityPasswordChangedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            startActivity(Intent(this, LoginTwoActivity::class.java))
        }
    }
}