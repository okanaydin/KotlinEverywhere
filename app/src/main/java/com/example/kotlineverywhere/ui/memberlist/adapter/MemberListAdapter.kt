package com.example.kotlineverywhere.ui.memberlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlineverywhere.R

class MemberListAdapter : RecyclerView.Adapter<MemberListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberListViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_member, parent, false)
        return MemberListViewHolder(itemView)
    }

    override fun getItemCount(): Int = 0

    override fun onBindViewHolder(holder: MemberListViewHolder, position: Int) {}
}