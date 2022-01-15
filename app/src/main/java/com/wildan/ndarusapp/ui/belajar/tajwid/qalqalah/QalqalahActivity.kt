package com.wildan.ndarusapp.ui.belajar.tajwid.qalqalah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.wildan.ndarusapp.databinding.ActivityQalqalahBinding
import com.wildan.ndarusapp.ui.base.BaseActivity

class QalqalahActivity : BaseActivity() {

    private lateinit var binding : ActivityQalqalahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQalqalahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(QalqalahViewModel::class.java)
        val qalqalah = viewModel.getQalqalah()

        val qalqalahAdapter = QalqalahAdapter()
        qalqalahAdapter.setQalqalah(qalqalah)

        binding.rvQalqalah.layoutManager = LinearLayoutManager(this)
        binding.rvQalqalah.setHasFixedSize(true)
        binding.rvQalqalah.adapter = qalqalahAdapter

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}