package com.example.sokdack_mbti.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation

import com.example.sokdack_mbti.R
import kotlinx.android.synthetic.main.fragment_question.*
import kotlinx.android.synthetic.main.fragment_question1.*
import kotlinx.android.synthetic.main.fragment_selection.*


/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuestionFragment1 : Fragment() {

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question1, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        button_back_q1.setOnClickListener{
            navController.popBackStack()
        }

        button_option_1_q1.setOnClickListener {
            navController.navigate(R.id.action_questionFragment1_to_questionFragment1_1)
        }
        button_option_2_q1.setOnClickListener {
            navController.navigate(R.id.action_questionFragment1_to_questionFragment2_1)
        }
        button_option_3_q1.setOnClickListener {
            navController.navigate(R.id.action_questionFragment1_to_questionFragment3_1)
        }
    }

}