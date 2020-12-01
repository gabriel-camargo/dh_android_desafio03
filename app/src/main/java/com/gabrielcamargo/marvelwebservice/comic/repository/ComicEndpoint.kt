package com.gabrielcamargo.marvelwebservice.comic.repository

import com.gabrielcamargo.marvelwebservice.comic.model.ComicModel
import com.gabrielcamargo.marvelwebservice.data.api.NetworkUtils
import com.gabrielcamargo.marvelwebservice.data.model.ResponseModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ComicEndpoint {

    @GET("comics")
    suspend fun get(
        @Query("ts") ts: String?,
        @Query("hash") hash: String?,
        @Query("apikey") apikey: String?,
    ): ResponseModel<ComicModel>

    companion object {
        val endpoint: ComicEndpoint by lazy {
            NetworkUtils.getRetrofitInstance().create(ComicEndpoint::class.java)
        }
    }
}