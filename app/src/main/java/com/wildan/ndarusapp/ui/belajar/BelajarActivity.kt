package com.wildan.ndarusapp.ui.belajar

import android.content.Intent
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityBelajarBinding
import com.wildan.ndarusapp.ui.base.BaseActivity
import com.wildan.ndarusapp.ui.belajar.makhroj.MakhrojActivity
import com.wildan.ndarusapp.ui.belajar.tajwid.TajwidActivity

class BelajarActivity : BaseActivity() {

    private lateinit var binding: ActivityBelajarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBelajarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMakhroj.setOnClickListener {
            val intent = Intent(Intent(applicationContext, MakhrojActivity::class.java))
            startActivity(intent)
        }

        binding.btnTajwid.setOnClickListener {
            val intent = Intent(Intent(applicationContext, TajwidActivity::class.java))
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            finish()
        }


    }
}