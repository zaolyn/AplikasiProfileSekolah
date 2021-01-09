package com.masfaza.aplikasiprofilesekolah.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.masfaza.aplikasiprofilesekolah.databinding.ListPrestasiBinding
import com.masfaza.aplikasiprofilesekolah.datamodel.DataSetPrestasiRV

class ListPrestasiAdapter : RecyclerView.Adapter<ListPrestasiViewHolder>() {

    private val listData = arrayListOf<DataSetPrestasiRV>()

    fun addData(list: List<DataSetPrestasiRV>) {
        listData.clear()
        listData.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListPrestasiViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListPrestasiBinding.inflate(inflater, parent, false)
        return ListPrestasiViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListPrestasiViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listData.size
}