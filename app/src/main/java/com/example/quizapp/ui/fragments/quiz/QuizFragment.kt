package com.example.quizapp.ui.fragments.quiz

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.quizapp.R
import com.example.quizapp.databinding.FragmentQuizBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class QuizFragment : Fragment(), AdapterView.OnItemSelectedListener {

    private lateinit var binding: FragmentQuizBinding
    private val viewModel: QuizViewModel by viewModel()
    private var category: Int = 0
    private var difficulty: String = ""

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

        ArrayAdapter.createFromResource(
            requireContext(), R.array.category, android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spinner.adapter = adapter
            binding.spinner.onItemSelectedListener = this
        }

//        ArrayAdapter.createFromResource(
//            requireContext(), R.array.difficulty, android.R.layout.simple_spinner_item
//        ).also { adapter ->
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            binding.spinner2.adapter = adapter
//            binding.spinner.onItemSelectedListener = this
//        }


        binding.btnStart.setOnClickListener {

            viewModel.getAllQuestions(10, category, "easy").observe(requireActivity(), {

                Log.d("tag", it.data?.results?.get(0)?.question.toString())

            })

        }

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        when (position) {
            0 -> category = 10
            1 -> category = 18
            2 -> category = 19
            3 -> category = 20
            4 -> category = 21
            5 -> category = 22
            6 -> category = 23
            7 -> category = 24
            8 -> category = 25
            9 -> category = 26
            10 -> category = 27
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

}