package com.wildan.ndarusapp.ui.belajar.tajwid.ro.detail

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.RoEntity
import com.wildan.ndarusapp.utils.DataDummy

class DetailRoViewModel:ViewModel() {

    private lateinit var roId: String

    fun setSelectedRo(roId: String){
        this.roId = roId
    }

    fun getRo(): RoEntity {
        lateinit var ro: RoEntity
        var roEntities = DataDummy.generateRoDummy()
        for (roEntity in roEntities){
            if (roEntity.roId == roId){
                ro = roEntity
            }
        }
        return ro
    }
}