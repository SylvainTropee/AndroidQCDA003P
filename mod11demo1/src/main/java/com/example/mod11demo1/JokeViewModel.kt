package com.example.mod11demo1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class JokeViewModel : ViewModel() {

    val joke = MutableLiveData<Joke>()
    fun getRandomJoke(): MutableLiveData<Joke> {
        viewModelScope.launch(Dispatchers.IO) {
            joke.postValue(JokeService.JokeApi.retrofitService.getRandomFact())
        }
        return joke
    }


}