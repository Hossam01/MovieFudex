package com.example.movie.presentation.movie.detail

sealed class MovieDetailEvents{

    data class GetMovieDetail(val movieId: Int) : MovieDetailEvents()

    object Refresh: MovieDetailEvents()
}
