package com.example.sokdack_mbti.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation

import com.example.sokdack_mbti.R
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_question2_1.*
import kotlinx.android.synthetic.main.fragment_question3_1.*


/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragment3_1.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuestionFragment3_1 : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question3_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)


        button_back_q3_1.setOnClickListener {
            navController.popBackStack()
        }

        button_option_1_q3_1.setOnClickListener {

        }
        button_option_2_q3_1.setOnClickListener {

        }
        button_option_3_q3_1.setOnClickListener {

        }
        button_option_4_q3_1.setOnClickListener {

        }
        button_option_5_q3_1.setOnClickListener {

        }
        button_option_6_q3_1.setOnClickListener {

        }

    }

}