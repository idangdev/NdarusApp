package com.wildan.ndarusapp.ui.belajar.makhroj.detail

import androidx.lifecycle.ViewModel
import com.wildan.ndarusapp.data.MakhrojEntity
import com.wildan.ndarusapp.utils.DataDummy

class DetailMakhrojViewModel: ViewModel() {

    private lateinit var makhrojId: String

    fun setSelectedMakhroj(makhrojId: String){
        this.makhrojId = makhrojId
    }

    fun getMakhroj(): MakhrojEntity {
        lateinit var makhroj: MakhrojEntity
        var makhrojEntities = DataDummy.generateMakhrojDummy()
        for (makhrojEntity in makhrojEntities) {
            if (makhrojEntity.makhrojId == makhrojId) {
                makhroj = makhrojEntity
            }
        }
        return makhroj
    }

}