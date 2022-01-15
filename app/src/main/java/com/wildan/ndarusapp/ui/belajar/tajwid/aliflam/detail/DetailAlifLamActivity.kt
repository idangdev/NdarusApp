package com.wildan.ndarusapp.ui.belajar.tajwid.aliflam.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.wildan.ndarusapp.data.AlifLamEntity
import com.wildan.ndarusapp.databinding.ActivityDetailAlifLamBinding
import com.wildan.ndarusapp.ui.base.BaseActivity
import com.wildan.ndarusapp.utils.DataDummy

class DetailAlifLamActivity : BaseActivity() {

    companion object{
        val EXTRA_ALIF_LAM = "extra_alif_lam"
    }

    private lateinit var binding: ActivityDetailAlifLamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailAlifLamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(DetailAlifLamViewModel::class.java)

        val extras = intent.extras
        if (extras != null){
            val alifLamId = extras.getString(EXTRA_ALIF_LAM)
            if (alifLamId != null){
                viewModel.setSelectedAlifLam(alifLamId)

                populateAlifLam(viewModel.getAlifLam())
                for (alifLam in DataDummy.generateAlifLamDummy()){
                    if (alifLam.alifLamId == alifLamId){
                        populateAlifLam(alifLam)
                    }
                }
            }
        }
    }

    private fun populateAlifLam(alifLam: AlifLamEntity){

        binding.apply {
            tvAlifLamName.text = alifLam.alifLamName
            tvAlifLamDesc.text = alifLam.alifLamDescription
            ivAlifLamImage.setImageResource(alifLam.alifLamImage)
        }

    }
}