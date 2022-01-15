package com.wildan.ndarusapp.ui.belajar.tajwid.lamjalalah.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.wildan.ndarusapp.data.LamJalalahEntity
import com.wildan.ndarusapp.databinding.ActivityDetailLamJalalahBinding
import com.wildan.ndarusapp.ui.base.BaseActivity
import com.wildan.ndarusapp.utils.DataDummy

class DetailLamJalalahActivity : BaseActivity() {

    companion object {
        val EXTRA_LAM_JALALAH = "extra_lam_jalalah"
    }

    private lateinit var binding: ActivityDetailLamJalalahBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityDetailLamJalalahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(DetailLamJalalahViewModel::class.java)

        val extras = intent.extras
        if (extras != null){
            val lamJalalahId = extras.getString(EXTRA_LAM_JALALAH)
            if (lamJalalahId != null){
                viewModel.setSelectedLamJalalah(lamJalalahId)

                populateLamJalalah(viewModel.getLamJalalah())
                for (lamJalalah in DataDummy.generateLamJalalahDummy()){
                    if (lamJalalah.lamJalalahId == lamJalalahId){
                        populateLamJalalah(lamJalalah)
                    }
                }

            }
        }


    }

    private fun populateLamJalalah(lamJalalah: LamJalalahEntity){

        binding.apply {
            tvLamJalalahName.text = lamJalalah.lamJalalahName
            tvLamJalalahDesc.text = lamJalalah.lamJalalahDescription
            ivLamJalalahImage.setImageResource(lamJalalah.lamJalalahImage)
        }

    }
}