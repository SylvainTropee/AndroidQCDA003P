package com.example.mod3tp

import java.math.BigInteger

fun main() {
//    sissa()
//    average()
    average2()

}

fun average2() {
    println("Note (-1 pour terminer)")

    val noteList = mutableListOf<Float>()
    val STOP = -1f
    var i = 0
    do {
        println("Note " + ++i)
        val value = readln().toFloat()
        if(value != STOP){
            noteList += value
        }

    }while (value != STOP)

    val average = noteList.average()
    println("La moyenne est de $average")


}

fun average(){

    println("Entrez le nombre de valeurs :")

    val nbNotes = readln().toInt()
    val noteList = mutableListOf<Float>()

    for(i in 1..nbNotes){
        println("Note $i :")
        val value = readln().toFloat()
        noteList.add(value)
    }
    val average = noteList.average()
    println("La moyenne est de $average")
}

fun sissa() {

//    var nbSeed: BigInteger = 1.toBigInteger()
//    var nbCases = 64
//
//    for(i in 1..nbCases){
//        nbSeed *= 2.toBigInteger()
//    }

    var nbSeed = 1f
    var nbCases = 64

    for(i in 1..nbCases){
        nbSeed *= 2f
    }

    println("Nombre de grains de riz = $nbSeed")

}