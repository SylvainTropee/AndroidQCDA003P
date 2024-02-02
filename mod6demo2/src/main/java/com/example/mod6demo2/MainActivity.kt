package com.example.mod6demo2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Intent(Intent.ACTION_VIEW, Uri.parse("geo:47.97, -4.08")).also {
            startActivity(it)
        }

    }
}