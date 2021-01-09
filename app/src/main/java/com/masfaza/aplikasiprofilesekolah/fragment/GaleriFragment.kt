package com.masfaza.aplikasiprofilesekolah.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.masfaza.aplikasiprofilesekolah.adapter.ListItemGaleriAdapter
import com.masfaza.aplikasiprofilesekolah.databinding.FragmentGaleriBinding
import com.masfaza.aplikasiprofilesekolah.datamodel.DataSetGaleri

class GaleriFragment : Fragment() {

    private lateinit var binding: FragmentGaleriBinding

    private lateinit var adapter: ListItemGaleriAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // return inflater.inflate(R.layout.fragment_galeri, container, false)
        binding = FragmentGaleriBinding.inflate(inflater, container, false)
        adapter = ListItemGaleriAdapter()

        // p
        // p

        binding.apply {
            listGaleri.adapter = adapter
            listGaleri.layoutManager = LinearLayoutManager(context)
            listGaleri.setHasFixedSize(true)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter.addData(DataSetGaleri.dataSet)
    }

}