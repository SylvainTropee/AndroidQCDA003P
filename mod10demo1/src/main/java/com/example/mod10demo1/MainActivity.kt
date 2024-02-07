package com.example.mod10demo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val planets = listOf(
            Planet("Mercury", "Gray", 0.33f, Type.ROCKY, 4879.4f),
            Planet("Venus", "Yellow", 4.87f, Type.HOT, 12104f),
            Planet("Earth", "Blue", 5.97f, Type.OCEAN, 12742f),
            Planet("Mars", "Red", 0.642f, Type.ROCKY, 6779f),
            Planet("Jupiter", "Orange", 1898f, Type.GAS_GIANT, 139820f),
            Planet("Saturn", "Yellow", 568f, Type.GAS_GIANT, 116460f),
            Planet("Uranus", "Blue", 86.8f, Type.ICE, 50724f),
            Planet("Neptune", "Blue", 102f, Type.ICE, 49244f),
            Planet("Pluto", "Brown", 0.0146f, Type.ICE, 2370f),
            Planet("Eris", "Brown", 0.0028f, Type.ICE, 2326f),
            Planet("Haumea", "Brown", 0.0007f, Type.DWARF, 1920f),
            Planet("Makemake", "Red", 0.00067f, Type.DWARF, 1430f),
            Planet("Ceres", "Brown", 0.00015f, Type.DWARF, 590f),
            Planet("Kepler-186f", "Unknown", 0.0038f, Type.ROCKY, 11835f),
            Planet("HD 209458 b", "Blue", 0.69f, Type.HOT, 119400f),
            Planet("TrES-2b", "Black", 1.5f, Type.HOT, 112000f),
            Planet("Gliese 436 b", "Red", 0.078f, Type.ICE, 6175f),
            Planet("55 Cancri e", "Yellow", 8.63f, Type.ROCKY, 12104f),
            Planet("KELT-9b", "Blue", 2.88f, Type.HOT, 1430f),
            Planet("OGLE-2005-BLG-390Lb", "Unknown", 0.005f, Type.ICE, 20879f)
        )

        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.adapter = PlanetAdapter(planets) { name ->
            Intent(this, TargetActivity::class.java).also { intent ->
                intent.putExtra("name", name)
                startActivity(intent)
            }
        }
        recycler.layoutManager = LinearLayoutManager(this)
        //recycler.layoutManager = GridLayoutManager(this, 3)

    }


}