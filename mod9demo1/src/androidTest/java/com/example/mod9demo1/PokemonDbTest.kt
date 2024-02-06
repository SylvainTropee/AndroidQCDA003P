package com.example.mod9demo1

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class PokemonDbTest {

    lateinit var db: PokemonDatabase

    @Before
    fun createDb() {
        //BDD pour test
        db = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            PokemonDatabase::class.java
        ).build()
    }
    @Test
    fun testInsertPokemon() {
        val pikachu = Pokemon(name = "Pikachu", pa = 1000, hp = 2000, type = Type.ELEC)
        val id = db.getPokemonDAo().insert(pikachu)
        assertTrue("Mauvais pokemon !",
            db.getPokemonDAo().getById(id).name == pikachu.name)
    }
}