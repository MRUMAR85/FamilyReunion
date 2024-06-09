package com.example.familyreunion.activities

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.familyreunion.R
import com.example.familyreunion.databinding.ActivityHomeBinding
import com.example.familyreunion.fragment.HomeFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar?.setBackgroundDrawable(
            ColorDrawable(
                ContextCompat.getColor(
                    this,
                    R.color.colorPrimary
                )
            )
        )
        binding.bottomNavigationView.background = null

        replaceFrags(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            val frag = when(it.itemId){
                R.id.bottomNavHome -> HomeFragment()
                /*  R.id.bottomNavTransactions -> TransactionFragment()
                  R.id.bottomNavBudget -> BudgetFragment()
                  R.id.bottomNavProfile -> ProfileFragment()*/
                else -> HomeFragment()
            }

            replaceFrags(frag)
            true
        }

        // Initialize the floating action button and set click listener
        val floatingActionButton: FloatingActionButton = findViewById(R.id.floatingActionButton)
        floatingActionButton.setOnClickListener {
            // Handle floating action button click
            this.handleFloatingActionButtonClick()
        }
    }

    private fun replaceFrags(frag: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framelayoutHomeActivity, frag)
            commit()
        }
    }

    private fun handleFloatingActionButtonClick() {
        // Code to handle floating action button click
        val options = arrayOf("Add Announcement", "Add New Event")
        AlertDialog.Builder(this)
            .setTitle("Choose an action")
            .setItems(options) { dialog, which ->
                when (which) {
                    0 -> addAnnouncement()
                    1 -> addNewEvent()
                }
            }
            .show()
    }

    private fun addAnnouncement() {
        // Code to add an announcement
        val intent = Intent(this, AddAnnouncementActivity::class.java)
        startActivity(intent)
    }

    private fun addNewEvent() {
        val intent = Intent(this, AddNewEventActivity::class.java)
        startActivity(intent)
        // Code to add a new event
        // For example, start a new activity or show a dialog
    }
}
