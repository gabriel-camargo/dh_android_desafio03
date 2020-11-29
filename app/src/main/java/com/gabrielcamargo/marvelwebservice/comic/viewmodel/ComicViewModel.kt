package com.gabrielcamargo.marvelwebservice.comic.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gabrielcamargo.marvelwebservice.comic.model.ComicModel
import com.gabrielcamargo.marvelwebservice.comic.repository.ComicRepository

class ComicViewModel(
    private val repository: ComicRepository
) : ViewModel() {
    val comics = MutableLiveData<MutableList<ComicModel>>()

    fun getComics() {
        repository.getComics {
            comics.value = it
        }
    }

    @Suppress("UNCHECKED_CAST")
    class ComicViewModelFactory(
        private val repository: ComicRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return ComicViewModel(repository) as T
        }

    }
}