package com.example.familyreunion

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.familyreunion.databinding.ActivitySignupBinding
import com.example.familyreunion.repositry.UserRepository
import com.example.familyreunion.roomdb.MainAppDB
import com.example.familyreunion.roomdb.User
import com.example.familyreunion.viewmodels.UserViewModel
import com.example.familyreunion.viewmodels.UserViewModelFactory

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    private val userViewModel: UserViewModel by viewModels {
        UserViewModelFactory(UserRepository(MainAppDB.getDatabase(application).userDao()))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val fullName = binding.enterName.text.toString()
            val email = binding.enterName1.text.toString()
            val password = binding.enterName2.text.toString()

            if (fullName.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
                val user = User(fullName = fullName, email = email, password = password)
                userViewModel.register(user) { userId ->
                    if (userId > 0) {
                        Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this, LoginTwoActivity::class.java))
                    } else {
                        Toast.makeText(this, "Registration failed!", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
