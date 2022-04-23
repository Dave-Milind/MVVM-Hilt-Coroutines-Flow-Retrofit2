package com.example.mytestapplication.models


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

class CommentsResponse : ArrayList<CommentsResponse.CommentsResponseItem>(){
    @Keep
    data class CommentsResponseItem(
        @SerializedName("body")
        val body: String? = null,
        @SerializedName("email")
        val email: String? = null,
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("postId")
        val postId: Int? = null
    )
}