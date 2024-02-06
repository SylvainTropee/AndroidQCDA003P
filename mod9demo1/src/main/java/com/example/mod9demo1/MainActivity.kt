package com.example.mod9demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    val vm: PokemonViewModel by viewModels { PokemonViewModel.Factory }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pika = Pokemon(name = "Pikachu", pa = 1000, hp = 2000, type = Type.ELEC)
        vm.addPokemon(pika).observe(this) {
            Log.i(TAG, "Id du pokemon: $it")
            vm.getPokemonById(it)
        }
        Log.i(TAG, "MainActivity entre 2")
        vm.pokemon.observe(this) { pokemon ->
            Log.i(TAG, pokemon.toString())
        }

    }
}