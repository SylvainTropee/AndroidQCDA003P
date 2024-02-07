package com.example.mod11demo1

import com.squareup.moshi.Json
data class Joke(
    val id: String,
    @Json(name = "url")
    val jokeUrl: String,
    val value: String
)
