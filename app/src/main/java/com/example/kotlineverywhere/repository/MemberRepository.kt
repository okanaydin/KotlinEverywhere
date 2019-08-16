package com.example.kotlineverywhere.repository

import com.example.kotlineverywhere.remote.RetrofitInstance

class MemberRepository {

    suspend fun getMemberList() = RetrofitInstance.service.getMemberList()
}