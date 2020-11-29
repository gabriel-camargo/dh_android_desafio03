package com.gabrielcamargo.marvelwebservice.comicdetails.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.gabrielcamargo.marvelwebservice.R
import com.gabrielcamargo.marvelwebservice.comicdetails.viewmodel.ComicDetailsViewModel

class ComicDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = ComicDetailsFragment()
    }

    private lateinit var _myView: View
    private lateinit var _navController: NavController
    private lateinit var _viewModel: ComicDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _myView =  inflater.inflate(R.layout.fragment_comic_details, container, false)
        return _myView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        _viewModel = ViewModelProvider(this).get(ComicDetailsViewModel::class.java)
        _navController = Navigation.findNavController(_myView)


        val btnBack = _myView.findViewById<ImageView>(R.id.backButton_comicDetailsFragment)
        btnBack.setOnClickListener{
            activity?.onBackPressed()
        }

        val imgComicFolder = _myView.findViewById<ImageView>(R.id.imgComic_comicDetailsFragment)
        imgComicFolder.setOnClickListener{
            _navController.navigate(R.id.comicDetailsFolderFragment)
        }
    }
}