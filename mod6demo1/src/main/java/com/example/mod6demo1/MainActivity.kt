package com.example.mod6demo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonToTarget).setOnClickListener {
            Intent(this, TargetActivity::class.java).also {
                it.putExtra("temperature", 10)
                startActivity(it)
            }

        }

    }
}