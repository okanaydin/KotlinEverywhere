package com.example.kotlineverywhere.ui.memberlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import com.example.kotlineverywhere.R
import com.example.kotlineverywhere.ui.memberlist.adapter.MemberListAdapter
import com.example.kotlineverywhere.viewmodel.MemberListViewModel
import kotlinx.android.synthetic.main.fragment_member_list.*

class MemberListFragment : Fragment() {

    private val memberListViewModel: MemberListViewModel by lazy {
        ViewModelProviders.of(this@MemberListFragment)[MemberListViewModel::class.java]
    }

    private val memberListAdapter = MemberListAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_member_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        memberListViewModel.getMemberListLiveData.observe(viewLifecycleOwner, Observer {memberList->
            memberListAdapter.submitList(memberList)
        })

        recyclerViewMemberList.apply {
            setHasFixedSize(true)
            adapter = memberListAdapter
        }
    }
}