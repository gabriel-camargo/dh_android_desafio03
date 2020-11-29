package com.gabrielcamargo.marvelwebservice.comicdetails.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gabrielcamargo.marvelwebservice.R

class ComicDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic_details)

        supportActionBar?.hide()
    }
}