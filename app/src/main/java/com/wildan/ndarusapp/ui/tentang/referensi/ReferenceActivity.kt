package com.wildan.ndarusapp.ui.tentang.referensi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityReferenceBinding

class ReferenceActivity : AppCompatActivity() {

    private lateinit var binding : ActivityReferenceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReferenceBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnBack.setOnClickListener{
            finish()
        }
    }
}