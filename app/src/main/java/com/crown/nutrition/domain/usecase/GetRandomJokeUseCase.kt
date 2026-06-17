package com.crown.nutrition.domain.usecase

import com.crown.nutrition.data.repository.JokeRepository
import com.crown.nutrition.domain.model.Joke
import javax.inject.Inject

class GetRandomJokeUseCase @Inject constructor(
    private val jokeRepository: JokeRepository
) {
    suspend operator fun invoke(): Result<Joke> {
        return jokeRepository.getRandomJoke()
    }
}
