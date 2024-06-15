package com.example.familyreunion.Adapter.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class OnboardingAdapter(private val layouts: List<Int>) : RecyclerView.Adapter<OnboardingAdapter.OnboardingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return OnboardingViewHolder(view)
    }

    override fun onBindViewHolder(holder: OnboardingViewHolder, position: Int) {
        // Optionally bind data if needed
    }

    override fun getItemCount(): Int {
        return layouts.size
    }

    override fun getItemViewType(position: Int): Int {
        return layouts[position]
    }

    class OnboardingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
