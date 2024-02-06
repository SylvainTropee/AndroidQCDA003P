package com.example.mod9demo1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

enum class Type {
    EAU, FEU, ELEC, PLANTE, VOL, DRAGON
}
@Entity
data class Pokemon(
    @PrimaryKey(true)
    val id: Long = 0,
    val type: Type,
    val name: String,
    @ColumnInfo(name = "power_attack")
    val pa: Int,
    val hp: Int
)
