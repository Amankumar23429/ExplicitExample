package com.example.explicitexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hello_buttom = findViewById<Button>(R.id.start_button)
        hello_buttom.setOnClickListener {
            val intent = Intent(this,HelloActivity::class.java).apply{
                putExtra("Name", "JOHN")
            }
            startActivity(intent)
        }
    }
}