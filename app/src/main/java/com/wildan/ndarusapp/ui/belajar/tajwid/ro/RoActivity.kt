package com.wildan.ndarusapp.ui.belajar.tajwid.ro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.wildan.ndarusapp.databinding.ActivityRoBinding

class RoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(RoViewModel::class.java)
        val ro = viewModel.getRo()

        val roAdapter = RoAdapter()
        roAdapter.setRo(ro)

        binding.rvRo.layoutManager = LinearLayoutManager(this)
        binding.rvRo.setHasFixedSize(true)
        binding.rvRo.adapter = roAdapter

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}