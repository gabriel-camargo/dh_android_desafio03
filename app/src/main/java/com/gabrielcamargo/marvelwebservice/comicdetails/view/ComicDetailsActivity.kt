package com.gabrielcamargo.marvelwebservice.comicdetails.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gabrielcamargo.marvelwebservice.R
import com.gabrielcamargo.marvelwebservice.interfaces.IOnBackPressed

class ComicDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.comic_details_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_comicDetailsActivity, ComicDetailsFragment.newInstance())
                .commitNow()
        }
    }

    override fun onBackPressed() {
//        super.onBackPressed()

        val fragment = supportFragmentManager.findFragmentById(R.id.container_comicDetailsActivity)
        (fragment as? IOnBackPressed)?.onBackPressed()?.not()?.let {
//            super.onBackPressed()
            finish()
        }
    }
}