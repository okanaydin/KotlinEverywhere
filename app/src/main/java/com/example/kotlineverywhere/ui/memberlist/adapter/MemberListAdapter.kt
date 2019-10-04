package com.example.kotlineverywhere.ui.memberlist.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MemberListAdapter : RecyclerView.Adapter<MemberListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberListViewHolder {
       return MemberListViewHolder.getMemberListViewHolder(parent)
    }

    override fun getItemCount(): Int = 0

    override fun onBindViewHolder(holder: MemberListViewHolder, position: Int) {
        holder.bind()
    }
}