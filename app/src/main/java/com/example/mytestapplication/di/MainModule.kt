package com.example.mytestapplication.di

import com.example.mytestapplication.service.PlaceHolderService
import com.example.mytestapplication.utils.Constants
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Provides
    @Singleton
    fun getBaseUrl():String= Constants.JSONPLACEHOLDER_URL

    @Provides
    @Singleton
    fun getRetrofit(baseUrl:String): Retrofit {

        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
    }

    @Provides
    fun getPlaceHolderService(retrofit: Retrofit) : PlaceHolderService {

        return retrofit.create(PlaceHolderService::class.java)
    }

}