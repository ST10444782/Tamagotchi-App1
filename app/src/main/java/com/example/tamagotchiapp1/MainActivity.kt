package com.example.tamagotchiapp1


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) { 
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val txtHunger = findViewById<TextView>(R.id.txtHunger)
        val txtHealth = findViewById<TextView>(R.id.txtHealth)
        val txtClean = findViewById<TextView>(R.id.txtClean)
        val btnCleaner = findViewById<Button>(R.id.btnCleaner)
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val petImage = findViewById<ImageView>(R.id.imageView)

        var health = 0 // The IIE 2024. Declaring Variables[IMAD5111 Module Manual]
        var hunger = 100
        var cleanliness = 100

        btnCleaner.setOnClickListener {
            cleanliness += 10
            health += 10// www.w3Schools.com/kotlin/index.php
            if (cleanliness<0) {
                cleanliness=0
            }
            if (health>100) health=100 // The IIE 2024.if Statements[IMAD5111 Module Manual]
            petImage.setImageResource(R.drawable.dobbermanbathing)
            txtHealth.text = "Health: $health"
            txtClean.text = "clean pet: $cleanliness"
            txtHunger.text = "Hunger: $hunger"

        }
        btnFeed.setOnClickListener {
            hunger -= 10
            health += 10
            if (hunger<0) {
                hunger=0

            }
            if (health>100)  {
                health=100

            }
            petImage.setImageResource(R.drawable.dobermanfeeding)
            txtHealth.text = "Health: $health"
            txtClean.text = "clean pet: $cleanliness"
            txtHunger.text = "Hunger: $hunger"


        }
        btnPlay.setOnClickListener {
            health += 10// The IIE 2024 Arithmetic Operators
            hunger += 10
            cleanliness -= 10
            if (hunger>100) hunger=100
            if (health>100) health=100
            if (cleanliness<0) cleanliness=0
            petImage.setImageResource(R.drawable.dobbermanplaying)
            txtHealth.text = "Health: $health"
            txtClean.text = "clean pet: $cleanliness"
            txtHunger.text = "Hunger: $hunger"

        }



    }


}
// The  IIE .2024. IF Statements[ IPRG5111 Module Manual]
// www.w3Schools.com/kotlin/index. php
// The IIE. 2024. Declaring Variables[ IMAD5111 Module Manual]
// The IIE.2024. Arithmeic  Operators [IMAD5111 Module Manual]




















