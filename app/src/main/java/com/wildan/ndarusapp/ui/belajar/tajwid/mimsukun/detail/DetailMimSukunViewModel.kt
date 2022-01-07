package com.wildan.ndarusapp.ui.belajar.tajwid.mimsukun.detail

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.MimSukunEntity
import com.wildan.ndarusapp.utils.DataDummy

class DetailMimSukunViewModel: ViewModel() {

    private lateinit var mimSukunId: String

    fun setSelectedMimSukun(mimSukunId: String){
        this.mimSukunId = mimSukunId
    }

    fun getMimSukun(): MimSukunEntity {
        lateinit var mimSukun: MimSukunEntity
        var mimSukunEntities = DataDummy.generateMimSukunDummy()
        for (mimSukunEntity in mimSukunEntities){
            if (mimSukunEntity.mimSukunId == mimSukunId){
                mimSukun = mimSukunEntity
            }
        }
        return mimSukun
    }

}