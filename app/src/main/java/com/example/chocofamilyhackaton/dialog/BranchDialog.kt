package com.example.chocofamilyhackaton.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment
import com.example.chocofamilyhackaton.R
import com.example.chocofamilyhackaton.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.branch_info.view.*

class BranchDialog(private val imagesList: List<String>) : AppCompatDialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)

        val view = activity?.layoutInflater?.inflate(R.layout.branch_info, null)
        builder.setView(view)


        view?.viewPagerBranch?.adapter = ViewPagerAdapter(imagesList)
        return builder.create()
    }
}