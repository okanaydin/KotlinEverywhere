package com.example.kotlineverywhere.ui.memberlist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlineverywhere.R

class MemberListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object{
        fun getMemberListViewHolder(parent:ViewGroup):MemberListViewHolder{
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_member, parent, false)
            return MemberListViewHolder(itemView)
        }
    }

    fun bind() {}
}