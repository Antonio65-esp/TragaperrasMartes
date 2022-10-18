package com.fedeto.tragaperras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jugarBoton = findViewById<Button>(R.id.botoniniciar)
        val botonreglasJuego = findViewById<Button>(R.id.botonreglasjuego)
        val botonSalir = findViewById<Button>(R.id.botonSalir)

        jugarBoton.setOnClickListener {
            startActivity(Intent(this, TableroJuego::class.java))
        }
        botonreglasJuego.setOnClickListener {
            startActivity(Intent(this, ReglasJuego::class.java))
        }
        /*botonSalir.setOnClickListener {
            this; finish(); System.exit(0)
        }*/
        botonSalir.setOnClickListener{System.exit(0)}
    }
}