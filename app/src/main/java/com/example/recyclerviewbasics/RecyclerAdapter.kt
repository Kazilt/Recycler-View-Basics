package com.example.recyclerviewbasics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val list:ArrayList<RecyclerItem>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = list[position]
        holder.itemText.text = currentItem.text
        holder.itemImage.setImageResource(currentItem.src)

    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val itemText = itemView.findViewById<TextView>(R.id.tvItemText)
        val itemImage = itemView.findViewById<ImageView>(R.id.ivItemImage)

    }
}