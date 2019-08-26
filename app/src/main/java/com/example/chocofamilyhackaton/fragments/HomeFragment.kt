package com.example.chocofamilyhackaton.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.chocofamilyhackaton.R
import com.example.chocofamilyhackaton.adapters.HorizontalAdapter
import com.example.chocofamilyhackaton.adapters.VerticalAdapter
import com.example.chocofamilyhackaton.pojo.HorizontalData
import com.example.chocofamilyhackaton.pojo.VerticalData
import com.example.chocofamilyhackaton.support.GoToBranchListener
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment(val listener: GoToBranchListener) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rvHorizontal.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvHorizontal.adapter = HorizontalAdapter(generateHorizontalData(), listener)

        rvVertical.layoutManager = LinearLayoutManager(context)
        rvVertical.adapter = VerticalAdapter(generateVerticalData())
    }

    private fun generateVerticalData(): List<VerticalData>{
        val list = ArrayList<VerticalData>()

        list.add(
            VerticalData(
            R.drawable.sushi,
            "Суши Мастер",
            "12:00 - 00:00",
            "Суши, Пицца"
        )
        )

        list.add(VerticalData(
            R.drawable.burger,
            "MC Donalds",
            "12:00 - 00:00",
            "Бургеры, Пицца"
        ))

        list.add(VerticalData(
            R.drawable.pizza,
            "Додо Пицца",
            "12:00 - 00:00",
            "Пицца"
        ))

        return list
    }


    private fun generateHorizontalData(): List<HorizontalData>{
        val list = ArrayList<HorizontalData>()

        list.add(
            HorizontalData(
                R.drawable.pizza,
                "на Жандосова",
                "Додо Пицца",
                "От 2000"
            )
        )

        list.add(HorizontalData(
            R.drawable.sushi,
            "ТРЦ Москва",
            "Суши Мастер",
            "От 3500"
        ))

        list.add(HorizontalData(
            R.drawable.burger,
            "Орбита",
            "MC Donald's",
            "От 500"
        ))

        return list
    }

}
