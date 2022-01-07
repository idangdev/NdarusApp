package com.wildan.ndarusapp.ui.belajar.tajwid.ro.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.wildan.ndarusapp.data.RoEntity
import com.wildan.ndarusapp.databinding.ActivityDetailRoBinding
import com.wildan.ndarusapp.utils.DataDummy

class DetailRoActivity : AppCompatActivity() {

    companion object{
        val EXTRA_RO = "extra_ro"
    }

    private lateinit var binding: ActivityDetailRoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailRoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(DetailRoViewModel::class.java)

        val extras = intent.extras
        if (extras != null){
            val roId = extras.getString(EXTRA_RO)
            if (roId != null){
                viewModel.setSelectedRo(roId)

                populateRo(viewModel.getRo())
                for (ro in DataDummy.generateRoDummy()){
                    if (ro.roId == roId){
                        populateRo(ro)
                    }
                }

            }
        }
    }

    private fun populateRo(ro: RoEntity){

        binding.apply {
            tvRoName.text = ro.roName
            tvRoDesc.text = ro.roDescription
            ivRoImage.setImageResource(ro.roImage)
        }

    }
}