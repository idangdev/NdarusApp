package com.wildan.ndarusapp.ui.home

import android.content.Intent
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityHomeBinding
import com.wildan.ndarusapp.ui.base.BaseActivity
import com.wildan.ndarusapp.ui.belajar.BelajarActivity
import com.wildan.ndarusapp.ui.muqodimah.MuqodimahActivity
import com.wildan.ndarusapp.ui.quiz.QuizActivity

class HomeActivity : BaseActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMuqodimah.setOnClickListener {
            val intent = Intent(Intent(applicationContext, MuqodimahActivity::class.java))
            startActivity(intent)
        }

        binding.btnBelajar.setOnClickListener {
            val intent = Intent(Intent(applicationContext, BelajarActivity::class.java))
            startActivity(intent)
        }

        binding.btnQuiz.setOnClickListener {
            val intent = Intent(Intent(applicationContext, QuizActivity::class.java))
            startActivity(intent)
        }

    }
}