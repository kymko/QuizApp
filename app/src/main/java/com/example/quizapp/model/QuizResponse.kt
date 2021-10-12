package com.example.quizapp.model

data class QuizResponse(
    val response_code: Int, // 0
    val results: List<Result>
) {
    data class Result(
        val category: String, // Entertainment: Video Games
        val correct_answer: String, // Lily of the Valley
        val difficulty: String, // hard
        val incorrect_answers: ArrayList<String>,
        val question: String, // In the Animal Crossing series, which flower is erroneously called the &quot;Jacob&#039;s Ladder&quot;?
        val type: String // multiple
    )
}