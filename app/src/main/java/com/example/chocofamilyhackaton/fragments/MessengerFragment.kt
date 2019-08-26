package com.example.chocofamilyhackaton.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chocofamilyhackaton.R
import com.example.chocofamilyhackaton.adapters.MessengerAdapter
import kotlinx.android.synthetic.main.fragment_messenger.*

class MessengerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_messenger, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rvChat.layoutManager = LinearLayoutManager(context)
        rvChat.adapter = MessengerAdapter()
    }
}
