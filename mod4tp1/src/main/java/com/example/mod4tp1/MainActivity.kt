package com.example.mod4tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mod4tp1.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var lQuestion = mutableListOf<QuestionAnswer>()
    var score: Int = 0
    var index: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        lQuestion.add(QuestionAnswer("Est-ce qu'il va neiger demain ?", false))
        lQuestion.add(QuestionAnswer("2 + 2 = 5", true))
        lQuestion.add(QuestionAnswer("Est-ce que la terre est plate ?", true))

        //j'associe la première question à mno layout
        binding.qa = lQuestion[index]

        binding.buttonTrue.setOnClickListener {
            checkAnswer(true, lQuestion[index].response)
        }
        binding.buttonFalse.setOnClickListener {
            checkAnswer(false, lQuestion[index].response)
        }
    }
    fun checkAnswer(buttonValue: Boolean, answerValue: Boolean) {
        if (buttonValue == answerValue) {
            score++
            binding.score = score
            Snackbar.make(binding.tvScore, "Bonne réponse !", Snackbar.LENGTH_SHORT).show()
        } else {
            Snackbar.make(binding.tvScore, "Mauvaise réponse !", Snackbar.LENGTH_SHORT).show()
        }
        index++
        if (index < lQuestion.size) {
            binding.qa = lQuestion[index]
        } else {
            binding.buttonTrue.isEnabled = false
            binding.buttonFalse.isEnabled = false
        }
    }
}