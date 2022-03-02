package com.wildan.ndarusapp.ui.quiz.praktik.alkautsar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityAlKautsarDoneBinding

class AlKautsarDoneActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_SCORE = "extra_score"
        const val EXTRA_JUMLAH_AYAT = "extra_jumlah_ayat"
    }

    private lateinit var binding: ActivityAlKautsarDoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlKautsarDoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra(EXTRA_SCORE, 0)
        val jumlahAyat = intent.getIntExtra(EXTRA_JUMLAH_AYAT, 0)

        binding.tvScore.text = score.toString()
        binding.tvJumlahAyat.text = jumlahAyat.toString()

        binding.btnSelesai.setOnClickListener {
            finish()
        }
    }
}