package com.gabrielcamargo.marvelwebservice.data.api

import com.gabrielcamargo.marvelwebservice.extensions.ExtensionMarvelApi
import com.gabrielcamargo.marvelwebservice.extensions.ExtensionMarvelApi.Companion.getTimeStamp
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtils {

    companion object {
        private const val BASE_URL = "https://gateway.marvel.com/v1/public/"
        private const val PRIVATE_KEY_MARVEL = "775846c72a10e5ff301cea479066bf5f7cbeb0cc"
        const val PUBLIC_KEY_MARVEL = "b9e0b4aac8bb321bd9414b8363d04b2e"

        fun getRetrofitInstance(): Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        fun getHash(): String? {
            return ExtensionMarvelApi.md5(getTimeStamp() + PRIVATE_KEY_MARVEL + PUBLIC_KEY_MARVEL)
        }
    }
}