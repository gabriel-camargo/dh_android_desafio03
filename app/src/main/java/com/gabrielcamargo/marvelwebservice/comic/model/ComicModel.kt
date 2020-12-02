package com.gabrielcamargo.marvelwebservice.comic.model

import com.gabrielcamargo.marvelwebservice.utils.ImageModel
import com.google.gson.annotations.SerializedName

data class ComicModel(
    val id: Int,
    @SerializedName("thumbnail")
    val img: ImageModel?,
    @SerializedName("title")
    val titulo: String?,
    @SerializedName("issueNumber")
    val numEdicao: String?,
    @SerializedName("dates")
    val datas: List<ComicDates>?,
    @SerializedName("prices")
    val precos: List<ComicPrice>?,
    @SerializedName("pageCount")
    val paginas: Int?,
    @SerializedName("description")
    val descricao: String?
)
