package com.example.sokdack_mbti.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.sokdack_mbti.R
import kotlinx.android.synthetic.main.fragment_question2_1_2.*
import kotlinx.android.synthetic.main.fragment_result.*
import kotlinx.android.synthetic.main.fragment_result.button_home
import kotlinx.android.synthetic.main.fragment_result10.*


/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment10.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment10 : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_result10, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)


        button_home.setOnClickListener{
            navController.navigate(R.id.action_resultFragment10_to_mainFragment)
        }
    }

}
