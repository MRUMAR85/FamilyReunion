package com.example.familyreunion.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.familyreunion.activities.AnnouncementsActivity
import com.example.familyreunion.activities.CommitteDetailActivity
import com.example.familyreunion.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.latestAnnouncementsText.setOnClickListener {
            startActivity(Intent(requireContext(), AnnouncementsActivity::class.java))
        }
        binding.announcementsIcon.setOnClickListener {
            startActivity(Intent(requireContext(), AnnouncementsActivity::class.java))
        }
        binding.profileImage.setOnClickListener {
            startActivity(Intent(requireContext(), AccountFragment::class.java))
        }
        binding.eventsIcon.setOnClickListener {
            startActivity(Intent(requireContext(), CommitteDetailActivity::class.java))
        }
        return view
    }
}
