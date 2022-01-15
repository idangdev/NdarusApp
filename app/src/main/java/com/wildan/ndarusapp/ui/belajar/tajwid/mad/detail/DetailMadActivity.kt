package com.wildan.ndarusapp.ui.belajar.tajwid.mad.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.wildan.ndarusapp.data.MadEntity
import com.wildan.ndarusapp.databinding.ActivityDetailMadBinding
import com.wildan.ndarusapp.ui.base.BaseActivity
import com.wildan.ndarusapp.utils.DataDummy

class DetailMadActivity : BaseActivity() {

    companion object{
        val EXTRA_MAD = "extra_mad"
    }

    private lateinit var binding: ActivityDetailMadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(DetailMadViewModel::class.java)

        val extras = intent.extras
        if (extras != null){
            val madId = extras.getString(EXTRA_MAD)
            if (madId != null) {
                viewModel.setSelectedMad(madId)

                populateMad(viewModel.getMad())
                for (mad in DataDummy.generateMadDummy()){
                    if (mad.madId == madId){
                        populateMad(mad)
                    }
                }

            }
        }
    }

    private fun populateMad(mad: MadEntity){

        binding.apply {
            tvMadName.text = mad.madName
            tvMadDesc.text = mad.madDescription
            ivMadImage.setImageResource(mad.madImage)
        }

    }
}