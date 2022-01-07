package com.wildan.ndarusapp.ui.belajar.tajwid.aliflam

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.AlifLamEntity
import com.wildan.ndarusapp.utils.DataDummy

class AlifLamViewModel: ViewModel() {

    fun getAlifLam(): List<AlifLamEntity> = DataDummy.generateAlifLamDummy()

}