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
    }
}