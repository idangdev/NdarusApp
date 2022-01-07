package com.wildan.ndarusapp.ui.belajar.tajwid.mad

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.MadEntity
import com.wildan.ndarusapp.utils.DataDummy

class MadViewModel: ViewModel() {

    fun getMad(): List<MadEntity> = DataDummy.generateMadDummy()

}