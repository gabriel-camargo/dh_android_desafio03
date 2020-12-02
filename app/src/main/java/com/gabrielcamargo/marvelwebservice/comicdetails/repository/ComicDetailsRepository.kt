package com.gabrielcamargo.marvelwebservice.comicdetails.repository

import com.gabrielcamargo.marvelwebservice.data.api.NetworkUtils
import com.gabrielcamargo.marvelwebservice.extensions.ExtensionMarvelApi.Companion.getTimeStamp

class ComicDetailsRepository {
    private val client = ComicDetailsEndpoint.endpoint

    suspend fun getComicDetails(comicId: Int) = client.get(
        comicId,
        getTimeStamp(),
        NetworkUtils.getHash(),
        NetworkUtils.PUBLIC_KEY_MARVEL,
    )
}