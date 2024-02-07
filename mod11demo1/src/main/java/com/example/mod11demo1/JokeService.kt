package com.example.mod11demo1

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface JokeService {
    companion object {

        val BASE_URL = "https://api.chucknorris.io/jokes/"

        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

        val retrofit =
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create(moshi)).build()
    }

    @GET("random")
    suspend fun getRandomFact(): Joke

    @GET("{id}")
    suspend fun getJokeById(@Path("id") id: String): Joke

    @POST("add")
    suspend fun addNewJoke(@Body joke: Joke)


    object JokeApi {
        val retrofitService by lazy { retrofit.create(JokeService::class.java) }
    }

}