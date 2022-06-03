package com.example.movie.presentation.movie.list

import androidx.paging.PagingData
import com.example.movie.domain.model.Movie

data class MoviesUiState(
    val query: String = "",
    val movies: PagingData<Movie>? = null,
)
