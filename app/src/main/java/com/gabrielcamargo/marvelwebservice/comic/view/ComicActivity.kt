package com.gabrielcamargo.marvelwebservice.comic.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gabrielcamargo.marvelwebservice.R

class ComicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic)

        supportActionBar?.title = getString(R.string.marvel);

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ComicFragment.newInstance())
                .commitNow()
        }
    }
}