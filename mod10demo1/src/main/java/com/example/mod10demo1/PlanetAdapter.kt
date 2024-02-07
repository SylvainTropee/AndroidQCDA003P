package com.example.mod10demo1

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mod10demo1.databinding.TemplatePlanetLineBinding

class PlanetAdapter(val planets: List<Planet>, val listener : (name : String) -> Unit ) : Adapter<PlanetAdapter.PlanetVH>() {

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
        //itemView qui permet d'accéder au container de l'item
        holder.itemView.setOnClickListener {
            //listener.invoke()
            listener(planets[position].name)
        }
    }
}









