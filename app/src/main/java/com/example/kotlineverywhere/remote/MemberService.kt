package com.example.kotlineverywhere.remote

import com.example.kotlineverywhere.model.Member
import retrofit2.Call
import retrofit2.http.GET

interface MemberService {

    @GET("b/5eb8541047a2266b147633bd/2")
    fun getMemberList(): Call<List<Member>>
}