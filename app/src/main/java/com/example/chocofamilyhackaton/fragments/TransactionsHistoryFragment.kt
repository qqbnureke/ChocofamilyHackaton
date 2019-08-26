package com.example.chocofamilyhackaton.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chocofamilyhackaton.R
import com.example.chocofamilyhackaton.adapters.TransactionAdapter
import com.example.chocofamilyhackaton.pojo.TransactionHistoryModel
import kotlinx.android.synthetic.main.fragment_transactions_history.*

class TransactionsHistoryFragment : Fragment() {

    private lateinit var list: ArrayList<TransactionHistoryModel>

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transactions_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvTransactionHistory.layoutManager = LinearLayoutManager(context)
        tvTransactionHistory.adapter = TransactionAdapter(generateTransactionList())
    }

    private fun generateTransactionList(): List<TransactionHistoryModel> {
        list = arrayListOf()

        list.add(TransactionHistoryModel("Burger King", "2019-08-25", "19:11",
                "#745GFT8", "3450", "ТРЦ АДК, Сатбаева 28", false))

        list.add(TransactionHistoryModel("Burger King", "2019-08-25", "19:11",
                "#745GFT8", "3450", "ТРЦ АДК, Сатбаева 28", false))

        list.add(TransactionHistoryModel("Burger King", "2019-08-25", "19:11",
                "#745GFT8", "3450", "ТРЦ АДК, Сатбаева 28", false))

        list.add(TransactionHistoryModel("Burger King", "2019-08-25", "19:11",
                "#745GFT8", "3450", "ТРЦ АДК, Сатбаева 28", false))

        return list
    }


}
