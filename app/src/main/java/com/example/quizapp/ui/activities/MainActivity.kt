package com.example.quizapp.ui.activities

import android.util.Log
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.quizapp.R
import com.example.quizapp.core.ui.BaseActivity
import com.example.quizapp.databinding.ActivityMainBinding
import com.example.quizapp.ui.fragments.quiz.QuizViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {

   private val viewModel: QuizViewModel by viewModel()

    override fun setupUI() {

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavView.setupWithNavController(navController)

    }

    override fun setupLiveData() {

    }

    override fun inflateBinding(from: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}

//дз 1
//Добавить BottomNav, связать с основным ViewPager-ом или сделать отдельными фрагментами
//Изменить иконку приложения
//прописать клики на нажатия элементов Bottom navigation