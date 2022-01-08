package com.wildan.ndarusapp.ui.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnQuizTeori.setOnClickListener {

        }

        binding.btnQuizPraktik.setOnClickListener {

        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}