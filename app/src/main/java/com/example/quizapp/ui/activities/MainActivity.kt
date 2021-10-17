package com.example.quizapp.ui.activities

import android.view.LayoutInflater
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.quizapp.R
import com.example.quizapp.core.ui.BaseActivity
import com.example.quizapp.databinding.ActivityMainBinding
import com.example.quizapp.local.ResultDataBase
import com.example.quizapp.ui.fragments.quiz.MainViewModel
import com.example.quizapp.ui.repository.QuizViewModelProviderFactory
import com.example.quizapp.ui.repository.Repository
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val viewModel: MainViewModel by viewModel()
    override fun setupUI() {

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavView.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.quizFragment -> showBottomNav()
                R.id.settingsFragment -> showBottomNav()
                R.id.historyFragment -> showBottomNav()
                R.id.gameFragment -> hideBottomNav()
                else -> hideBottomNav()
            }
        }
    }

    private fun showBottomNav() {
        binding.bottomNavView.visibility = View.VISIBLE

    }

    private fun hideBottomNav() {
        binding.bottomNavView.visibility = View.GONE

    }

    override fun setupLiveData() {

//        val repository = Repository(ResultDataBase(this))
//        val viewModelProviderFactory = QuizViewModelProviderFactory(repository)
//        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(MainViewModel::class.java)

    }

    override fun inflateBinding(from: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}

