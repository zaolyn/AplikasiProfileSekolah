package com.masuwes.aplikasiprofilesekolah.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.masuwes.aplikasiprofilesekolah.databinding.ListItemGaleriBinding
import com.masuwes.aplikasiprofilesekolah.datamodel.DataSetGaleriModel

class ListItemGaleriAdapter: RecyclerView.Adapter<ListItemGaleriViewHolder>() {

    private val listData = arrayListOf<DataSetGaleriModel>()

    fun addData(list: List<DataSetGaleriModel>) {
        listData.clear()
        listData.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemGaleriViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemGaleriBinding.inflate(inflater, parent, false)
        return ListItemGaleriViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListItemGaleriViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)

        // memberikan event toast ketika di klik
        holder.itemView.setOnClickListener {
            Toast.makeText(it.context, listData[position].judul, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = listData.size

}

