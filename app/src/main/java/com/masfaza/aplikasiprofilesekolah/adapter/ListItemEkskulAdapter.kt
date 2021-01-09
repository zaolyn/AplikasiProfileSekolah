package com.masfaza.aplikasiprofilesekolah.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.masfaza.aplikasiprofilesekolah.databinding.ListItemGaleriBinding
import com.masfaza.aplikasiprofilesekolah.datamodel.DataSetEkskulModel

class ListItemEkskulAdapter: RecyclerView.Adapter<ListItemEkskulViewHolder>() {

    private val listData = arrayListOf<DataSetEkskulModel>()

    fun addData(list: List<DataSetEkskulModel>) {
        listData.clear()
        listData.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemEkskulViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemGaleriBinding.inflate(inflater, parent, false)
        return ListItemEkskulViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListItemEkskulViewHolder, position: Int) {
        holder.bind(listData[position])
    }


    override fun getItemCount(): Int = listData.size
}