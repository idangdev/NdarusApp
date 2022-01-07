package com.wildan.ndarusapp.ui.belajar.tajwid.qalqalah.detail

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.QalqalahEntity
import com.wildan.ndarusapp.utils.DataDummy

class DetailQalqalahViewModel: ViewModel() {

    private lateinit var qalqalahId: String

    fun setSelectedQalqalah(qalqalahId: String){
        this.qalqalahId = qalqalahId
    }

    fun getQalqalah(): QalqalahEntity {
        lateinit var qalqalah: QalqalahEntity
        var qalqalahEntities = DataDummy.generateQalqalahDummy()
        for (qalqalahEntity in qalqalahEntities){
            if (qalqalahEntity.qalqalahId == qalqalahId){
                qalqalah = qalqalahEntity
            }
        }
        return qalqalah
    }

}