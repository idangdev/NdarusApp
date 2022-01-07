package com.wildan.ndarusapp.ui.belajar.tajwid.ro

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.RoEntity
import com.wildan.ndarusapp.utils.DataDummy

class RoViewModel: ViewModel() {

    fun getRo(): List<RoEntity> = DataDummy.generateRoDummy()

}