package com.example.quizapp.ui.fragments.quiz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.core.ui.base.BaseViewModel
import com.example.quizapp.model.QuizResponse
import com.example.quizapp.ui.repository.Repository
import com.example.youtubeapi.core.network.Resource

class MainViewModel(private val repository: Repository) : BaseViewModel() {

    fun getAllQuestions(
        amount: Int,
        category: Int,
        difficulty: String,
        type: String
    ): LiveData<Resource<QuizResponse>> {
        return repository.getAllQuestions(amount, category, difficulty, type)
    }

    private val _sliderAmount = MutableLiveData<Int>()
    val sliderAmount = _sliderAmount
    fun setSliderAmount(amount: Int){
        _sliderAmount.value = amount
    }

    private val _spinnerCategory = MutableLiveData<Int>()
    val spinnerCategory = _spinnerCategory
    fun setSpinnerCategory(category: Int){
        _spinnerCategory.value = category
    }

    private val _spinnerDifficulty = MutableLiveData<String>()
    val spinnerDifficulty = _spinnerDifficulty
    fun setSpinnerDifficulty(difficulty: String){
        _spinnerDifficulty.value = difficulty
    }


}