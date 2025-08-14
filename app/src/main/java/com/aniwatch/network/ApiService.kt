package com.aniwatch.network

import com.aniwatch.network.model.AnimeHomePage
import retrofit2.http.GET

interface ApiService {
    @GET("api/v2/hianime/home")
    suspend fun getHomePage(): AnimeHomePage
}
