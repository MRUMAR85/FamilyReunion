package com.example.familyreunion

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.activities.HomeActivity
import com.example.familyreunion.databinding.ActivityLoginTwoBinding
import com.example.familyreunion.repositry.UserRepository
import com.example.familyreunion.roomdb.MainAppDB
import com.example.familyreunion.viewmodels.UserViewModel
import com.example.familyreunion.viewmodels.UserViewModelFactory

class LoginTwoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginTwoBinding
    private val userViewModel: UserViewModel by viewModels {
        UserViewModelFactory(UserRepository(MainAppDB.getDatabase(application).userDao()))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView4.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
        binding.button.setOnClickListener {
            val email = binding.inputField.text.toString()
            val password = binding.inputField1.text.toString()

            userViewModel.login(email, password) { user ->
                if (user != null) {
                    startActivity(Intent(this, HomeActivity::class.java))
                } else {
                    Toast.makeText(this, "Login failed. Check your credentials.", Toast.LENGTH_SHORT).show()
                }
            }
        }
        binding.textView9.setOnClickListener {
            startActivity(Intent(this, ForgetPasswordActivity::class.java))
        }
    }
}
