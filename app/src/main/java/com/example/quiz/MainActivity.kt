package com.example.quiz


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var compteur: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewCompteur =
            findViewById<TextView>(R.id.textViewCompteur)

        val buttonIncrementer =
            findViewById<Button>(R.id.buttonIncrementer)

        val buttonDecrementer =
            findViewById<Button>(R.id.buttonDecrementer)

        val buttonReinitialiser =
            findViewById<Button>(R.id.buttonReinitialiser)

        fun afficherCompteur() {
            textViewCompteur.text = compteur.toString()
        }

        buttonIncrementer.setOnClickListener {
            compteur++
            afficherCompteur()
        }

        buttonDecrementer.setOnClickListener {
            compteur--
            afficherCompteur()
        }

        buttonReinitialiser.setOnClickListener {
            compteur = 0
            afficherCompteur()
        }

        afficherCompteur()
    }
}
