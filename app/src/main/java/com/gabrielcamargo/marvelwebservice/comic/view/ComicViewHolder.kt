package com.gabrielcamargo.marvelwebservice.comic.view

import android.provider.Settings.Global.getString
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.gabrielcamargo.marvelwebservice.R
import com.gabrielcamargo.marvelwebservice.comic.model.ComicModel

class ComicViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val imgComic = view.findViewById<ImageView>(R.id.imgComic_itemComicCard)
    private val txtEdition = view.findViewById<TextView>(R.id.txtNumber_itemComicCard)
    private val context = view.context

    fun bind(comic: ComicModel) {
        comic.img?.let{
            Glide.with(context)
                .load(it.path + "." + it.extension)
                .transform(CenterCrop())
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(imgComic)
        }


        val issueNumberString = "#" + comic.numEdicao
        txtEdition.text = issueNumberString

    }

}