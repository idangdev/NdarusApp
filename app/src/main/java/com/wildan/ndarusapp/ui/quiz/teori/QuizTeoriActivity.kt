package com.wildan.ndarusapp.ui.quiz.teori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.wildan.ndarusapp.databinding.ActivityQuizTeoriBinding

class QuizTeoriActivity : AppCompatActivity() {

    private var PILGAN: String? = null

    val questions = arrayOf(
        "Siapa nama presiden pertama?",
        "Siapa nama presiden sekarang?",
        "Apa nama ibu kota indonesia?"
    )

    val answers = arrayOf(
        "SBY", "Jokowi", "Soekarno",
        "Jokowi", "Soekarno", "SBY",
        "Jakarta", "Pemalang", "Tegal"
    )

    val correct_answers = arrayOf(
        "Soekarno",
        "Jokowi",
        "Jakarta"
    )

    var current_question = 0
    var current_answer_a = 0
    var current_answer_b = 1
    var current_answer_c = 2
    var current_correct_answer = 0
    val jumlah_soal = questions.size
    var score = 0

    private lateinit var binding: ActivityQuizTeoriBinding
    private var radioButton: RadioButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizTeoriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvJumlahSoal.text = questions.size.toString()
        binding.tvNoSoal.text = "${current_question + 1}"
        binding.tvPertanyaan.text = questions[current_question]
        binding.rbA.text = answers[current_answer_a]
        binding.rbB.text = answers[current_answer_b]
        binding.rbC.text = answers[current_answer_c]

        binding.rgPilgan.setOnCheckedChangeListener { radioGroup, checkedId ->
            radioButton = findViewById<RadioButton>(radioGroup.checkedRadioButtonId)
            PILGAN = radioButton?.text.toString()
//            Toast.makeText(applicationContext, PILGAN, Toast.LENGTH_SHORT).show()
        }

        binding.btnNext.setOnClickListener {
            if (PILGAN == correct_answers[current_correct_answer]){
                score++
            }
            nextQuestion(binding)
//            Toast.makeText(applicationContext, "$score", Toast.LENGTH_SHORT).show()
            binding.rgPilgan.clearCheck()
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    fun nextQuestion(binding: ActivityQuizTeoriBinding){
        current_question++
        current_answer_a+=3
        current_answer_b+=3
        current_answer_c+=3
        current_correct_answer++

        if (current_question < questions.size){
            binding.tvNoSoal.text = "${current_question + 1}"
            binding.tvPertanyaan.text = questions[current_question]
            binding.rbA.text = answers[current_answer_a]
            binding.rbB.text = answers[current_answer_b]
            binding.rbC.text = answers[current_answer_c]
            if (current_question == questions.size - 1){
                binding.btnNext.text = "Submit"
            }
//            Toast.makeText(applicationContext, "Berhasil", Toast.LENGTH_SHORT).show()
        }else{
//            Toast.makeText(applicationContext, "score $score/$jumlah_soal", Toast.LENGTH_SHORT).show()
            val intent = Intent(applicationContext, QuizTeoriDoneActivity::class.java)
            intent.putExtra(QuizTeoriDoneActivity.EXTRA_SCORE, score)
            intent.putExtra(QuizTeoriDoneActivity.EXTRA_TOTAL_SOAL, jumlah_soal)
            startActivity(intent)
            finish()
        }
    }
}