package com.example.movie.presentation.movie.detail

import com.example.movie.domain.model.MovieDetail

data class MovieDetailUiState(
    val isLoading: Boolean = false,
    val movieDetail: MovieDetail? = null,
    val errorMessage: String? = null
)
