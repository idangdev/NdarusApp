package com.wildan.ndarusapp.ui.quiz.praktik.alikhlash

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.AlIkhlashEntity
import com.wildan.ndarusapp.utils.DataDummy

class AlIkhlashViewModel: ViewModel() {

    fun getAlIkhlash(): List<AlIkhlashEntity> = DataDummy.generateAlIkhlash()

}