package com.example.mod8demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var vm: CounterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val tv = findViewById<TextView>(R.id.tvCounter)

        vm = ViewModelProvider(this)[CounterViewModel::class.java]

        tv.text = vm.counter.toString()

        button.setOnClickListener {
            tv.text = vm.increment().toString()
        }

    }




}