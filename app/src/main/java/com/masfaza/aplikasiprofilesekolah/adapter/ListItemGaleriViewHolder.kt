package com.masfaza.aplikasiprofilesekolah.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.masfaza.aplikasiprofilesekolah.databinding.ListItemGaleriBinding
import com.masfaza.aplikasiprofilesekolah.datamodel.DataSetGaleriModel

class ListItemGaleriViewHolder(private val binding: ListItemGaleriBinding):
    RecyclerView.ViewHolder(binding.root){

    // memasukkan data kedalam layout
    fun bind(model: DataSetGaleriModel) {
        binding.titleListGaleri.text = model.judul
        binding.subtitleListGaleri.text = model.deskripsi
        Glide.with(binding.root).load(model.gambar).into(binding.imageListGaleri)
    }

}