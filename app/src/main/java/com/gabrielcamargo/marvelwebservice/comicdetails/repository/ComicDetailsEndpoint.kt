package com.gabrielcamargo.marvelwebservice.comicdetails.repository

import com.gabrielcamargo.marvelwebservice.comic.model.ComicModel
import com.gabrielcamargo.marvelwebservice.comic.repository.ComicEndpoint
import com.gabrielcamargo.marvelwebservice.data.api.NetworkUtils
import com.gabrielcamargo.marvelwebservice.data.model.ResponseModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ComicDetailsEndpoint {

    @GET("comics/{comicId}")
    suspend fun get(
        @Path("comicId") comicId: Int,
        @Query("ts") ts: String?,
        @Query("hash") hash: String?,
        @Query("apikey") apikey: String?,
    ): ResponseModel<ComicModel>

    companion object {
        val endpoint: ComicDetailsEndpoint by lazy {
            NetworkUtils.getRetrofitInstance().create(ComicDetailsEndpoint::class.java)
        }
    }
}