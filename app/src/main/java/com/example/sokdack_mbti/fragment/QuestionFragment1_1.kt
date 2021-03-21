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


/**
 * A simple [Fragment] subclass.
 * Use the [QuestionFragment1_1.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuestionFragment1_1 : Fragment(), View.OnClickListener {

    lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        button_next.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button_next -> {
                navController.navigate(R.id.action_questionFragment_to_selectionFragment)
            }
        }
    }

}