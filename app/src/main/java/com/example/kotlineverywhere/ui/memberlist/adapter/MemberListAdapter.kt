package com.example.kotlineverywhere.ui.memberlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlineverywhere.R
import com.example.kotlineverywhere.model.Member

class MemberListAdapter : RecyclerView.Adapter<MemberListViewHolder>() {

    var memberList: List<Member> = ArrayList()
        set(value) {
            field = value
            this.notifyDataSetChanged()
        }

    private var onItemClickListener: ((Member?) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberListViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_member,parent,false)
        return MemberListViewHolder(itemView)
    }

    override fun getItemCount(): Int = memberList.size

    override fun onBindViewHolder(holder: MemberListViewHolder, position: Int) {
        holder.bind(memberList[position], onItemClickListener)
    }

    fun setOnItemClickListener(onItemClickListener: ((Member?) -> Unit)?) {
        this.onItemClickListener = onItemClickListener
    }
}