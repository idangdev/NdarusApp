package com.wildan.ndarusapp.ui.quiz.praktik.alfalaq

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.AlFalaqEntity
import com.wildan.ndarusapp.utils.DataDummy

class AlFalaqViewModel: ViewModel() {

    fun getAlFalaq(): List<AlFalaqEntity> = DataDummy.generateAlFalaq()

}