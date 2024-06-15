package com.example.familyreunion.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.familyreunion.Adapter.RecyclerView.OnboardingAdapter
import com.example.familyreunion.LoginOneActivity
import com.example.familyreunion.R
import com.example.familyreunion.databinding.ActivityOnboardingBinding

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val onboardingLayouts = listOf(
            R.layout.activity_splash_three,
            R.layout.activity_splash_four,
            R.layout.activity_splash_five,
            R.layout.activity_splash_six
        )

        val onboardingAdapter = OnboardingAdapter(onboardingLayouts)
        binding.viewPager.adapter = onboardingAdapter

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == onboardingLayouts.size - 1) {
                    // Last page, show the finish button
                    binding.finishButton.visibility = View.VISIBLE
                } else {
                    binding.finishButton.visibility = View.GONE
                }
            }
        })

        binding.finishButton.setOnClickListener {
            startActivity(Intent(this, LoginOneActivity::class.java))
            finish()
        }
    }
}
