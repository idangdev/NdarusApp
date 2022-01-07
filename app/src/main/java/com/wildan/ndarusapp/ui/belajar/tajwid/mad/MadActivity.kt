package com.wildan.ndarusapp.ui.belajar.tajwid.mad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.wildan.ndarusapp.databinding.ActivityMadBinding
import com.wildan.ndarusapp.ui.base.BaseActivity

class MadActivity : BaseActivity() {

    private lateinit var binding: ActivityMadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MadViewModel::class.java)
        val mad = viewModel.getMad()

        val madAdapter = MadAdapter()
        madAdapter.setMad(mad)

        binding.rvMad.layoutManager = LinearLayoutManager(this)
        binding.rvMad.setHasFixedSize(true)
        binding.rvMad.adapter = madAdapter

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}