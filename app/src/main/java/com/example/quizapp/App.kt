package com.example.quizapp

import android.app.Application
import com.example.quizapp.ui.repository.Repository

class App : Application() {

    companion object{
        val repository = Repository()

    }

    override fun onCreate() {
        super.onCreate()

//        startKoin {
//
//            androidContext(this@App)
//            modules(koinModules)
//        }
    }
}