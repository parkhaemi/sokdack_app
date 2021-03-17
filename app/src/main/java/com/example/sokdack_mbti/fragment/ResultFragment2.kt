package com.example.sokdack_mbti.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.sokdack_mbti.R
import kotlinx.android.synthetic.main.fragment_result.*


/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment2 : Fragment(), View.OnClickListener {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)


        button_home.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_home -> {
                navController.navigate(R.id.action_resultFragment2_to_mainFragment)
            }
        }
    }


}