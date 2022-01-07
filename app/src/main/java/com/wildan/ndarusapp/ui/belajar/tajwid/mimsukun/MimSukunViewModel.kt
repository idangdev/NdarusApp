package com.wildan.ndarusapp.ui.belajar.tajwid.mimsukun

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.MimSukunEntity
import com.wildan.ndarusapp.utils.DataDummy

class MimSukunViewModel : ViewModel(){

    fun getMimSukun(): List<MimSukunEntity> = DataDummy.generateMimSukunDummy()

}