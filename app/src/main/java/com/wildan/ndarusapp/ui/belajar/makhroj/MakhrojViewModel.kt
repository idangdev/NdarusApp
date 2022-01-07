package com.wildan.ndarusapp.ui.belajar.makhroj

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.MakhrojEntity
import com.wildan.ndarusapp.utils.DataDummy

class MakhrojViewModel: ViewModel() {

    fun getMakhroj(): List<MakhrojEntity> = DataDummy.generateMakhrojDummy()

}