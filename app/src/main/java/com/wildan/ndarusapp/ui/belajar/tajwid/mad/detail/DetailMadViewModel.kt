package com.wildan.ndarusapp.ui.belajar.tajwid.mad.detail

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.MadEntity
import com.wildan.ndarusapp.utils.DataDummy

class DetailMadViewModel: ViewModel() {

    private lateinit var madId: String

    fun setSelectedMad(madId: String){
        this.madId = madId
    }

    fun getMad(): MadEntity {
        lateinit var mad: MadEntity
        var madEntities = DataDummy.generateMadDummy()
        for (madEntity in madEntities){
            if (madEntity.madId == madId){
                mad = madEntity
            }
        }
        return mad
    }

}