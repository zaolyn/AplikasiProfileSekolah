package com.masfaza.aplikasiprofilesekolah.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.masfaza.aplikasiprofilesekolah.adapter.ListItemEkskulAdapter
import com.masfaza.aplikasiprofilesekolah.databinding.FragmentEkskulBinding
import com.masfaza.aplikasiprofilesekolah.datamodel.DataSetEkskul

class EkskulFragment : Fragment() {

    private lateinit var binding: FragmentEkskulBinding

    private lateinit var adapter: ListItemEkskulAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEkskulBinding.inflate(inflater, container, false)
        adapter = ListItemEkskulAdapter()

        // menampilkan recycler view
        binding.apply {
            listEkskul.adapter = adapter
            listEkskul.layoutManager = LinearLayoutManager(context)
            listEkskul.setHasFixedSize(true)
        }

        return binding.root // nilai pengembalian = seluruh layout
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // mengisi adapter dengan data model
        val database = DataSetEkskul.dataSet
        adapter.addData(database)
    }
}