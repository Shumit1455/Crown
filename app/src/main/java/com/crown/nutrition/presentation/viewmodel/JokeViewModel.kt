package com.crown.nutrition.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.crown.nutrition.domain.model.Joke
import com.crown.nutrition.domain.usecase.GetRandomJokeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class JokeUiState(
    val joke: Joke? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)

@HiltViewModel
class JokeViewModel @Inject constructor(
    private val getRandomJokeUseCase: GetRandomJokeUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(JokeUiState())
    val uiState: StateFlow<JokeUiState> = _uiState.asStateFlow()

    fun fetchRandomJoke() {
        viewModelScope.launch {
            _uiState.value = JokeUiState(isLoading = true)
            val result = getRandomJokeUseCase()
            result.onSuccess { joke ->
                _uiState.value = JokeUiState(joke = joke, isLoading = false)
            }.onFailure { exception ->
                _uiState.value = JokeUiState(
                    isLoading = false,
                    error = exception.message ?: "Unknown error occurred"
                )
            }
        }
    }

    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }
}
