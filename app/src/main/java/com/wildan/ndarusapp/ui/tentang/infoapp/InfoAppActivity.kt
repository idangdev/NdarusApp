package com.wildan.ndarusapp.ui.tentang.infoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityInfoAppBinding

class InfoAppActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}