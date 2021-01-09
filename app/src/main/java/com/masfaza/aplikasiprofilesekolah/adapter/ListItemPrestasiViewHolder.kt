package com.masfaza.aplikasiprofilesekolah.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.masfaza.aplikasiprofilesekolah.databinding.ListItemPrestasiBinding
import com.masfaza.aplikasiprofilesekolah.datamodel.DataSetPrestasiModel

class ListItemPrestasiViewHolder(private val binding: ListItemPrestasiBinding):
    RecyclerView.ViewHolder(binding.root) {

    // memasukkan data kedalam layout
    fun bind(model: DataSetPrestasiModel) {
        binding.judulGambar.text = model.judulGambar
        Glide.with(binding.root).load(model.urlGambar)
            .centerCrop()
            .into(binding.gambarPrestasi)
    }

}