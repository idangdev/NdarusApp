package com.wildan.ndarusapp.ui.quiz.praktik

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.wildan.ndarusapp.R
import com.wildan.ndarusapp.data.AlFalaqEntity
import com.wildan.ndarusapp.data.AlIkhlashEntity
import com.wildan.ndarusapp.databinding.ActivityQuizPraktikBinding
import com.wildan.ndarusapp.ui.quiz.praktik.alfalaq.AlFalaqActivity
import com.wildan.ndarusapp.ui.quiz.praktik.alikhlash.AlIkhlashActivity
import com.wildan.ndarusapp.ui.quiz.praktik.annas.AnNasActivity

class QuizPraktikActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizPraktikBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizPraktikBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAnNas.setOnClickListener {
            val intent = Intent(this, AnNasActivity::class.java)
            startActivity(intent)
        }

        binding.btnAlFalaq.setOnClickListener {
            val intent = Intent(this, AlFalaqActivity::class.java)
            startActivity(intent)
        }

        binding.btnAlIkhlash.setOnClickListener {
            val intent = Intent(this, AlIkhlashActivity::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }

}