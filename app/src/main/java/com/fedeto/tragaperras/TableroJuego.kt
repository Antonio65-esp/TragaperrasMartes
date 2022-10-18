package com.fedeto.tragaperras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TableroJuego : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablero_juego)

        val botonJugar = findViewById<Button>(R.id.botonJugar)
        val botonMasCreditos = findViewById<Button>(R.id.botonMasCredito)
        val creditos = findViewById<TextView>(R.id.tvCredito)
        val botonVolver = findViewById<Button>(R.id.botonVolver2)

        val estr1 = findViewById<ImageView>(R.id.estrella1)
        val mas1 = findViewById<ImageView>(R.id.mas1)
        val punt1 = findViewById<ImageView>(R.id.puntoRojo1)
        val mic1 = findViewById<ImageView>(R.id.microVerde1)
        val cam1 = findViewById<ImageView>(R.id.camaraAmbar1)
        val estr2 = findViewById<ImageView>(R.id.estrella2)
        val mas2 = findViewById<ImageView>(R.id.mas2)
        val punt2 = findViewById<ImageView>(R.id.puntoRojo2)
        val mic2 = findViewById<ImageView>(R.id.microVerde2)
        val cam2 = findViewById<ImageView>(R.id.camaraAmbar2)
        val estr3 = findViewById<ImageView>(R.id.estrella3)
        val mas3 = findViewById<ImageView>(R.id.mas3)
        val punt3 = findViewById<ImageView>(R.id.puntoRojo3)
        val mic3 = findViewById<ImageView>(R.id.microVerde3)
        val cam3 = findViewById<ImageView>(R.id.camaraAmbar3)

        var vent1 = arrayOf(estr1, mas1, punt1, mic1, cam1).random()
        var vent2 = arrayOf(estr2, mas2, punt2, mic2, cam2).random()
        var vent3 = arrayOf(estr3, mas3, punt3, mic3, cam3).random()

        botonVolver.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

   /* fun credito() {
        botonMasCreditos.setOnClickListener {
            creditos.
        }*/
    }
    /*fun jugar (){
        botonJugar.setOnClickListener {
            vent1.setVisibility(View.VISIBLE)
            vent2.setVisibility(View.VISIBLE)
            vent2.setVisibility(View.VISIBLE)
        }
    }*/
}