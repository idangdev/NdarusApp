package com.wildan.ndarusapp.ui.quiz.teori

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityQuizTeoriBinding

class QuizTeoriActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizTeoriBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizTeoriBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}