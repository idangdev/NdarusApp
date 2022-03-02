package com.wildan.ndarusapp.ui.quiz.praktik.AtTakatsur

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.AtTakatsurEntity
import com.wildan.ndarusapp.utils.DataDummy

class AtTakatsurViewModel: ViewModel() {

    fun getAtTakatsur(): List<AtTakatsurEntity> = DataDummy.generateAtTakatsur()

}