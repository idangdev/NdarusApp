package com.wildan.ndarusapp.ui.quiz.teori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityQuizTeoriDoneBinding
import com.wildan.ndarusapp.ui.home.HomeActivity

class QuizTeoriDoneActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_SCORE = "extra_score"
        const val EXTRA_TOTAL_SOAL = "extra_total_soal"
    }

    private lateinit var binding: ActivityQuizTeoriDoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizTeoriDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra(EXTRA_SCORE, 0)
        val jumlah_soal = intent.getIntExtra(EXTRA_TOTAL_SOAL, 0)

        binding.tvScore.text = score.toString()
        binding.tvJumlahSoal.text = jumlah_soal.toString()

        binding.btnSelesai.setOnClickListener {
            finish()
        }
    }
}