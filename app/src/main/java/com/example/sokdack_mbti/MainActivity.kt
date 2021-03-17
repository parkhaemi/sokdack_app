package com.example.sokdack_mbti


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.appcompat.app.ActionBar
import androidx.navigation.fragment.findNavController
import com.example.sokdack_mbti.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController :NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = nav_host_fragment.findNavController()

    }
}