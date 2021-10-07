package com.example.quizapp.ui.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.quizapp.model.QuizResponse
import com.example.quizapp.remote.QuizApi
import com.example.quizapp.remote.RetrofitClient
import com.example.youtubeapi.core.network.Resource
import kotlinx.coroutines.Dispatchers

class Repository {

    private var quizApi: QuizApi = RetrofitClient.create()

    fun getAllQuestions(amount:Int,category:Int,difficulty:String,type:String): LiveData<Resource<QuizResponse>> = liveData(Dispatchers.IO) {
        emit(Resource.loading(null))

        val response = quizApi.getQuestions(amount, category, difficulty,type)

        emit(
            if (response.isSuccessful)
                Resource.success(response.body(), response.code())
            else
                Resource.error(response.message(), response.body(), response.code())
        )
    }

}