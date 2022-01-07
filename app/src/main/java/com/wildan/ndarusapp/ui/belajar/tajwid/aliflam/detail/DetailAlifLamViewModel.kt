package com.wildan.ndarusapp.ui.belajar.tajwid.aliflam.detail

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.AlifLamEntity
import com.wildan.ndarusapp.utils.DataDummy

class DetailAlifLamViewModel: ViewModel() {

    private lateinit var alifLamId: String

    fun setSelectedAlifLam(alifLamId: String){
        this.alifLamId = alifLamId
    }

    fun getAlifLam(): AlifLamEntity {
        lateinit var alifLam: AlifLamEntity
        var alifLamEntities = DataDummy.generateAlifLamDummy()
        for (alifLamEntity in alifLamEntities){
            if (alifLamEntity.alifLamId == alifLamId){
                alifLam = alifLamEntity
            }
        }
        return alifLam
    }

}