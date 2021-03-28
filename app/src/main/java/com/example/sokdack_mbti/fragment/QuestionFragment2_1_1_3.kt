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
import kotlinx.android.synthetic.main.fragment_question2_1_1.*
import kotlinx.android.synthetic.main.fragment_question2_1_1_3.*


/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragment2_1_1_3.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuestionFragment2_1_1_3 : Fragment() {

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question2_1_1_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)


        button_back_q2_1_1_3.setOnClickListener{
            navController.popBackStack()
        }

        button_option_1_q2_1_1_3.setOnClickListener {

        }
        button_option_2_q2_1_1_3.setOnClickListener {
            navController.navigate(R.id.action_questionFragment2_1_1_3_to_resultFragment10)
        }
        button_option_3_q2_1_1_3.setOnClickListener {

        }
        button_option_4_q2_1_1_3.setOnClickListener {

        }
    }

}