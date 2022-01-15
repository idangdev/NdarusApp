package com.wildan.ndarusapp.ui.quiz.teori

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityQuizTeoriDoneBinding
import com.wildan.ndarusapp.ui.base.BaseActivity
import com.wildan.ndarusapp.ui.home.HomeActivity

class QuizTeoriDoneActivity : BaseActivity() {

    companion object{
        const val EXTRA_SCORE = "extra_score"
    }

    private lateinit var binding: ActivityQuizTeoriDoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizTeoriDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra(EXTRA_SCORE, 0)

        binding.tvScore.text = score.toString()
        binding.tvJumlahSoal.text = "10"

        binding.btnSelesai.setOnClickListener {
            finish()
        }
    }
}