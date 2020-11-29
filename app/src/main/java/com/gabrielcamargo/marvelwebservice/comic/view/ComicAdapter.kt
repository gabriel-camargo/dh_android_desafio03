package com.gabrielcamargo.marvelwebservice.comic.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gabrielcamargo.marvelwebservice.R
import com.gabrielcamargo.marvelwebservice.comic.model.ComicModel

class ComicAdapter(
    private val dataSet: List<ComicModel>,
    private val clickListener: (ComicModel) -> Unit
): RecyclerView.Adapter<ComicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_comic_card, parent, false)

        return ComicViewHolder(view)
    }

    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
        holder.bind(dataSet[position])
        holder.itemView.setOnClickListener{clickListener(dataSet[position])}    }

    override fun getItemCount() = dataSet.size

}