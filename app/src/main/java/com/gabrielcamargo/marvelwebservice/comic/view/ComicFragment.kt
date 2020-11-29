package com.gabrielcamargo.marvelwebservice.comic.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gabrielcamargo.marvelwebservice.R
import com.gabrielcamargo.marvelwebservice.comic.model.ComicModel
import com.gabrielcamargo.marvelwebservice.comic.repository.ComicRepository
import com.gabrielcamargo.marvelwebservice.comic.viewmodel.ComicViewModel

class ComicFragment : Fragment() {

    companion object {
        fun newInstance() = ComicFragment()
    }

    private lateinit var _viewModel: ComicViewModel
    private lateinit var  _myView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _myView = inflater.inflate(R.layout.comic_fragment, container, false)
        return _myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _viewModel = ViewModelProvider(
            this,
            ComicViewModel.ComicViewModelFactory(ComicRepository(_myView.context))
        ).get(ComicViewModel::class.java)

        _viewModel.comics.observe(viewLifecycleOwner, Observer {
            createList(it)
        })

        _viewModel.getComics()
    }

    private fun createList(comics: List<ComicModel>) {
        val viewManager = GridLayoutManager(_myView.context, 3)
        val recyclerView = _myView.findViewById<RecyclerView>(R.id.recyclerView_comicFragment)
        val viewAdapter = ComicAdapter(comics) {
            Toast.makeText(_myView.context, it.numberEdition, Toast.LENGTH_SHORT).show()
        }

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}