package com.example.quizapp.ui.fragments.quiz

import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.quizapp.R
import com.example.quizapp.core.ui.BaseFragment
import com.example.quizapp.databinding.FragmentQuizBinding
import com.example.youtubeapi.core.network.Status
import com.google.android.material.slider.Slider
import org.koin.androidx.viewmodel.ext.android.viewModel

class QuizFragment : BaseFragment<FragmentQuizBinding>(FragmentQuizBinding::inflate),
    AdapterView.OnItemSelectedListener {

    override val viewModel: MainViewModel by viewModel()

    private var category: Int = 0
    private var difficulty: String = ""


    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        if (parent?.id == R.id.spinner) {
            when (position) {
                0 -> category = 0
                1 -> category = 17
                2 -> category = 18
                3 -> category = 19
                4 -> category = 20
                5 -> category = 21
                6 -> category = 22
                7 -> category = 23
                8 -> category = 24
                9 -> category = 25
                10 -> category = 26
                11 -> category = 27
            }
            viewModel.setSpinnerCategory(category)
            Toast.makeText(requireContext(),category.toString(),Toast.LENGTH_SHORT).show()

        } else if (parent?.id == R.id.spinner_2) {
            difficulty = binding.spinner2.selectedItem.toString()
            viewModel.setSpinnerDifficulty(difficulty)

            Toast.makeText(requireContext(),difficulty,Toast.LENGTH_SHORT).show()
        }

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {}

    override fun setupLiveData() {

    }

    override fun setupUI() {

        ArrayAdapter.createFromResource(
            requireContext(), R.array.category, android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spinner.adapter = adapter
            binding.spinner.onItemSelectedListener = this
        }

        ArrayAdapter.createFromResource(
            requireContext(), R.array.difficulty, android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spinner2.adapter = adapter
            binding.spinner2.onItemSelectedListener = this
        }

        binding.slider.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
            override fun onStartTrackingTouch(slider: Slider) {}

            override fun onStopTrackingTouch(slider: Slider) {

                viewModel.setSliderAmount(slider.value.toInt())
                Toast.makeText(requireContext(),slider.value.toString(),Toast.LENGTH_SHORT).show()

            }

        })

        binding.btnStart.setOnClickListener {

            findNavController().navigate(R.id.action_quizFragment_to_gameFragment)

        }

    }

}