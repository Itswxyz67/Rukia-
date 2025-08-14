package com.aniwatch.network

import com.aniwatch.network.model.AnimeHomePage
import retrofit2.http.GET

interface ApiService {
    @GET("/")
    suspend fun getHomePage(): AnimeHomePage
}
