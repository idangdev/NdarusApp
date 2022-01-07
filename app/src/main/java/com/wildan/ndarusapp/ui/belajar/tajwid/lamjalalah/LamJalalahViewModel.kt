package com.wildan.ndarusapp.ui.belajar.tajwid.lamjalalah

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.LamJalalahEntity
import com.wildan.ndarusapp.utils.DataDummy

class LamJalalahViewModel: ViewModel() {

    fun getLamJalalah(): List<LamJalalahEntity> = DataDummy.generateLamJalalahDummy()

}