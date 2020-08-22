package com.masuwes.aplikasiprofilesekolah.datamodel

// data model
data class DataSetPrestasiRV (
    var judulItem: String,
    var listItem: List<DataSetPrestasiModel> // mengambil data array/list ke dalam model
)

// isi data model
object DataSetFragmentPrestasi {
    val dataSet = listOf<DataSetPrestasiRV>(
        DataSetPrestasiRV(
            "Internasional",
            DataSetPrestasi.dataSetInternasional
        ),

        DataSetPrestasiRV(
            "Nasional",
            DataSetPrestasi.dataSetNasional
        )
    )
}