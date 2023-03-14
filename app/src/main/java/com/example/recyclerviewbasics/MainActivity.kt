package com.example.recyclerviewbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAddItem = findViewById<Button>(R.id.btnAddItem)
        val btnRemoveItem = findViewById<Button>(R.id.btnRemove)
        val etItemName = findViewById<TextView>(R.id.etItemName)
        //TODO 3: Get a reference to the recycler view
        //TODO 4: Go to RecyclerAdapter file
        //TODO 12: Set recycler view's layout manager to LinearLayoutManager
        //TODO 13: Initialize an arrayList that represents the recyclerView of generic RecyclerItem
        //TODO 14: set an onClickListener for btnAddItem and add a new RecyclerItem to the arrayList
        //TODO make sure to call rv.adapter?.notifyItemInserted(position) to make recycler display changes
        //TODO 15: set a click listener for btnRemoveItem but use rv.adapter?.notifyItemRemoved(list.size)
        //TODO make sure to check if size is greater than 0
    }
}