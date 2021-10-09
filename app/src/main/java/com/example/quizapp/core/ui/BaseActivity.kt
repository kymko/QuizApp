package com.example.quizapp.core.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.core.ui.base.BaseViewModel

abstract class BaseActivity<VB:ViewBinding>() : AppCompatActivity(){

    protected lateinit var binding: VB
    protected abstract fun inflateBinding(from: LayoutInflater): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = inflateBinding(LayoutInflater.from(this))
        setContentView(binding.root)

        setupUI()
        setupLiveData()
    }


    abstract fun setupUI()
    abstract fun setupLiveData()


}