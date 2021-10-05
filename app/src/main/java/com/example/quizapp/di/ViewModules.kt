package com.example.quizapp.di

import com.example.quizapp.ui.fragments.quiz.QuizViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModules:Module = module {
    viewModel { QuizViewModel(get()) }
}