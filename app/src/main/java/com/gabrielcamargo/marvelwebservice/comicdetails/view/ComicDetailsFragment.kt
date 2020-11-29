package com.gabrielcamargo.marvelwebservice.comicdetails.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.gabrielcamargo.marvelwebservice.R
import com.gabrielcamargo.marvelwebservice.comicdetails.viewmodel.ComicDetailsViewModel
import com.gabrielcamargo.marvelwebservice.interfaces.IOnBackPressed

class ComicDetailsFragment : Fragment(), IOnBackPressed {

    companion object {
        fun newInstance() = ComicDetailsFragment()
    }

    private lateinit var _myView: View
//    private lateinit var viewModel: ComicDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _myView =  inflater.inflate(R.layout.comic_details_fragment, container, false)
        return _myView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(ComicDetailsViewModel::class.java)

        val btnBack = _myView.findViewById<ImageView>(R.id.backButton_comicDetailsFragment)
        btnBack.setOnClickListener{
            activity?.onBackPressed()
        }
    }

    override fun onBackPressed() = true
}