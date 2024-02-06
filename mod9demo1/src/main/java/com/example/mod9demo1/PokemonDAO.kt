package com.example.mod9demo1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PokemonDAO {

    @Insert
    fun insert(pokemon: Pokemon) : Long

    @Update
    fun update(pokemon: Pokemon)

    @Delete
    fun delete(pokemon: Pokemon)

    @Query("DELETE FROM Pokemon WHERE  type = :type")
    fun deleteByType(type : Type)

    @Query("SELECT * FROM Pokemon WHERE id = :id")
    fun getById(id : Long) : Pokemon






















}