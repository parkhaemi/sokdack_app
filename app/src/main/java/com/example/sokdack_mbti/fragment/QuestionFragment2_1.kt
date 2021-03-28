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
import kotlinx.android.synthetic.main.fragment_question1_1.*
import kotlinx.android.synthetic.main.fragment_question2_1.*


/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragment2_1.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuestionFragment2_1 : Fragment(){

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question2_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)


        button_back_q2_1.setOnClickListener{
            navController.popBackStack()
        }

        button_option_1_q2_1.setOnClickListener {
            navController.navigate(R.id.action_questionFragment2_1_to_questionFragment2_1_1)
        }
        button_option_2_q2_1.setOnClickListener {
           navController.navigate(R.id.action_questionFragment2_1_to_questionFragment2_1_2)
        }
    }

}