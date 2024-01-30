package com.example.mod3demo1

//fonction d'extension
//fun main() {
//
//    fun String.sayHello(){
//        println("Salut $this")
//    }
//    "Michel".sayHello()
//}

//opérateur Elvis, et gestion du null
//fun main() {
//
//    //gestion du null à revoir
//    val name : String? = readlnOrNull()
//
//    //?. tester le null, ?: si null je mets une valeur par défaut
//    val length = name?.length?:0
//
//    println(length)
//}

//liste et lambda
fun main() {

    val colors = mutableListOf<String>("bleu")
    colors += "jaune"
    colors += "jaune"
    colors += "rouge"
    colors += "vert"

    var nbBlue = colors.filter {
        it.length > 4
    }.forEach {
        println(it)
    }

    println(nbBlue)
}











