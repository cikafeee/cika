package com.example.lagufavorit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.lagufavorit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding : ActivityMainBinding by viewBinding()
    private val list : ArrayList<Songs> = arrayListOf()
    private lateinit var listSongsAdapter: ListSongAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvSongs.setHasFixedSize(true)
        list.addAll(SongsData.listData)

        showRecyclerViewList()
    }

    private fun showRecyclerViewList() {
        binding.apply {
            rvSongs.layoutManager = LinearLayoutManager(this@MainActivity)
            listSongsAdapter = ListSongAdapter(list)
            rvSongs.adapter = listSongsAdapter
        }
    }
}