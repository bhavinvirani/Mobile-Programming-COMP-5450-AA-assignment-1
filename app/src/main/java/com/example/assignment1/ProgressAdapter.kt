package com.example.assignment1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProgressAdapter(private var progressList: List<String>) : RecyclerView.Adapter<ProgressAdapter.ProgressViewHolder>() {

    inner class ProgressViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val progressTextView: TextView = itemView.findViewById(R.id.progressTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgressViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.progress_item, parent, false)
        return ProgressViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProgressViewHolder, position: Int) {
        val currentProgress = progressList[position]
        holder.progressTextView.text = currentProgress
    }

    override fun getItemCount() = progressList.size

    fun updateProgress(newProgressList: List<String>) {
        progressList = newProgressList
        notifyDataSetChanged()
    }
}