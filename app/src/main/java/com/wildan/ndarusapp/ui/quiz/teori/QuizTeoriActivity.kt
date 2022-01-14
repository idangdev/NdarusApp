package com.wildan.ndarusapp.ui.quiz.teori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.wildan.ndarusapp.data.QuizTeoriEntity
import com.wildan.ndarusapp.databinding.ActivityQuizTeoriBinding
import kotlin.random.Random

class QuizTeoriActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizTeoriBinding
    private var PILGAN: String? = null
    private var listQuizTeori = ArrayList<QuizTeoriEntity>()
    private var radioButton: RadioButton? = null

    var currentScore = 0
    var nomor = 1
    var currentPos = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizTeoriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(QuizTeoriViewModel::class.java)
        val quizTeori = viewModel.getQuizTeori()

        listQuizTeori.addAll(quizTeori)

        currentPos = Random.nextInt(listQuizTeori.size)
        setDataToViews(currentPos)

        binding.rgPilgan.setOnCheckedChangeListener { radioGroup, checkedId ->
            radioButton = findViewById(radioGroup.checkedRadioButtonId)
            PILGAN = radioButton?.text.toString()
        }

        binding.btnNext.setOnClickListener {
            if (PILGAN == listQuizTeori[currentPos].answer){
                currentScore++
            }
            nomor++
            binding.rgPilgan.clearCheck()
            currentPos = Random.nextInt(listQuizTeori.size)
            setDataToViews(currentPos)
        }

        binding.btnSubmit.setOnClickListener {
            if (PILGAN == listQuizTeori[currentPos].answer) {
                currentScore++
            }

            val intent = Intent(this, QuizTeoriDoneActivity::class.java)
            intent.putExtra(QuizTeoriDoneActivity.EXTRA_SCORE, currentScore)
            startActivity(intent)
            finish()
        }

        binding.btnBack.setOnClickListener {
            finish()
        }


    }

    private fun setDataToViews(currentPos: Int) {
        binding.tvNoSoal.text = "$nomor"
        binding.tvJumlahSoal.text = "10"
        if (nomor == 10){
            binding.btnNext.visibility = View.GONE
            binding.btnSubmit.visibility = View.VISIBLE
        }
        binding.tvPertanyaan.text = listQuizTeori[currentPos].question
        binding.rbA.text = listQuizTeori[currentPos].option1
        binding.rbB.text = listQuizTeori[currentPos].option2
        binding.rbC.text = listQuizTeori[currentPos].option3
    }

}