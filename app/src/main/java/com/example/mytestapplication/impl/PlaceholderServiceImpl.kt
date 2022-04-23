package com.example.mytestapplication.impl

import com.example.mytestapplication.models.CommentsResponse
import com.example.mytestapplication.service.PlaceHolderService
import javax.inject.Inject

class PlaceholderServiceImpl @Inject constructor(var placeHolderService: PlaceHolderService) {

    suspend fun getComments(): List<CommentsResponse.CommentsResponseItem> =
        placeHolderService.getComments()

}