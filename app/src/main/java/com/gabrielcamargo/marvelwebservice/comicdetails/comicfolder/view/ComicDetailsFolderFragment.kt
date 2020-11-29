package com.gabrielcamargo.marvelwebservice.comicdetails.comicfolder.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.gabrielcamargo.marvelwebservice.R
import com.gabrielcamargo.marvelwebservice.comicdetails.comicfolder.viewmodel.ComicDetailsFolderViewModel

class ComicDetailsFolderFragment : Fragment() {

    companion object {
        fun newInstance() = ComicDetailsFolderFragment()
    }

    private lateinit var viewModel: ComicDetailsFolderViewModel
    private lateinit var _myView: View
    private lateinit var _navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _myView =  inflater.inflate(R.layout.fragment_comic_details_folder, container, false)
        return _myView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(this).get(ComicDetailsFolderViewModel::class.java)
        _navController = Navigation.findNavController(_myView)

        val btnClose = _myView.findViewById<ImageView>(R.id.closeButton_comicDetailsFolderFragment)
        btnClose.setOnClickListener{
            _navController.navigate(R.id.comicDetailsFragment)
        }

    }

}