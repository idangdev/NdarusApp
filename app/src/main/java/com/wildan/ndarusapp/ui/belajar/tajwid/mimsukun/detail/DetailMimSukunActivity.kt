package com.wildan.ndarusapp.ui.belajar.tajwid.mimsukun.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.wildan.ndarusapp.data.MimSukunEntity
import com.wildan.ndarusapp.databinding.ActivityDetailMimSukunBinding
import com.wildan.ndarusapp.utils.DataDummy

class DetailMimSukunActivity : AppCompatActivity() {

    companion object{
        val EXTRA_MIM_SUKUN = "extra_mim_sukun"
    }

    private lateinit var binding: ActivityDetailMimSukunBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMimSukunBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(DetailMimSukunViewModel::class.java)

        val extras = intent.extras
        if (extras != null){
            val mimSukunId = extras.getString(EXTRA_MIM_SUKUN)
            if (mimSukunId != null){
                viewModel.setSelectedMimSukun(mimSukunId)

                populateMimSukun(viewModel.getMimSukun())
                for (mimSukun in DataDummy.generateMimSukunDummy()){
                    if (mimSukun.mimSukunId == mimSukunId){
                        populateMimSukun(mimSukun)
                    }
                }

            }
        }

    }

    private fun populateMimSukun(mimSukun: MimSukunEntity){

        binding.apply {
            tvMimSukunName.text = mimSukun.mimSukunName
            tvMimSukunDesc.text = mimSukun.mimSukunDescription
            ivMimSukunImage.setImageResource(mimSukun.mimSukunImage)
        }

    }
}