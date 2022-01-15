package com.wildan.ndarusapp.ui.belajar.tajwid.mimsukun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.wildan.ndarusapp.databinding.ActivityMimSukunBinding
import com.wildan.ndarusapp.ui.base.BaseActivity

class MimSukunActivity : BaseActivity() {

    private lateinit var binding: ActivityMimSukunBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMimSukunBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MimSukunViewModel::class.java)
        val mimSukun = viewModel.getMimSukun()

        val mimSukunAdapter = MimSukunAdapter()
        mimSukunAdapter.setMimSukun(mimSukun)

        binding.rvMimSukun.layoutManager = LinearLayoutManager(this)
        binding.rvMimSukun.setHasFixedSize(true)
        binding.rvMimSukun.adapter = mimSukunAdapter

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}