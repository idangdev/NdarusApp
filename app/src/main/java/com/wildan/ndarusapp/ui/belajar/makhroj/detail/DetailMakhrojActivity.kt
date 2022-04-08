package com.wildan.ndarusapp.ui.belajar.makhroj.detail

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.wildan.ndarusapp.data.MakhrojEntity
import com.wildan.ndarusapp.databinding.ActivityDetailMakhrojBinding
import com.wildan.ndarusapp.ui.base.BaseActivity
import com.wildan.ndarusapp.utils.DataDummy

class DetailMakhrojActivity : BaseActivity() {

    companion object{
        val EXTRA_MAKHROJ = "extra_makhroj"
    }

    private lateinit var binding: ActivityDetailMakhrojBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMakhrojBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            DetailMakhrojViewModel::class.java)

        val extras = intent.extras
        if (extras != null) {
            val makhrojId = extras.getString(EXTRA_MAKHROJ)
            if (makhrojId != null) {
                viewModel.setSelectedMakhroj(makhrojId)

                populateMakhroj(viewModel.getMakhroj())
                for (makhroj in DataDummy.generateMakhrojDummy()) {
                    if (makhroj.makhrojId == makhrojId) {
                        populateMakhroj(makhroj)
                    }
                }

            }
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    private fun populateMakhroj(makhroj: MakhrojEntity){

        binding.apply {
            tvMakhrojTitleTop.text = makhroj.makhrojTitle
            tvMakhrojTitle.text = makhroj.makhrojTitle
            tvMakhrojDescription.text = makhroj.makhrojDeskripsi
            tvMakhrojTitleSifat.text = makhroj.makhrojTitleSifat
            tvMakhrojSifat.text = makhroj.makhrojSifat
            tvMakhrojCatatan1.text = makhroj.makhrojCatatan1
            tvMakhrojCatatan2.text = makhroj.makhrojCatatan2
            ivMakhrojPraktik.setImageResource(makhroj.makhrojPraktikImage)
        }

        val videoId = makhroj.makrhojUrl
        lifecycle.addObserver(binding.youtubePlayerView)

        binding.youtubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.cueVideo(videoId, 0f)
            }
        })
    }
}