package com.example.movie.domain.usecase

import androidx.paging.PagingData
import com.example.movie.domain.model.Movie
import com.example.movie.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchMoviesUseCase
@Inject
constructor(
    private val movieRepository: MovieRepository,
) {

    operator fun invoke(query: String): Flow<PagingData<Movie>>
    = movieRepository.searchMovies(query)
}