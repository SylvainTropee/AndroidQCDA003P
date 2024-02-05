package com.example.mod8tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mod8tp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var vm : DiceViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        vm = ViewModelProvider(this)[DiceViewModel::class.java]

        vm.totalLaunch.observe(this){
            binding.vm = vm
        }

        binding.buttonLeft.setOnClickListener {
            vm.launchLeft()
        }
        binding.buttonRight.setOnClickListener {
            vm.launchRight()
        }


    }
}