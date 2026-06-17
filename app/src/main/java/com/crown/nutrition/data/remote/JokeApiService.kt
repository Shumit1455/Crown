package com.crown.nutrition.data.remote

import retrofit2.http.GET
import com.crown.nutrition.data.remote.models.JokeResponse

interface JokeApiService {
    @GET("jokes/random")
    suspend fun getRandomJoke(): JokeResponse
}
