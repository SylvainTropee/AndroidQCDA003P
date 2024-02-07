package com.example.mod10demo1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mod10demo1.databinding.TemplatePlanetLineBinding

class PlanetAdapter(val planets : List<Planet>) : Adapter<PlanetAdapter.PlanetVH>() {

    class PlanetVH(val binding: TemplatePlanetLineBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetVH {
        val binding = TemplatePlanetLineBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PlanetVH(binding)
    }

    override fun getItemCount(): Int {
        return planets.size
    }

    override fun onBindViewHolder(holder: PlanetVH, position: Int) {
       holder.binding.planet = planets[position]
    }
}