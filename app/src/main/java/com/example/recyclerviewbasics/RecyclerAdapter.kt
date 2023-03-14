package com.example.recyclerviewbasics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//TODO 5: Make class constructor take in one argument (call it list) of type ArrayList<RecyclerItem>, pass as an arg to the class
//TODO 6: Make class extend RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() (use : in kotlin)

class RecyclerAdapter() {
    //TODO 7: Go to rv_item_xml and do the next TODO there, come back after
    //TODO 7.5: Go to RecyclerItem, come back after
    //TODO 8: create a nested class called ViewHolder that takes in one arg of type View and
    //TODO extends RecyclerView.ViewHolder(itemView), then set new vals itemText and itemImage to their respective textview and img View
    //TODO 9: override onCreateViewHolder, return a ViewHolder of a LayoutInflater (make sure to use .from and .inflate)
    //TODO inflate has args (R.layout.rv_item, parent, false)
    //TODO 10: override getItemCount, return the size of the list
    //TODO 11: override onBindViewHolder, get the item from list and change holder's text
    //TODO and image to the item's text and image (use .setImageResource), go to MainActivity
}