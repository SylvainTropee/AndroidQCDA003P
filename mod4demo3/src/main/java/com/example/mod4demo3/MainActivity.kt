package com.example.mod4demo3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mod4demo3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            //récupère le contenu de l'input pour le mettre dans le textview
            binding.tvHello.text = binding.etForm.text.toString()
        }

    }
}