package com.example.retrofit.repositry

import com.example.retrofit.api.RetrofitInstance
import com.example.retrofit.model.Post

class Repository {
    suspend fun getPost() : Post {
        return RetrofitInstance.api.getPost()
    }
}