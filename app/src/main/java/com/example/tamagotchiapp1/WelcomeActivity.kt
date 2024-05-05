package com.example.tamagotchiapp1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
    }

}
