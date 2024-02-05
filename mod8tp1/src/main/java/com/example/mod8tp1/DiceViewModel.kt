package com.example.mod8tp1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {

    var imageId = R.drawable.d1
    var diceValue = 0
    var totalLeft = 0
    var totalRight = 0
    var nbLaunchLeft = 0
    var nbLaunchRight = 0
    var totalLaunch = MutableLiveData(0)

    fun launchLeft(){
        nbLaunchLeft++
        totalLeft += launchDice()
    }

    fun launchRight(){
        nbLaunchRight++
        totalRight += launchDice()
    }

    fun launchDice() : Int {
        diceValue = (1..6).random()
        totalLaunch.value = totalLaunch.value?.inc()

        imageId = when(diceValue){
            1 -> R.drawable.d1
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            else -> R.drawable.d6
        }
        return diceValue
    }




}