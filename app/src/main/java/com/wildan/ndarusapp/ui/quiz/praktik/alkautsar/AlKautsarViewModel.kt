package com.wildan.ndarusapp.ui.quiz.praktik.alkautsar

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.AlKautsarEntity
import com.wildan.ndarusapp.utils.DataDummy

class AlKautsarViewModel: ViewModel() {

    fun getAlKautsar(): List<AlKautsarEntity> = DataDummy.generateAlKautsar();

}