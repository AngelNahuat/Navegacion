package com.example.ejemplonavegacionactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//main activity
//

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton= findViewById<Button>(R.id.boton)

        boton.setOnClickListener {
            var intent= Intent(this, ActividadB::class.java)
            intent.putExtra("mensaje", "hacia actividad B")
            startActivity(intent)
        }
    }
}