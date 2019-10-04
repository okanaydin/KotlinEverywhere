package com.example.kotlineverywhere.ui.memberlist.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.kotlineverywhere.model.Member

class MemberListAdapter : ListAdapter<Member,MemberListViewHolder>(MemberDiffUtil) {

    companion object MemberDiffUtil : DiffUtil.ItemCallback<Member>(){
        override fun areItemsTheSame(oldItem: Member, newItem: Member): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Member, newItem: Member): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberListViewHolder {
        return MemberListViewHolder.getMemberListViewHolder(parent)
    }

    override fun onBindViewHolder(holder: MemberListViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}