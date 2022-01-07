package com.wildan.ndarusapp.ui.belajar.tajwid.idgham

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.IdghamEntity
import com.wildan.ndarusapp.utils.DataDummy

class IdghamViewModel: ViewModel() {

    fun getIdgham(): List<IdghamEntity> = DataDummy.generateIdghamDummy()

}