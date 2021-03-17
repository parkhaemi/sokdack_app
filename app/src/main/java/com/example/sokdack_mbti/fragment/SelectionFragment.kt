package com.example.sokdack_mbti.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.sokdack_mbti.R
import kotlinx.android.synthetic.main.fragment_selection.*


/**
 * A simple [Fragment] subclass.
 * Use the [SelectionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SelectionFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        button_back.setOnClickListener{
            navController.popBackStack()
        }

        button_option_1.setOnClickListener {
            navController.navigate(R.id.action_selectionFragment_to_resultFragment)
        }
        button_option_2.setOnClickListener {
            navController.navigate(R.id.action_selectionFragment_to_resultFragment2)
        }
        button_option_3.setOnClickListener {
            navController.navigate(R.id.action_selectionFragment_to_resultFragment3)
        }
        button_option_4.setOnClickListener {
            navController.navigate(R.id.action_selectionFragment_to_resultFragment4)
        }
    }

}