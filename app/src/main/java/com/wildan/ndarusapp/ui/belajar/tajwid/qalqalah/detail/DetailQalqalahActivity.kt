package com.wildan.ndarusapp.ui.belajar.tajwid.qalqalah.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.wildan.ndarusapp.data.QalqalahEntity
import com.wildan.ndarusapp.databinding.ActivityDetailQalqalahBinding
import com.wildan.ndarusapp.utils.DataDummy

class DetailQalqalahActivity : AppCompatActivity() {

    companion object{
        val EXTRA_QALQALAH = "extra_qalqalah"
    }

    private lateinit var binding: ActivityDetailQalqalahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailQalqalahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(DetailQalqalahViewModel::class.java)

        val extras = intent.extras
        if(extras != null){
            val qalqalahId = extras.getString(EXTRA_QALQALAH)
            if(qalqalahId != null){
                viewModel.setSelectedQalqalah(qalqalahId)

                populateQalqalah(viewModel.getQalqalah())
                for (qalqalah in DataDummy.generateQalqalahDummy()){
                    if (qalqalah.qalqalahId == qalqalahId){
                        populateQalqalah(qalqalah)
                    }
                }

            }
        }
    }

    private fun populateQalqalah(qalqalah: QalqalahEntity){

        binding.apply {
            tvQalqalahName.text = qalqalah.qalqalahName
            tvQalqalahDesc.text = qalqalah.qalqalahDescription
            ivQalqalahImage.setImageResource(qalqalah.qalqalahImage)
        }

    }
}