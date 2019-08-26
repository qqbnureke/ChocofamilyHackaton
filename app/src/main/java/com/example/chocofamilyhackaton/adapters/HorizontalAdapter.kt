package com.example.chocofamilyhackaton.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chocofamilyhackaton.R
import com.example.chocofamilyhackaton.pojo.HorizontalData
import com.example.chocofamilyhackaton.support.GoToBranchListener
import kotlinx.android.synthetic.main.horizontal_rv_item.view.*

class HorizontalAdapter(val list: List<HorizontalData>, val goToBranchListener: GoToBranchListener): RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        return HorizontalViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.horizontal_rv_item,
            parent,
            false
        ))
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        holder.imageLogo.setImageResource(list[position].imageId)
        holder.branchName.text = list[position].foodName
        holder.branchAddress.text = list[position].foodAddress
        holder.productPrice.text = list[position].price

        holder.itemView.setOnClickListener { goToBranchListener.onClick() }
    }

    class HorizontalViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageLogo: ImageView = itemView.ivlogooo
        val branchName: TextView = itemView.foodName
        val branchAddress : TextView = itemView.foodAddress
        val productPrice: TextView = itemView.foodPrice
    }
}