package com.crown.nutrition.data.repository

import com.crown.nutrition.data.remote.JokeApiService
import com.crown.nutrition.domain.model.Joke
import javax.inject.Inject

class JokeRepository @Inject constructor(
    private val jokeApiService: JokeApiService
) {
    suspend fun getRandomJoke(): Result<Joke> = try {
        val response = jokeApiService.getRandomJoke()
        if (response.error) {
            Result.failure(Exception("Failed to fetch joke"))
        } else {
            val jokeText = response.joke ?: "${response.setup}\n${response.punchline}"
            Result.success(
                Joke(
                    id = response.id,
                    text = jokeText,
                    type = response.type
                )
            )
        }
    } catch (e: Exception) {
        Result.failure(e)
    }
}
