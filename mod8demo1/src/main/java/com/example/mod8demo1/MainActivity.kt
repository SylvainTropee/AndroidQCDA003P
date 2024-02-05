package com.example.mod8demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.mod8demo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vm: CounterViewModel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button = findViewById<Button>(R.id.button)
        val tv = findViewById<TextView>(R.id.tvCounter)

        vm = ViewModelProvider(this)[CounterViewModel::class.java]
        vm.counter.observe(this){
            binding.vm = vm
        }

        button.setOnClickListener {
            vm.increment()
        }

    }


}