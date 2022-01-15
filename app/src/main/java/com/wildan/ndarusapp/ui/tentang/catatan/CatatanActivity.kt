package com.wildan.ndarusapp.ui.tentang.catatan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityCatatanBinding
import com.wildan.ndarusapp.ui.base.BaseActivity

class CatatanActivity : BaseActivity() {

    private lateinit var binding: ActivityCatatanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatatanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener{
            finish()
        }
    }
}