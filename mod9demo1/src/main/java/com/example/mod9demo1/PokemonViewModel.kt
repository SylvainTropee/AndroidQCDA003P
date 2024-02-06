package com.example.mod9demo1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokemonViewModel(val pokemonDAO: PokemonDAO) : ViewModel() {

    var pokemon = MutableLiveData<Pokemon>()

    fun getPokemonById(id: Long) {
        //Dispatchers.IO permet de lancer sur des threads secondaires
        viewModelScope.launch(Dispatchers.IO) {
            pokemon.postValue(pokemonDAO.getById(id))
        }
    }
    fun addPokemon(pokemon: Pokemon): MutableLiveData<Long> {
        val pokeId = MutableLiveData<Long>()
        viewModelScope.launch(Dispatchers.IO) {
            pokeId.postValue(pokemonDAO.insert(pokemon))
        }
        return pokeId
    }

    companion object {

        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {

            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {

                val context = checkNotNull(extras[APPLICATION_KEY])
                return PokemonViewModel(
                    PokemonDatabase.getInstance(context).getPokemonDAo()
                ) as T
            }
        }
    }
}