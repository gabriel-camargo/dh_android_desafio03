package com.gabrielcamargo.marvelwebservice.comicdetails.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.gabrielcamargo.marvelwebservice.comic.model.ComicModel
import com.gabrielcamargo.marvelwebservice.comicdetails.repository.ComicDetailsRepository
import kotlinx.coroutines.Dispatchers

class ComicDetailsViewModel(
    private val repository: ComicDetailsRepository
) : ViewModel() {
    var comicDetails: ComicModel? = null

    fun getComicDetails(id: Int) = liveData(Dispatchers.IO) {
        val response = repository.getComicDetails(id)
        comicDetails = response.data.results[0]
        emit(response.data.results[0])
    }

    @Suppress("UNCHECKED_CAST")
    class ComicDetailsViewModelFactory(
        private val repository: ComicDetailsRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return ComicDetailsViewModel(repository) as T
        }

    }
}