package com.example.chocofamilyhackaton.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chocofamilyhackaton.R
import com.example.chocofamilyhackaton.pojo.VerticalData
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.vertical_rv_item.view.*

class VerticalAdapter(val list: List<VerticalData>) :
    RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        return VerticalViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.vertical_rv_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        holder.imageLogo.setImageResource(list[position].imageUrl)
        holder.branchName.text = list[position].branchName
        holder.branchWorkongDate.text = list[position].workingHours
        holder.branchAddOns.text = list[position].tags
    }


    class VerticalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageLogo: CircleImageView = itemView.ivLogo
        val branchName: TextView = itemView.tvBranchNameVertical
        val branchWorkongDate: TextView = itemView.tvDate
        val branchAddOns: TextView = itemView.tvAddOns
    }
}