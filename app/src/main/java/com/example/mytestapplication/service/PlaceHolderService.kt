package com.example.mytestapplication.service

import com.example.mytestapplication.models.CommentsResponse
import retrofit2.http.GET

interface PlaceHolderService {

    @GET("comments")
    suspend fun getComments():ArrayList<CommentsResponse.CommentsResponseItem>
}