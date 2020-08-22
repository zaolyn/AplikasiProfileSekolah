package com.masuwes.aplikasiprofilesekolah.datamodel

// data model
data class DataSetEkskulModel(
    var gambar: String,
    var judul: String,
    var deskripsi: String)

// isi data model
object DataSetEkskul {
    val dataSet = listOf<DataSetEkskulModel>(
        DataSetEkskulModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/smp-smk-idn-berenang-1.jpg",
            "Berenang",
            "Kegiatan Ekstrakurikuler Berenang"
        ),
        DataSetEkskulModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/smp-smk-idn-berkuda-1.jpg",
            "Berkuda",
            "Kegiatan Ekstrakurikuler Berkuda"
        ),
        DataSetEkskulModel(
            "https://idn.sch.id/wp-content/uploads/2016/10/smp-smk-idn-panahan-e1506074957761.jpg",
            "Memanah",
            "Kegiatan Ekstrakurikuler Memanah"
        ),
        DataSetEkskulModel(
            "https://www.garudaprint.com/wp-content/uploads/2019/04/Orang-Terakhir-Dan-Penyerang-Dalam-Posisi-Pemain-Futsal.jpg",
            "Futsal",
            "Kegiatan Ekstrakurikuler Futsal"
        )
    )
}