package com.wildan.ndarusapp.ui.belajar.tajwid.idgham

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.wildan.ndarusapp.databinding.ActivityIdghamBinding
import com.wildan.ndarusapp.ui.base.BaseActivity

class IdghamActivity : BaseActivity() {

    private lateinit var binding: ActivityIdghamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIdghamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(IdghamViewModel::class.java)
        val idgham = viewModel.getIdgham()

        val idghamAdapter = IdghamAdapter()
        idghamAdapter.setIdgham(idgham)

        binding.rvIdgham.layoutManager = LinearLayoutManager(this)
        binding.rvIdgham.setHasFixedSize(true)
        binding.rvIdgham.adapter = idghamAdapter

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}