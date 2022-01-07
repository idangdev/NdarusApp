package com.wildan.ndarusapp.ui.belajar.tajwid.nunsukundantanwin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.wildan.ndarusapp.databinding.ActivityNunSukunTanwinBinding

class NunSukunTanwinActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNunSukunTanwinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNunSukunTanwinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(NunSukunTanwinViewModel::class.java)
        val nunSukunTanwin = viewModel.getNunSukunTanwin()

        val nunSukunTanwinAdapter = NunSukunTanwinAdapter()
        nunSukunTanwinAdapter.setNunSukunTanwin(nunSukunTanwin)

        binding.rvNunSukunTanwin.layoutManager = LinearLayoutManager(this)
        binding.rvNunSukunTanwin.setHasFixedSize(true)
        binding.rvNunSukunTanwin.adapter = nunSukunTanwinAdapter

        binding.btnBack.setOnClickListener {
            finish()
        }

    }
}