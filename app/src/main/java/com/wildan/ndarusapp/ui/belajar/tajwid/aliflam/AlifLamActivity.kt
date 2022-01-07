package com.wildan.ndarusapp.ui.belajar.tajwid.aliflam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.wildan.ndarusapp.databinding.ActivityAlifLamBinding

class AlifLamActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAlifLamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlifLamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(AlifLamViewModel::class.java)
        val alifLam = viewModel.getAlifLam()

        val alifLamAdapter = AlifLamAdapter()
        alifLamAdapter.setAlifLam(alifLam)

        binding.rvAlifLam.layoutManager = LinearLayoutManager(this)
        binding.rvAlifLam.setHasFixedSize(true)
        binding.rvAlifLam.adapter = alifLamAdapter

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}