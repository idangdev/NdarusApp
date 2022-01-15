package com.wildan.ndarusapp.ui.muqodimah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityMuqodimahBinding
import com.wildan.ndarusapp.ui.base.BaseActivity

class MuqodimahActivity : BaseActivity() {

    private lateinit var binding: ActivityMuqodimahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMuqodimahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPendahuluan.setOnClickListener {
            val intent = Intent(Intent(applicationContext, PendahuluActivity::class.java))
            startActivity(intent)
        }

        binding.btnTartilTajwid.setOnClickListener {
            val intent = Intent(Intent(applicationContext, TajwidTartilActivity::class.java))
            startActivity(intent)
        }

        binding.btnKiat.setOnClickListener {
            val intent = Intent(Intent(applicationContext, KiatSuksesActivity::class.java))
            startActivity(intent)
        }

        binding.btnHijaiyah.setOnClickListener {
            val intent = Intent(Intent(applicationContext, HurufHijaiyahActivity::class.java))
            startActivity(intent)
        }

        binding.btnHarokat.setOnClickListener {
            val intent = Intent(Intent(applicationContext, HarokatActivity::class.java))
            startActivity(intent)
        }

        binding.btnTempat.setOnClickListener {
            val intent = Intent(Intent(applicationContext, TempatKeluarHurufActivity::class.java))
            startActivity(intent)
        }

        binding.btnHukumTajwid.setOnClickListener {
            val intent = Intent(Intent(applicationContext, HukumTajwidActivity::class.java))
            startActivity(intent)
        }

        binding.btnSifatulHuruf.setOnClickListener {
            val intent = Intent(Intent(applicationContext, SifatulHurufActivity::class.java))
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }



    }
}