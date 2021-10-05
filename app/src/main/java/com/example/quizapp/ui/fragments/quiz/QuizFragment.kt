package com.example.quizapp.ui.fragments.quiz

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentQuizBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class QuizFragment : Fragment() {

    private lateinit var binding: FragmentQuizBinding
    private var viewModel: QuizViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuizBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        viewModel = ViewModelProvider(requireActivity()).get(QuizViewModel::class.java)

//        viewModel?.getAllQuestions()?.observe(requireActivity(),{
//            Log.d("tag",it.data?.category.toString())
//        })

        ArrayAdapter.createFromResource(
            requireContext(), R.array.planets_array, android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spinner.adapter = adapter
        }
    }


}