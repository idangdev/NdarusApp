package com.wildan.ndarusapp.ui.tentang.referensi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityReferenceBinding
import com.wildan.ndarusapp.ui.base.BaseActivity

class ReferenceActivity : BaseActivity() {

    private lateinit var binding : ActivityReferenceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReferenceBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnBack.setOnClickListener{
            finish()
        }
    }
}