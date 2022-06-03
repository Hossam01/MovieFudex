package com.example.movie.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.movie.data.network.MovieApi
import com.example.movie.data.network.dto.movie.MovieDtoMapper
import com.example.movie.data.network.dto.moviedetail.MovieDetailDtoMapper
import com.example.movie.domain.model.Movie
import com.example.movie.domain.model.MovieDetail
import com.example.movie.domain.repository.MovieRepository
import com.example.movie.domain.util.Constants.Companion.PAGINATION_PAGE_SIZE
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieRepositoryImpl
@Inject
constructor(
    private val api: MovieApi,
    private val movieDtoMapper: MovieDtoMapper,
    private val movieDetailDtoMapper: MovieDetailDtoMapper
    ): MovieRepository {

    override fun getMovies(): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(PAGINATION_PAGE_SIZE),
            pagingSourceFactory = { MoviePagingSource(api,movieDtoMapper) }
        ).flow
    }

    override fun searchMovies(query: String): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(PAGINATION_PAGE_SIZE),
            pagingSourceFactory = { MoviePagingSource(api,movieDtoMapper,query) }
        ).flow
    }

    override suspend fun getMovieDetail(movieId: Int): MovieDetail {
        return movieDetailDtoMapper
            .mapToDomainModel(
                api.getMovieDetail(movieId)
            )
    }
}