package com.wildan.ndarusapp.ui.belajar.tajwid.nunsukundantanwin.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.wildan.ndarusapp.data.NunSukunTanwinEntity
import com.wildan.ndarusapp.databinding.ActivityDetailNunSukunTanwinBinding
import com.wildan.ndarusapp.utils.DataDummy

class DetailNunSukunTanwinActivity : AppCompatActivity() {

    companion object{
        val EXTRA_NUN_SUKUN_TANWIN = "extra_nun_sukun_tanwin"
    }

    private lateinit var binding: ActivityDetailNunSukunTanwinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNunSukunTanwinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(DetailNunSukunTanwinViewModel::class.java)

        val extras = intent.extras
        if (extras != null){
            val nunSukunTanwinId = extras.getString(EXTRA_NUN_SUKUN_TANWIN)
            if (nunSukunTanwinId != null){
                viewModel.setSelectedNunSukunTanwin(nunSukunTanwinId)

                populateNunSukunTanwin(viewModel.getNunSukunTanwin())
                for (nunSukunTanwin in DataDummy.generateNunSukunTanwinDummy()){
                    if (nunSukunTanwin.nunSukunTanwinId == nunSukunTanwinId){
                        populateNunSukunTanwin(nunSukunTanwin)
                    }
                }


            }
        }

    }

    private fun populateNunSukunTanwin(nunSukunTanwin: NunSukunTanwinEntity){

        binding.apply {
            tvNunSukunTanwinName.text = nunSukunTanwin.nunSukunTanwinName
            tvNunSukunTanwinDesc.text = nunSukunTanwin.nunSukunTanwinDescription
            ivNunSukunTanwinImage.setImageResource(nunSukunTanwin.nunSukunTanwinImage)
        }

    }
}