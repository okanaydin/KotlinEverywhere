package com.example.kotlineverywhere.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Member(
        @SerializedName("name")
        val name: String?,
        @SerializedName("title")
        val title: String?,
        @SerializedName("bio")
        val bio: String?,
        @SerializedName("twitter")
        val twitter: String?,
        @SerializedName("linkedin")
        val linkedin: String?,
        @SerializedName("github")
        val github: String?,
        @SerializedName("profileImage")
        val profileImage: String?
) : Parcelable