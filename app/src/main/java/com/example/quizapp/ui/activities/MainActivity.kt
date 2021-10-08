package com.example.quizapp.ui.activities

import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.quizapp.R
import com.example.quizapp.core.ui.BaseActivity
import com.example.quizapp.databinding.ActivityMainBinding
import com.example.quizapp.ui.fragments.quiz.QuizViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {

   // private val viewModel: QuizViewModel by viewModel()
    lateinit var viewModel: QuizViewModel

    override fun setupUI() {

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavView.setupWithNavController(navController)

    }

    override fun setupLiveData() {

        viewModel = ViewModelProvider(this).get(QuizViewModel::class.java)
    }

    override fun inflateBinding(from: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}

