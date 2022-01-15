package com.wildan.ndarusapp.ui.belajar.tajwid.lamjalalah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.wildan.ndarusapp.databinding.ActivityLamJalalahBinding
import com.wildan.ndarusapp.ui.base.BaseActivity

class LamJalalahActivity : BaseActivity() {

    private lateinit var binding: ActivityLamJalalahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLamJalalahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(LamJalalahViewModel::class.java)
        val lamJalalah = viewModel.getLamJalalah()

        val lamJalalahAdapter = LamJalalahAdapter()
        lamJalalahAdapter.setLamJalalah(lamJalalah)

        binding.rvLamJalalah.layoutManager = LinearLayoutManager(this)
        binding.rvLamJalalah.setHasFixedSize(true)
        binding.rvLamJalalah.adapter = lamJalalahAdapter

        binding.btnBack.setOnClickListener {
            finish()
        }

    }
}