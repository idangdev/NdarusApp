package com.wildan.ndarusapp.ui.quiz.praktik

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.AlIkhlashEntity
import com.wildan.ndarusapp.utils.DataDummy

class QuizPraktikViewModel: ViewModel() {

    fun getAlIkhlash(): List<AlIkhlashEntity> = DataDummy.generateAlIkhlash()

}