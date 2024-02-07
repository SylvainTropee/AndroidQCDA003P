package com.example.mod10demo1

enum class Type{
    CARBON, HOT, ICE, GAS_GIANT, OCEAN, ROCKY, DWARF
}
data class Planet(
    val name : String,
    val color : String,
    val mass : Float,
    val type : Type,
    val diameter : Float
)
