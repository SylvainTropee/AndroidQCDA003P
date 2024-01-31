package com.example.mod4demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = "Hello dude"

        val tv = findViewById<TextView>(R.id.tvHelloWorld)
        tv.text = text

    }
}