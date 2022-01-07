package com.wildan.ndarusapp.ui.belajar.tajwid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityTajwidBinding
import com.wildan.ndarusapp.ui.base.BaseActivity
import com.wildan.ndarusapp.ui.belajar.tajwid.aliflam.AlifLamActivity
import com.wildan.ndarusapp.ui.belajar.tajwid.idgham.IdghamActivity
import com.wildan.ndarusapp.ui.belajar.tajwid.lamjalalah.LamJalalahActivity
import com.wildan.ndarusapp.ui.belajar.tajwid.mad.MadActivity
import com.wildan.ndarusapp.ui.belajar.tajwid.mimsukun.MimSukunActivity
import com.wildan.ndarusapp.ui.belajar.tajwid.nunsukundantanwin.NunSukunTanwinActivity
import com.wildan.ndarusapp.ui.belajar.tajwid.qalqalah.QalqalahActivity
import com.wildan.ndarusapp.ui.belajar.tajwid.ro.RoActivity

class TajwidActivity : BaseActivity() {

    private lateinit var binding: ActivityTajwidBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTajwidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMad.setOnClickListener {
            val intent = Intent(Intent(applicationContext, MadActivity::class.java))
            startActivity(intent)
        }

        binding.btnQalqalah.setOnClickListener {
            val intent = Intent(Intent(applicationContext, QalqalahActivity::class.java))
            startActivity(intent)
        }

        binding.btnLamJalalah.setOnClickListener {
            val intent = Intent(Intent(applicationContext, LamJalalahActivity::class.java))
            startActivity(intent)
        }

        binding.btnMimSukun.setOnClickListener {
            val intent = Intent(Intent(applicationContext, MimSukunActivity::class.java))
            startActivity(intent)
        }

        binding.btnNunSukunTanwin.setOnClickListener {
            val intent = Intent(Intent(applicationContext, NunSukunTanwinActivity::class.java))
            startActivity(intent)
        }

        binding.btnIdgham.setOnClickListener {
            val intent = Intent(Intent(applicationContext, IdghamActivity::class.java))
            startActivity(intent)
        }

        binding.btnAlifLam.setOnClickListener {
            val intent = Intent(Intent(applicationContext, AlifLamActivity::class.java))
            startActivity(intent)
        }

        binding.btnRo.setOnClickListener {
            val intent = Intent(Intent(applicationContext, RoActivity::class.java))
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }

    }
}