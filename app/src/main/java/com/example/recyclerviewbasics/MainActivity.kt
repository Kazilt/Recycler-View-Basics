package com.example.recyclerviewbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var next = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAddItem = findViewById<Button>(R.id.btnAddItem)
        val btnRemoveItem = findViewById<Button>(R.id.btnRemove)
        val etItemName = findViewById<TextView>(R.id.etItemName)
        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        val list = ArrayList<RecyclerItem>()
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = RecyclerAdapter(list)
        btnAddItem.setOnClickListener {
            val src: Int = if (next) {
                R.drawable.car
            } else {
                R.drawable.bus
            }
            list.add(RecyclerItem(etItemName.text.toString(), src))
            rv.adapter?.notifyItemInserted(list.size)
            next = !next
        }
        btnRemoveItem.setOnClickListener {
            if (list.size > 0) {
                list.removeAt(list.size - 1)
                rv.adapter?.notifyItemRemoved(list.size)
            }



        }

    }
}