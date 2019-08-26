package com.example.chocofamilyhackaton.branch


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chocofamilyhackaton.MainActivity

import com.example.chocofamilyhackaton.R
import com.example.chocofamilyhackaton.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.branch_info.view.*
import kotlinx.android.synthetic.main.fragment_branch.*

class BranchFragment(private val imagesList: List<String>) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_branch, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewPagerBranch.adapter = ViewPagerAdapter(imagesList)
        backBtn1.setOnClickListener{(activity as MainActivity).backFromBranchToHome()}
        btnMakeOrder.setOnClickListener { (activity as MainActivity).onOrderOpen() }
    }


}
