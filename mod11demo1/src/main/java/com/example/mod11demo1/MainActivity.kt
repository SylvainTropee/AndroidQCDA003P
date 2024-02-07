package com.example.mod11demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var vm: JokeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm = ViewModelProvider(this)[JokeViewModel::class.java]

        vm.getRandomJoke().observe(this) {
            findViewById<TextView>(R.id.tvJoke).text = it.value
        }


    }
}
