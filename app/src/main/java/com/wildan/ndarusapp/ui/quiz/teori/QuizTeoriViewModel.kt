package com.wildan.ndarusapp.ui.quiz.teori

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.QuizTeoriEntity
import com.wildan.ndarusapp.utils.DataDummy

class QuizTeoriViewModel: ViewModel() {

    fun getQuizTeori(): List<QuizTeoriEntity> = DataDummy.generateQuizTeori()

}