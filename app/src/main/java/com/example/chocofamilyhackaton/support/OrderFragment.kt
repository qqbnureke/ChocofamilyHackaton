package com.example.chocofamilyhackaton.support


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.chocofamilyhackaton.MainActivity
import com.example.chocofamilyhackaton.R
import kotlinx.android.synthetic.main.fragment_order.*

class OrderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        backBtn2.setOnClickListener{(activity as MainActivity).backFromOrderToBranch()}
    }

}
