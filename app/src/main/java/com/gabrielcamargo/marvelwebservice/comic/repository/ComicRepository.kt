package com.gabrielcamargo.marvelwebservice.comic.repository

import android.content.Context
import com.gabrielcamargo.marvelwebservice.data.api.NetworkUtils.Companion.PUBLIC_KEY_MARVEL
import com.gabrielcamargo.marvelwebservice.data.api.NetworkUtils.Companion.getHash
import com.gabrielcamargo.marvelwebservice.extensions.ExtensionMarvelApi.Companion.getTimeStamp

class ComicRepository {
    private val client = ComicEndpoint.endpoint

    suspend fun getComics() = client.get(getTimeStamp(), getHash(), PUBLIC_KEY_MARVEL)
}