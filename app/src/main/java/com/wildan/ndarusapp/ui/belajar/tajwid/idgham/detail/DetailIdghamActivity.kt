package com.wildan.ndarusapp.ui.belajar.tajwid.idgham.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.wildan.ndarusapp.data.IdghamEntity
import com.wildan.ndarusapp.databinding.ActivityDetailIdghamBinding
import com.wildan.ndarusapp.ui.base.BaseActivity
import com.wildan.ndarusapp.utils.DataDummy

class DetailIdghamActivity : BaseActivity() {

    companion object{
        val EXTRA_IDGHAM = "extra_idgham"
    }

    private lateinit var binding: ActivityDetailIdghamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailIdghamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(DetailIdghamViewModel::class.java)

        val extras = intent.extras
        if (extras != null) {
            val idghamId = extras.getString(EXTRA_IDGHAM)
            if (idghamId != null){
                viewModel.setSelectedIdgham(idghamId)

                populateIdgham(viewModel.getIdgham())
                for (idgham in DataDummy.generateIdghamDummy()){
                    if (idgham.idghamId == idghamId){
                        populateIdgham(idgham)
                    }
                }
            }
        }
    }

    private fun populateIdgham(idgham: IdghamEntity){

        binding.apply {
            tvIdghamName.text = idgham.idghamName
            tvIdghamDesc.text = idgham.idghamDescription
            ivIdghamImage.setImageResource(idgham.idghamImage)
        }

    }
}