package com.example.kotlineverywhere.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlineverywhere.model.Member
import com.example.kotlineverywhere.repository.MemberRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MemberListViewModel : ViewModel() {

    val memberListLiveData = MutableLiveData<List<Member>>()

    private val memberRepository = MemberRepository()

    fun getMemberList() {
        viewModelScope.launch {
            val members: List<Member> = memberRepository.getMemberList()

            withContext(Dispatchers.Main) {
                memberListLiveData.value = members
            }
        }
    }
}