package com.example.mytestapplication.repository

import com.example.mytestapplication.impl.PlaceholderServiceImpl
import com.example.mytestapplication.models.CommentsResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PlaceHlderRespository @Inject constructor(var placeholderServiceImpl: PlaceholderServiceImpl) {

    fun getComments(): Flow<List<CommentsResponse.CommentsResponseItem>> = flow {

       val list= placeholderServiceImpl.getComments()
       emit(list)

    }
}