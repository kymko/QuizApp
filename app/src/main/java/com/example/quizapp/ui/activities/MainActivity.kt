package com.example.quizapp.ui.activities

import android.view.LayoutInflater
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.core.ui.base.BaseViewModel
import com.example.quizapp.R
import com.example.quizapp.core.ui.BaseActivity
import com.example.quizapp.databinding.ActivityMainBinding
import com.example.quizapp.ui.fragments.quiz.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding,MainViewModel>(MainViewModel::class.java) {

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

