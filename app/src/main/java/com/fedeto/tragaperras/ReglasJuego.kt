package com.fedeto.tragaperras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ReglasJuego : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reglas_juego)

        val botonVolver = findViewById<Button>(R.id.botonVolver3)

        botonVolver.setOnClickListener {
            startActivity(Intent(this, TableroJuego::class.java))
        }

    }
}