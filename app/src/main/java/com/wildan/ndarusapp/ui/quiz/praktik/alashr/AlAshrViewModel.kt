package com.wildan.ndarusapp.ui.quiz.praktik.alashr

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.AlAshrEntity
import com.wildan.ndarusapp.utils.DataDummy

class AlAshrViewModel : ViewModel(){

    fun getAlAshr(): List<AlAshrEntity> = DataDummy.generateAlAshr()

}