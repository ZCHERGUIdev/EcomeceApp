package com.zakariachergui.ecomerceapp.Fagment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zakariachergui.ecomerceapp.R
import kotlinx.android.synthetic.main.toolbar.*

class FavoriteFragment : Fragment() {

    companion object {
        fun newInstance() = FavoriteFragment()
    }

    private lateinit var viewModel: FavoriteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.favorite_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolText.text="Basket"

    }



}