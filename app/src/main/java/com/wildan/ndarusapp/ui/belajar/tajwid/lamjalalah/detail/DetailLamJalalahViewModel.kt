package com.wildan.ndarusapp.ui.belajar.tajwid.lamjalalah.detail

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.LamJalalahEntity
import com.wildan.ndarusapp.utils.DataDummy

class DetailLamJalalahViewModel: ViewModel() {

    private lateinit var lamJalalahId: String

    fun setSelectedLamJalalah(lamJalalahId: String){
        this.lamJalalahId = lamJalalahId
    }

    fun getLamJalalah(): LamJalalahEntity {
        lateinit var lamJalalah: LamJalalahEntity
        var lamJalalahEntities = DataDummy.generateLamJalalahDummy()
        for(lamJalalahEntity in lamJalalahEntities){
            if (lamJalalahEntity.lamJalalahId == lamJalalahId){
                lamJalalah = lamJalalahEntity
            }
        }
        return lamJalalah
    }

}