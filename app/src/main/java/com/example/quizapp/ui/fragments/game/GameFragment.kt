package com.example.quizapp.ui.fragments.game

import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.quizapp.core.ui.BaseFragment
import com.example.quizapp.databinding.FragmentGameBinding
import com.example.quizapp.ui.fragments.quiz.MainViewModel
import com.example.youtubeapi.core.network.Status
import org.koin.androidx.viewmodel.ext.android.viewModel

class GameFragment : BaseFragment<FragmentGameBinding>(FragmentGameBinding::inflate) {

    override val viewModel: MainViewModel by viewModel()

    private var category: Int = 0
    private var amount: Int = 0
    private var difficulty: String = ""

    private var incorrectAnswers1 = arrayOf("", "", "")
    private var incorrectAnswers2 = arrayOf("", "", "")
    private var incorrectAnswers3 = arrayOf("", "", "")
    private var incorrectAnswers4 = arrayOf("", "", "")
    private var incorrectAnswers5 = arrayOf("", "", "")
    private var incorrectAnswers6 = arrayOf("", "", "")
    private var incorrectAnswers7 = arrayOf("", "", "")
    private var incorrectAnswers8 = arrayOf("", "", "")
    private var incorrectAnswers9 = arrayOf("", "", "")
    private var correctAnswers = arrayOf("", "", "", "", "", "", "", "", "", "")
    private var questions = arrayOf("", "", "", "", "", "", "", "", "", "")

    override fun setupLiveData() {

        binding.btnSkip.setOnClickListener {

            viewModel.sliderAmount.observe(viewLifecycleOwner, {

                Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
                amount = it
                Log.d("tag", it.toString())

            })

        }


        viewModel.spinnerCategory.observe(viewLifecycleOwner, {
            category = it
        })

        viewModel.spinnerDifficulty.observe(viewLifecycleOwner, {
            difficulty = it
        })

        viewModel.getAllQuestions(amount, category, difficulty, "multiple")
            .observe(viewLifecycleOwner, {


//                questions[0] = it.data?.results?.get(0)?.question.toString()
//                questions[1] = it.data?.results?.get(1)?.question.toString()
//                questions[2] = it.data?.results?.get(2)?.question.toString()
//                questions[3] = it.data?.results?.get(3)?.question.toString()
//                questions[4] = it.data?.results?.get(4)?.question.toString()
//                questions[5] = it.data?.results?.get(5)?.question.toString()
//                questions[6] = it.data?.results?.get(6)?.question.toString()
//                questions[7] = it.data?.results?.get(7)?.question.toString()
//                questions[8] = it.data?.results?.get(8)?.question.toString()
//                questions[9] = it.data?.results?.get(9)?.question.toString()
//
//                correctAnswers[0] = it.data?.results?.get(0)?.correct_answer.toString()
//                correctAnswers[1] = it.data?.results?.get(1)?.correct_answer.toString()
//                correctAnswers[2] = it.data?.results?.get(2)?.correct_answer.toString()
//                correctAnswers[3] = it.data?.results?.get(3)?.correct_answer.toString()
//                correctAnswers[4] = it.data?.results?.get(4)?.correct_answer.toString()
//                correctAnswers[5] = it.data?.results?.get(5)?.correct_answer.toString()
//                correctAnswers[6] = it.data?.results?.get(6)?.correct_answer.toString()
//                correctAnswers[7] = it.data?.results?.get(7)?.correct_answer.toString()
//                correctAnswers[8] = it.data?.results?.get(8)?.correct_answer.toString()
//                correctAnswers[9] = it.data?.results?.get(9)?.correct_answer.toString()
//
//                incorrectAnswers1[0] =
//                    it.data?.results?.get(1)?.incorrect_answers?.get(0).toString()
//                incorrectAnswers1[1] =
//                    it.data?.results?.get(1)?.incorrect_answers?.get(1).toString()
//                incorrectAnswers1[2] =
//                    it.data?.results?.get(1)?.incorrect_answers?.get(2).toString()
//
//                incorrectAnswers2[0] =
//                    it.data?.results?.get(2)?.incorrect_answers?.get(0).toString()
//                incorrectAnswers2[1] =
//                    it.data?.results?.get(2)?.incorrect_answers?.get(1).toString()
//                incorrectAnswers2[2] =
//                    it.data?.results?.get(2)?.incorrect_answers?.get(2).toString()
//
//                incorrectAnswers3[0] =
//                    it.data?.results?.get(3)?.incorrect_answers?.get(0).toString()
//                incorrectAnswers3[1] =
//                    it.data?.results?.get(3)?.incorrect_answers?.get(1).toString()
//                incorrectAnswers3[2] =
//                    it.data?.results?.get(3)?.incorrect_answers?.get(2).toString()
//
//                incorrectAnswers4[0] =
//                    it.data?.results?.get(4)?.incorrect_answers?.get(0).toString()
//                incorrectAnswers4[1] =
//                    it.data?.results?.get(4)?.incorrect_answers?.get(1).toString()
//                incorrectAnswers4[2] =
//                    it.data?.results?.get(4)?.incorrect_answers?.get(2).toString()
//
//                incorrectAnswers5[0] =
//                    it.data?.results?.get(5)?.incorrect_answers?.get(0).toString()
//                incorrectAnswers5[1] =
//                    it.data?.results?.get(5)?.incorrect_answers?.get(1).toString()
//                incorrectAnswers5[2] =
//                    it.data?.results?.get(5)?.incorrect_answers?.get(2).toString()
//
//                incorrectAnswers6[0] =
//                    it.data?.results?.get(6)?.incorrect_answers?.get(0).toString()
//                incorrectAnswers6[1] =
//                    it.data?.results?.get(6)?.incorrect_answers?.get(1).toString()
//                incorrectAnswers6[2] =
//                    it.data?.results?.get(6)?.incorrect_answers?.get(2).toString()
//
//                incorrectAnswers7[0] =
//                    it.data?.results?.get(7)?.incorrect_answers?.get(0).toString()
//                incorrectAnswers7[1] =
//                    it.data?.results?.get(7)?.incorrect_answers?.get(1).toString()
//                incorrectAnswers7[2] =
//                    it.data?.results?.get(7)?.incorrect_answers?.get(2).toString()
//
//                incorrectAnswers8[0] =
//                    it.data?.results?.get(8)?.incorrect_answers?.get(0).toString()
//                incorrectAnswers8[1] =
//                    it.data?.results?.get(8)?.incorrect_answers?.get(1).toString()
//                incorrectAnswers8[2] =
//                    it.data?.results?.get(8)?.incorrect_answers?.get(2).toString()
//
//                incorrectAnswers9[0] =
//                    it.data?.results?.get(9)?.incorrect_answers?.get(0).toString()
//                incorrectAnswers9[1] =
//                    it.data?.results?.get(9)?.incorrect_answers?.get(1).toString()
//                incorrectAnswers9[2] =
//                    it.data?.results?.get(9)?.incorrect_answers?.get(2).toString()
//
//                when (it.status) {
//                    Status.SUCCESS -> {
//
//                        binding.progressBar.visibility = View.GONE
//
//                        binding.tvHeaderCategory.text =
//                            it.data?.results?.get(0)?.category.toString()
//                        binding.tvQuestion.text = it.data?.results?.get(0)?.question.toString()
//                        binding.btnFirst.text =
//                            it.data?.results?.get(0)?.correct_answer.toString()
//                        binding.btnSecond.text =
//                            it.data?.results?.get(0)?.incorrect_answers?.get(0).toString()
//                        binding.btnThird.text =
//                            it.data?.results?.get(0)?.incorrect_answers?.get(1).toString()
//                        binding.btnFourth.text =
//                            it.data?.results?.get(0)?.incorrect_answers?.get(2).toString()
//
//                    }
//                    Status.ERROR -> {
//                        binding.progressBar.visibility = View.GONE
//                        Toast.makeText(
//                            requireContext(),
//                            it.message.toString(),
//                            Toast.LENGTH_SHORT
//                        )
//                            .show()
//                    }
//                    Status.LOADING -> {
//                        binding.progressBar.visibility = View.VISIBLE
//                    }
//                }
//
//                binding.btnFirst.setOnClickListener {
//
//                    if (binding.btnFirst.text == correctAnswers[0]) {
//                        binding.sliderCount.value = (2).toFloat()
//                        binding.tvQuestion.text = questions[1]
//                        binding.btnSecond.text = correctAnswers[1]
//                        binding.btnFirst.text = incorrectAnswers1[0]
//                        binding.btnThird.text = incorrectAnswers1[1]
//                        binding.btnFourth.text = incorrectAnswers1[2]
//                    }
//
//                    if (binding.btnFirst.text == correctAnswers[4]) {
//                        binding.sliderCount.value = (6).toFloat()
//                        binding.tvQuestion.text = questions[5]
//                        binding.btnThird.text = correctAnswers[5]
//                        binding.btnFirst.text = incorrectAnswers5[0]
//                        binding.btnSecond.text = incorrectAnswers5[1]
//                        binding.btnFourth.text = incorrectAnswers5[2]
//                    }
//                }
//                binding.btnSecond.setOnClickListener {
//                    if (binding.btnSecond.text == correctAnswers[1]) {
//                        binding.sliderCount.value = (3).toFloat()
//                        binding.tvQuestion.text = questions[2]
//                        binding.btnFourth.text = correctAnswers[2]
//                        binding.btnFirst.text = incorrectAnswers2[0]
//                        binding.btnThird.text = incorrectAnswers2[1]
//                        binding.btnSecond.text = incorrectAnswers2[2]
//                    }
//                    if (binding.btnSecond.text == correctAnswers[6]) {
//                        binding.sliderCount.value = (8).toFloat()
//                        binding.tvQuestion.text = questions[7]
//                        binding.btnFourth.text = correctAnswers[7]
//                        binding.btnFirst.text = incorrectAnswers7[0]
//                        binding.btnThird.text = incorrectAnswers7[1]
//                        binding.btnSecond.text = incorrectAnswers7[2]
//                    }
//                    if (binding.btnSecond.text == correctAnswers[9]) {
//                        Toast.makeText(requireContext(), "finish", Toast.LENGTH_SHORT).show()
//                    }
//
//                }
//
//                binding.btnThird.setOnClickListener {
//                    if (binding.btnThird.text == correctAnswers[3]) {
//                        binding.sliderCount.value = (5).toFloat()
//                        binding.tvQuestion.text = questions[4]
//                        binding.btnFirst.text = correctAnswers[4]
//                        binding.btnThird.text = incorrectAnswers4[0]
//                        binding.btnFourth.text = incorrectAnswers4[1]
//                        binding.btnSecond.text = incorrectAnswers4[2]
//                    }
//
//                    if (binding.btnThird.text == correctAnswers[5]) {
//                        binding.sliderCount.value = (7).toFloat()
//                        binding.tvQuestion.text = questions[6]
//                        binding.btnSecond.text = correctAnswers[6]
//                        binding.btnThird.text = incorrectAnswers6[0]
//                        binding.btnFourth.text = incorrectAnswers6[1]
//                        binding.btnFirst.text = incorrectAnswers6[2]
//                    }
//
//                    if (binding.btnThird.text == correctAnswers[8]) {
//                        binding.sliderCount.value = (10).toFloat()
//                        binding.tvQuestion.text = questions[9]
//                        binding.btnSecond.text = correctAnswers[9]
//                        binding.btnThird.text = incorrectAnswers9[0]
//                        binding.btnFourth.text = incorrectAnswers9[1]
//                        binding.btnFirst.text = incorrectAnswers9[2]
//                    }
//
//                }
//
//                binding.btnFourth.setOnClickListener {
//                    if (binding.btnFourth.text == correctAnswers[2]) {
//                        binding.sliderCount.value = (4).toFloat()
//                        binding.tvQuestion.text = questions[3]
//                        binding.btnThird.text = correctAnswers[3]
//                        binding.btnFirst.text = incorrectAnswers3[0]
//                        binding.btnFourth.text = incorrectAnswers3[1]
//                        binding.btnSecond.text = incorrectAnswers3[2]
//
//                    }
//                    if (binding.btnFourth.text == correctAnswers[7]) {
//                        binding.sliderCount.value = (9).toFloat()
//                        binding.tvQuestion.text = questions[8]
//                        binding.btnThird.text = correctAnswers[8]
//                        binding.btnFirst.text = incorrectAnswers8[0]
//                        binding.btnFourth.text = incorrectAnswers8[1]
//                        binding.btnSecond.text = incorrectAnswers8[2]
//
//                    }
//                }
//
            })

    }
        override fun setupUI() {

        }

    }