package com.example.kotlineverywhere.ui.memberlist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlineverywhere.R
import com.example.kotlineverywhere.model.Member
import kotlinx.android.synthetic.main.item_member.view.*

class MemberListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object{
        fun getMemberListViewHolder(parent: ViewGroup):MemberListViewHolder{
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_member, parent, false)
            return MemberListViewHolder(itemView)
        }
    }

    fun bind(memberModel: Member, onItemClickListener: ((memberModel: Member) -> Unit)?) {

        itemView.textViewMemberName.text = memberModel.name
        itemView.textViewMemberTitle.text = memberModel.title
        Glide.with(itemView.context).load(memberModel.profileImage).into(itemView.imageViewMemberPhoto)

        itemView.setOnClickListener { onItemClickListener?.invoke(memberModel) }
    }
}