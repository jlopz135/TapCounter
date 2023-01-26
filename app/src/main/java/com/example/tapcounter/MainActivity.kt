package com.example.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.buttonClicker)

        button.setOnClickListener {
            Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
        }

        val textView = findViewById<TextView>(R.id.textView3)
        var counter = 0

        button.setOnClickListener {
            counter++
            textView.text = counter.toString()
        }
    }

}