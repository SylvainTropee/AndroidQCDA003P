package com.example.mod3demo1

//if
//fun main() {
//    val age = 18
//
//    val message = if (age >= 18) {
//        "Majeur !"
//    } else {
//        "Mineur !"
//    }
//    println(message)
//}

//when
//fun main() {
//
//    val age = 50
//    when(age){
//        1,2 -> println("C'est un bébé !")
//        in 1..17 -> println("C'est un mineur !")
//        is Int -> println("C'est un entier !")
//        else -> println("c'est autre chose !")
//    }
//}


//boucles
fun main() {
//
//    for (i in 1..10){
//        println(i)
//    }
//
//    //downTo pour décrémenter, step pour choisir le pas
//    for(j in 10 downTo 1 step 2){
//        println(j)
//    }
//
//    val cities = arrayOf("Quimper", "Rennes", "Nantes", "Niort")
//
//    for(city in cities){
//        println(city)
//    }

    val list = List(30) {id ->
        "Item $id"
    }

    for (item in list) {
        println(item)
    }

}








