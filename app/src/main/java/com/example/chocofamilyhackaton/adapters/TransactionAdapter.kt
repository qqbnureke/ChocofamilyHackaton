package com.example.chocofamilyhackaton.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chocofamilyhackaton.R
import com.example.chocofamilyhackaton.pojo.TransactionHistoryModel
import kotlinx.android.synthetic.main.layout_transaction_item.view.*

class TransactionAdapter(private val list: List<TransactionHistoryModel>) : RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        return TransactionViewHolder(LayoutInflater.from(parent.context).inflate(
                R.layout.layout_transaction_item,
                parent,
                false
        ))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {

        val isExpanded = list[position].isExpanded
        if (isExpanded) {
            holder.time1.text = list[position].address
            holder.image1.visibility = View.GONE
            holder.time2.visibility = View.GONE
            holder.imageCheck.visibility = View.VISIBLE
            holder.llTime.visibility = View.VISIBLE
            holder.yourCheckText.visibility = View.VISIBLE
            holder.checkCode.visibility = View.VISIBLE
        } else {
            holder.time1.text = list[position].transactionDate
            holder.time2.text = list[position].transactionTime
            holder.image1.visibility = View.VISIBLE
            holder.time2.visibility = View.VISIBLE
            holder.llTime.visibility = View.GONE
            holder.checkCode.visibility = View.GONE
            holder.yourCheckText.visibility = View.GONE
            holder.imageCheck.visibility = View.GONE
        }

        holder.branchName.text = list[position].branchName
        holder.price.text = list[position].price
        holder.checkCode.text = list[position].checkCode
        holder.time15.text = list[position].transactionDate
        holder.time26.text = list[position].transactionTime

        holder.itemView.setOnClickListener {
            list[position].isExpanded = !isExpanded
            notifyItemChanged(position)
        }
    }

    class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val branchName: TextView = itemView.tvBranchName

        val time1: TextView = itemView.text1
        val image1: ImageView = itemView.image1
        val time2: TextView = itemView.text2

        val price: TextView = itemView.tvPrice

        val yourCheckText: TextView = itemView.text3
        val checkCode: TextView = itemView.text4

        val llTime: LinearLayout = itemView.llTime
        val time15: TextView = itemView.text5
        val time26: TextView = itemView.text6

        val imageCheck: ImageView = itemView.image2
    }
}