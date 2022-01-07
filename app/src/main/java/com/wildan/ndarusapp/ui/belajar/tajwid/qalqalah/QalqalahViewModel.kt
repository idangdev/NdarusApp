package com.wildan.ndarusapp.ui.belajar.tajwid.qalqalah

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.QalqalahEntity
import com.wildan.ndarusapp.utils.DataDummy

class QalqalahViewModel: ViewModel() {

    fun getQalqalah(): List<QalqalahEntity> = DataDummy.generateQalqalahDummy()

}