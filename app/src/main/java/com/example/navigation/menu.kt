package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.navigation.R.layout.fragment_menu
import kotlinx.android.synthetic.main.fragment_menu.*
import kotlinx.android.synthetic.main.fragment_menu.view.*

class menu : Fragment() {

    private lateinit var bundle: Bundle

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_menu, container, false)

        view.btnMenu.setOnClickListener {
            bundle = bundleOf("toAbout" to "Fragment Detail")
            view.findNavController().navigate(R.id.action_menu_to_about, bundle)

        }

        view.btnDetail.setOnClickListener {
            bundle = bundleOf("toDetail" to "Fragment About")
            view.findNavController().navigate(R.id.action_menu_to_detailFragment, bundle)
        }
        return view
    }

}
