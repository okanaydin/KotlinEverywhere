package com.example.kotlineverywhere.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlineverywhere.model.Member
import com.example.kotlineverywhere.repository.MemberRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MemberListViewModel : ViewModel() {

    private val memberListLiveData = MutableLiveData<List<Member>>()

    val getMemberListLiveData : LiveData<List<Member>>
        get() = memberListLiveData

    private val memberRepository = MemberRepository()

    init {
        getMemberList()
    }

    //Background thread postValue
    //Main thread setValue

    private fun getMemberList() {
        viewModelScope.launch(Dispatchers.IO) {
            val members: List<Member> = memberRepository.getMemberList()
            memberListLiveData.postValue(members)
        }
    }
}