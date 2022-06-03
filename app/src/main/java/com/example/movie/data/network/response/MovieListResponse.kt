package com.example.movie.data.network.response

import com.google.gson.annotations.SerializedName
import com.example.movie.data.network.dto.MetaDataDto
import com.example.movie.data.network.dto.movie.MovieDto

data class MovieListResponse(
    @SerializedName("data")
    val movies: List<MovieDto>,

    @SerializedName("metadata")
    val metaData: MetaDataDto
    )