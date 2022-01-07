package com.wildan.ndarusapp.ui.belajar.makhroj

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.wildan.ndarusapp.databinding.ActivityMakhrojBinding
import com.wildan.ndarusapp.ui.base.BaseActivity

class MakhrojActivity : BaseActivity() {

    private lateinit var binding: ActivityMakhrojBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMakhrojBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MakhrojViewModel::class.java)
        val makhroj = viewModel.getMakhroj()

        val makhrojAdapter = MakhrojAdapter()
        makhrojAdapter.setMakhroj(makhroj)

        binding.rvMakhroj.layoutManager = GridLayoutManager(this,2)
        binding.rvMakhroj.setHasFixedSize(true)
        binding.rvMakhroj.adapter = makhrojAdapter

        binding.btnBack.setOnClickListener {
            finish()
        }

    }
}