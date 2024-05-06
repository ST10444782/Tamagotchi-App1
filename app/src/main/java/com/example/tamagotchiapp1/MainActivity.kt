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

        var health = 0
        var hunger = 100
        var cleanliness = 100

        btnCleaner.setOnClickListener {
            cleanliness += 10
            health += 10
            if (cleanliness<0) {
                cleanliness=0
            }
            if (health>100) health=100
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
            health += 10
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





















