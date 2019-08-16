package com.example.kotlineverywhere.remote

import com.example.kotlineverywhere.model.Member
import retrofit2.Call
import retrofit2.http.GET

interface MemberService {

    @GET("bins/n2w5b")
    fun getMemberList(): Call<List<Member>>
}