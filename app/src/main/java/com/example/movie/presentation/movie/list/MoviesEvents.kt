package com.example.movie.presentation.movie.list

sealed class MoviesEvents {

    object GetMovies : MoviesEvents()
    object SearchMovies : MoviesEvents()
    data class UpdateQuery(val query: String): MoviesEvents()
}
