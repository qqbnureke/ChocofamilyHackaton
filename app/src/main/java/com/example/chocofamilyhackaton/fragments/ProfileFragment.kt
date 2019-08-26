package com.example.chocofamilyhackaton.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chocofamilyhackaton.MainActivity
import com.example.chocofamilyhackaton.R
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnLogOut.setOnClickListener{
            (activity as MainActivity).backToLogin()
        }
    }

}
