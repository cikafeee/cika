package com.example.lagufavorit

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lagufavorit.databinding.ItemRowSongBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSongAdapter(private val list : ArrayList<Songs>) :
    RecyclerView.Adapter<ListSongAdapter.ListViewHolder>() {

    inner class ListViewHolder(private val binding : ItemRowSongBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(songs: Songs) {
            with(binding) {
                tvSongName.text = songs.name
                tvDetailSong.text = songs.detail
                Glide.with(itemView.context)
                    .load(songs.photo)
                    .apply(RequestOptions().override(250, 250))
                    .into(tvSong)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_DETAIL, songs)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowSongBinding.inflate((LayoutInflater.from(parent.context)),parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = list[position]

        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}