package com.gabrielcamargo.marvelwebservice.comic.repository

import android.content.Context
import com.gabrielcamargo.marvelwebservice.R
import com.gabrielcamargo.marvelwebservice.comic.model.ComicModel

class ComicRepository(private val context: Context) {
    fun getComics(callback: (comics: MutableList<ComicModel>) -> Unit) {
        callback.invoke(
            mutableListOf<ComicModel>(
                ComicModel(R.drawable.splashscreen, "#99"),
                ComicModel(R.drawable.splashscreen, "#98"),
                ComicModel(R.drawable.splashscreen, "#97"),
                ComicModel(R.drawable.splashscreen, "#96"),
                ComicModel(R.drawable.splashscreen, "#95"),
                ComicModel(R.drawable.splashscreen, "#94"),
            )
        )
    }
}
