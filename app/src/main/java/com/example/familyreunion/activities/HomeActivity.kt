package com.example.familyreunion.activities
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.familyreunion.R
import com.example.familyreunion.databinding.ActivityHomeBinding
import com.example.familyreunion.fragment.HomeFragment

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
    }
    private fun replaceFrags(frag : Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framelayoutHomeActivity, frag)
            commit()
        }
    }
}