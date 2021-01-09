package com.masfaza.aplikasiprofilesekolah.adapter

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.masfaza.aplikasiprofilesekolah.databinding.ListPrestasiBinding
import com.masfaza.aplikasiprofilesekolah.datamodel.DataSetPrestasiRV

class ListPrestasiViewHolder(private val binding: ListPrestasiBinding):
    RecyclerView.ViewHolder(binding.root) {

    fun bind(model: DataSetPrestasiRV) {
        val adapter = ListItemPrestasiAdapter()

        // memasukkan adapter kedalam view holder
        binding.rvListItemPrestasi.run {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(binding.root.context)
            this.adapter = adapter
        }

        binding.titleListPrestasi.text = model.judulItem
        adapter.addData(model.listItem)


        // memberikan event(fungsi) pada checkbox
        binding.checkBoxPrestasi.setOnCheckedChangeListener { _, isChecked ->
            // ketika ikon di klik maka recycler view akan tampil
            binding.rvListItemPrestasi.visibility = if (isChecked) View.VISIBLE else View.GONE
        }

    }

}