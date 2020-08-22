package com.masuwes.aplikasiprofilesekolah.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.masuwes.aplikasiprofilesekolah.R
import com.masuwes.aplikasiprofilesekolah.adapter.ListPrestasiAdapter
import com.masuwes.aplikasiprofilesekolah.databinding.FragmentPrestasiBinding
import com.masuwes.aplikasiprofilesekolah.datamodel.DataSetFragmentPrestasi

class PrestasiFragment : Fragment() {

    private lateinit var binding: FragmentPrestasiBinding

    private lateinit var adapterRV: ListPrestasiAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrestasiBinding.inflate(inflater, container, false)
        adapterRV = ListPrestasiAdapter()

        // menampilkan recycler view
        binding.rvPrestasi.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = adapterRV
        }
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // menentukan data yang akan dimasukkan ke dalam adapter
        val data = DataSetFragmentPrestasi.dataSet
        adapterRV.addData(data)
    }

}