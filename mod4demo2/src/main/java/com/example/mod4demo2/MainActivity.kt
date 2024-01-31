package com.example.mod4demo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val tv = findViewById<TextView>(R.id.tvStateSave)

        button.setOnClickListener {
            tv.text = "Etat sauvegardé !"
            //affichage de notification en bas de page
            Toast.makeText(
                this,
                "Sauvegarde éffectuée !",
                Toast.LENGTH_LONG
            ).show()
        }

    }
}