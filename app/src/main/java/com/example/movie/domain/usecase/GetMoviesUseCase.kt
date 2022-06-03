package com.example.movie.domain.usecase

import androidx.paging.PagingData
import com.example.movie.domain.model.Movie
import com.example.movie.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMoviesUseCase
@Inject
constructor(
    private val movieRepository: MovieRepository
    ) {

    operator fun invoke(): Flow<PagingData<Movie>> = movieRepository.getMovies()


/*flow {
        try {
            emit(DataState.Loading())
            val movies = movieRepository.getMovies(page)
            emit(DataState.Success(movies))
        } catch (e: Exception) {
            emit(DataState.Error("Check your internet connection!"))
        }
    }*/
}