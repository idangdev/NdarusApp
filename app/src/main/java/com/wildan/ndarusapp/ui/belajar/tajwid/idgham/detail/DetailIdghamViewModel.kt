package com.wildan.ndarusapp.ui.belajar.tajwid.idgham.detail

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.IdghamEntity
import com.wildan.ndarusapp.utils.DataDummy

class DetailIdghamViewModel: ViewModel() {

    private lateinit var idghamId: String

    fun setSelectedIdgham(idghamId: String){
        this.idghamId = idghamId
    }

    fun getIdgham(): IdghamEntity {
        lateinit var idgham: IdghamEntity
        var idghamEntities = DataDummy.generateIdghamDummy()
        for (idghamEntity in idghamEntities){
            if (idghamEntity.idghamId == idghamId){
                idgham = idghamEntity
            }
        }
        return idgham
    }

}