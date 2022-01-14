package com.wildan.ndarusapp.ui.quiz.praktik.annas

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.AnNasEntity
import com.wildan.ndarusapp.utils.DataDummy

class AnNasViewModel: ViewModel() {

    fun getAnNas(): List<AnNasEntity> = DataDummy.generateAnNas()

}