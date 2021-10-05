package com.example.quizapp.remote

import com.example.quizapp.model.QuizResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuizApi {

    @GET("api.php")
   suspend fun getQuestions(
        @Query("amount") amount: Int,
        @Query("category") category: Int,
        @Query("difficulty") difficulty: String
    ): Response<QuizResponse>

}
//https://opentdb.com/api.php?amount=10&category=23&difficulty=medium