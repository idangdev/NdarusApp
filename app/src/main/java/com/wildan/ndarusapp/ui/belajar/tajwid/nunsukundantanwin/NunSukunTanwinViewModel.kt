package com.wildan.ndarusapp.ui.belajar.tajwid.nunsukundantanwin

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.NunSukunTanwinEntity
import com.wildan.ndarusapp.utils.DataDummy

class NunSukunTanwinViewModel: ViewModel() {

    fun getNunSukunTanwin(): List<NunSukunTanwinEntity> = DataDummy.generateNunSukunTanwinDummy()

}