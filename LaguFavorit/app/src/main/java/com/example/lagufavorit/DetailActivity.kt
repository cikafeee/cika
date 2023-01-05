package com.example.lagufavorit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.lagufavorit.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(R.layout.activity_detail) {
    private val binding : ActivityDetailBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setData()
    }

    private fun setData() {
        binding.apply{
            val songs = intent.getParcelableExtra<Songs>(EXTRA_DETAIL)

            tvSongName.text = songs?.name
            tvSinger.text = songs?.singer
            tvAlbum.text = songs?.album
            tvDetail.text = songs?.detail

            Glide.with(this@DetailActivity)
                .load(songs?.photo)
                .apply(RequestOptions())
                .into(imageView)
        }
    }

    companion object{
        const val EXTRA_DETAIL = "extra_detail"
    }
}