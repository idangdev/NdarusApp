package com.wildan.ndarusapp.ui.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityQuizBinding
import com.wildan.ndarusapp.ui.base.BaseActivity
import com.wildan.ndarusapp.ui.quiz.praktik.QuizPraktikActivity
import com.wildan.ndarusapp.ui.quiz.teori.QuizTeoriActivity

class QuizActivity : BaseActivity() {

    private lateinit var binding: ActivityQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnQuizTeori.setOnClickListener {
            val intent = Intent(applicationContext, QuizTeoriActivity::class.java)
            startActivity(intent)
        }

        binding.btnQuizPraktik.setOnClickListener {
            val intent = Intent(applicationContext, QuizPraktikActivity::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}