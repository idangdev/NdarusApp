package com.wildan.ndarusapp.ui.muqodimah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivitySifatulHurufBinding
import com.wildan.ndarusapp.ui.base.BaseActivity

class SifatulHurufActivity : BaseActivity() {

    private lateinit var binding: ActivitySifatulHurufBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySifatulHurufBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}