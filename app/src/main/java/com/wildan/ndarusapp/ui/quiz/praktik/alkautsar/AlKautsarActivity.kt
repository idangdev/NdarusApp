package com.wildan.ndarusapp.ui.quiz.praktik.alkautsar

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
import com.wildan.ndarusapp.data.AlKautsarEntity
import com.wildan.ndarusapp.databinding.ActivityAlKautsarBinding
import com.wildan.ndarusapp.ui.base.BaseActivity

class AlKautsarActivity : BaseActivity() {

    private lateinit var binding: ActivityAlKautsarBinding
    private var listAlKautsar = ArrayList<AlKautsarEntity>()

    var current_position = 0
    var score = 0
    var jumlahAyat = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlKautsarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(AlKautsarViewModel::class.java)
        val alKautsar = viewModel.getAlKautsar()

        listAlKautsar.addAll(alKautsar)
        jumlahAyat = listAlKautsar.size
        binding.tvNo.text = "Ayat ${listAlKautsar[current_position].ayatId}"

        binding.btnMic.setOnClickListener {
            checkAudioPermission()
            binding.btnMic.setColorFilter(ContextCompat.getColor(this, R.color.mic_enabled_color))
            startSpeechToText()
        }
        binding.btnBack.setOnClickListener {
            finish()
        }

    }

    private fun startSpeechToText() {
        val speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this)
        val speechRecognizerIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)

        speechRecognizerIntent.putExtra(
            RecognizerIntent.EXTRA_LANGUAGE_MODEL,
            RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
        )
        speechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ar")

        speechRecognizer.setRecognitionListener(object : RecognitionListener {
            override fun onReadyForSpeech(p0: Bundle?) {}

            override fun onBeginningOfSpeech() {}

            override fun onRmsChanged(p0: Float) {}

            override fun onBufferReceived(p0: ByteArray?) {}

            override fun onEndOfSpeech() {
                binding.btnMic.setColorFilter(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.mic_disabled_color
                    )
                )
            }

            override fun onError(p0: Int) {}
            override fun onResults(bundle: Bundle) {
                val result = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
                if (result != null) {
                    if (current_position < listAlKautsar.size - 1) {
                        if (result[0] == listAlKautsar[current_position].ayat) {
                            current_position++
                            binding.tvNo.text = "Ayat ${listAlKautsar[current_position].ayatId}"
                            score++
                            Toast.makeText(applicationContext, "Benar", Toast.LENGTH_SHORT).show()
                        } else {
                            current_position++
                            binding.tvNo.text = "Ayat ${listAlKautsar[current_position].ayatId}"
                            Toast.makeText(applicationContext, "Kurang Tepat", Toast.LENGTH_SHORT)
                                .show()
                        }
                    } else if (result[0] == listAlKautsar[current_position].ayat) {
                        score++
                        Toast.makeText(applicationContext, "Benar", Toast.LENGTH_SHORT).show()
                        val intent = Intent(applicationContext, AlKautsarDoneActivity::class.java)
                        intent.putExtra(AlKautsarDoneActivity.EXTRA_SCORE, score)
                        intent.putExtra(AlKautsarDoneActivity.EXTRA_JUMLAH_AYAT, jumlahAyat)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(applicationContext, "Kurang Tepat", Toast.LENGTH_SHORT)
                            .show()
                        val intent = Intent(applicationContext, AlKautsarDoneActivity::class.java)
                        intent.putExtra(AlKautsarDoneActivity.EXTRA_SCORE, score)
                        intent.putExtra(AlKautsarDoneActivity.EXTRA_JUMLAH_AYAT, jumlahAyat)
                        startActivity(intent)
                        finish()
                    }
                }
            }

            override fun onPartialResults(p0: Bundle?) {}

            override fun onEvent(p0: Int, p1: Bundle?) {}

        })
        speechRecognizer.startListening(speechRecognizerIntent)
    }

    private fun checkAudioPermission(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {  // M = 23
            if (ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") != PackageManager.PERMISSION_GRANTED) {
                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:com.wildan.ndarusapp"))
                startActivity(intent)
                Toast.makeText(this, "Allow Microphone Permission", Toast.LENGTH_SHORT).show()
            }
        }
    }
}