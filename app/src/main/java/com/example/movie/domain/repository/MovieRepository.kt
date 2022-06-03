package com.example.movie.domain.repository

import androidx.paging.PagingData
import com.example.movie.domain.model.Movie
import com.example.movie.domain.model.MovieDetail
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    fun getMovies(): Flow<PagingData<Movie>>
    fun searchMovies(query: String): Flow<PagingData<Movie>>
    suspend fun getMovieDetail(movieId: Int): MovieDetail
}