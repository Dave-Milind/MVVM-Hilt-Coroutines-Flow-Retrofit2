package com.example.mytestapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mytestapplication.models.CommentsResponse
import com.example.mytestapplication.repository.PlaceHlderRespository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor( var placeHlderRespository: PlaceHlderRespository): ViewModel() {

  var commentsData:MutableLiveData<List<CommentsResponse.CommentsResponseItem>> = MutableLiveData()

    fun getComments(){

        viewModelScope.launch {

            placeHlderRespository.getComments().catch {  }.collect {

                commentsData.postValue(it)
            }

        }
    }

}

