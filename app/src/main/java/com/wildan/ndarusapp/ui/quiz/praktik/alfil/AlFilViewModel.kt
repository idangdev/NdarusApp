package com.wildan.ndarusapp.ui.quiz.praktik.alfil

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.AlFilEntity
import com.wildan.ndarusapp.data.AlIkhlashEntity
import com.wildan.ndarusapp.utils.DataDummy

class AlFilViewModel: ViewModel() {

    fun getAlFil(): List<AlFilEntity> = DataDummy.generateAlFil()

}