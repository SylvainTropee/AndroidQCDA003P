package com.example.mod8demo1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var counter = MutableLiveData<Int>(0)

    fun increment() {
        counter.value = counter.value?.inc()
    }

}