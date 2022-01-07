package com.wildan.ndarusapp.ui.belajar.tajwid.nunsukundantanwin.detail

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.NunSukunTanwinEntity
import com.wildan.ndarusapp.utils.DataDummy

class DetailNunSukunTanwinViewModel: ViewModel() {

    private lateinit var nunSukunTanwinId: String

    fun setSelectedNunSukunTanwin(nunSukunTanwinId: String){
        this.nunSukunTanwinId = nunSukunTanwinId
    }

    fun getNunSukunTanwin(): NunSukunTanwinEntity {
        lateinit var nunSukunTanwin: NunSukunTanwinEntity
        var nunSukunTanwinEntities = DataDummy.generateNunSukunTanwinDummy()
        for (nunSukunTanwinEntity in nunSukunTanwinEntities){
            if (nunSukunTanwinEntity.nunSukunTanwinId == nunSukunTanwinId){
                nunSukunTanwin = nunSukunTanwinEntity
            }
        }
        return nunSukunTanwin
    }

}