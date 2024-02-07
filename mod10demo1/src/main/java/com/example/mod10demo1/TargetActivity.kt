package com.example.mod10demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        val planetName = intent.getStringExtra("name")
        findViewById<TextView>(R.id.tvPlanetName).text = planetName
    }
}