package com.masuwes.aplikasiprofilesekolah.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.masuwes.aplikasiprofilesekolah.R
import kotlinx.android.synthetic.main.fragment_sekolah.*

class SekolahFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sekolah, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // intent menuju website resmi sekolah
        subtitle_website.setOnClickListener {
            val subtitleWebsite = Intent(Intent.ACTION_VIEW)
            subtitleWebsite.data = Uri.parse("https://idn.sch.id")
            startActivity(subtitleWebsite)
        }

        // intent menuju aplikasi instagram sekolah
        instagram.setOnClickListener {
            val instagram = Intent(Intent.ACTION_VIEW)
            instagram.data = Uri.parse("https://www.instagram.com/uwais.__alqadri/?hl=id")
            startActivity(instagram)
        }

        // intent menuju aplikasi facebook sekolah
        facebook.setOnClickListener {
            val facebook = Intent(Intent.ACTION_VIEW)
            facebook.data = Uri.parse("https://www.instagram.com/uwais.__alqadri/?hl=id")
            startActivity(facebook)
        }

    }
}