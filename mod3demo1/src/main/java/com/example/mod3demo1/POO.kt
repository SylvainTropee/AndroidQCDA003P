package com.example.mod3demo1

enum class Category {
    ACTION, STRATEGY, FANTASY, SPORT, HORROR, MOBA, DEFAULT
}

enum class Format {
    BOOK, MOVIE, SERIE, AUDIOBOOK
}


open class VideoGame(
    var title: String = "Title",
    var category: Category = Category.DEFAULT
) {
    open fun buy(): String {
        return "J'ai acheté $title"
    }
}

class GameAdaptation(
    var format: Format,
    title: String,
    category: Category
) : VideoGame(title, category) {

    override fun buy(): String {
        return super.buy() + " au format $format"
    }
}


fun main() {
//    val ff = VideoGame("Final Fantasy 7", Category.FANTASY)
//    val default = VideoGame()
//    println(ff.buy())
//    println(default.buy())

    val ff = GameAdaptation(Format.MOVIE, "Final Fantasy 7", Category.FANTASY)
    println(ff.buy())
}






