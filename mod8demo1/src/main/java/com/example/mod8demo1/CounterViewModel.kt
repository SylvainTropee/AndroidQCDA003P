package com.example.mod8demo1

import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var counter = 0

    fun increment(): Int {
        return ++counter
    }

}