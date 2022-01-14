package com.wildan.ndarusapp.ui.tentang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.ndarusapp.databinding.ActivityTentangBinding
import com.wildan.ndarusapp.ui.tentang.catatan.CatatanActivity
import com.wildan.ndarusapp.ui.tentang.contactus.ContactUsActivity
import com.wildan.ndarusapp.ui.tentang.referensi.ReferenceActivity

class TentangActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTentangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTentangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCatatan.setOnClickListener {
            val intent = Intent(this, CatatanActivity::class.java)
            startActivity(intent)
        }

        binding.btnReferensi.setOnClickListener {
            val intent = Intent(this, ReferenceActivity::class.java)
            startActivity(intent)
        }

        binding.btnContactUs.setOnClickListener {
            val intent = Intent(this, ContactUsActivity::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener{
            finish()
        }

    }
}