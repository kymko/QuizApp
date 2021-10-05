package com.example.quizapp.ui.fragments.quiz

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.quizapp.model.QuizResponse
import com.example.quizapp.ui.repository.Repository
import com.example.youtubeapi.core.network.Resource

class QuizViewModel(private val repository:Repository) : ViewModel() {

    fun getAllQuestions(amount:Int,category: Int,difficulty:String):LiveData<Resource<QuizResponse>>{
        return repository.getAllQuestions(amount,category,difficulty)
    }

}