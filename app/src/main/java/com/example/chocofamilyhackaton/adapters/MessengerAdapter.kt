package com.example.chocofamilyhackaton.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chocofamilyhackaton.R
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.chat_item.view.*

class MessengerAdapter: RecyclerView.Adapter<MessengerAdapter.MessageViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(LayoutInflater.from(parent.context).inflate(
                R.layout.chat_item,
                parent,
                false
        ))
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.ivIcon.setImageResource(R.drawable.pizza)
        holder.message.text = "Спасибо за покупку"
    }

    class MessageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val message: TextView = itemView.textViewMessageChat
        val ivIcon: CircleImageView = itemView.imageChat
    }
}