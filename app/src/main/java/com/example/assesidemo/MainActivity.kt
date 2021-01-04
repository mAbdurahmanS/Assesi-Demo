package com.example.assesidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("SMK IDN Boarding School\n","\"IDN (Islamic Development Network) Boarding School Jonggol-Bogor, Program Pendidikan : - SMP Teknologi - SMK Jurusan TKJ (Networking) - SMK Jurusan RPL (Mobile Apps) sekolah komputer berbasis pesantren di bogor\"\n",R.drawable.alwafi))
        arrayList.add(Model("Pesantren Tahfidz Sabilul Qur'an\n","Visi\n" +
                "Menjadi lembaga pendidikan tahfizh Al Qur'an unggulan yang bermanhaj salaf guna mewujudkan generasi penghafal Al Qur'an yang berkarakter\n" +
                "\n" +
                "Misi\n" +
                "\n" +
                "Mencetak generasi penghafal Al Qur'an yang memiliki kompetensi yang tinggi, mandiri, serta mampu membaktikan ilmunya di tengah masyarakat\n" +
                "\n" +
                "Menyelanggarakan pendidikan tahfizh Al Qur'an yang terintegrasi dengan pendidikan karakter dan pendidikan islam dengan pemahaman salafus shalih, bagi peserta didik, orang tua, dan masyarakat sekitar\n" +
                "\n" +
                "Menerapakan sistem manajemen pendidikan yang profesional",R.drawable.annajiyah))
        arrayList.add(Model("Pondok Pesantren Minhajus Sunnah\n","Pesantren milik Yazid bin Abdul Qodir al-Jawas memiliki pengaruh luas dalam jaringan Salafi di Bogor. Membangun komunikasi dengan sejumlah pendakwah di pelbagai kota di Indonesia.",R.drawable.alwafi))
        arrayList.add(Model("Pesantren Sabilunnajah Bandung (khusus putra)","Pesantren Sabilunnajah membuka kesempatan kepada guru dan tenaga profesional untuk bergabung dan menjadi bagian keluarga besar lembaga kami, dengan posisi dan  ketentuan sebagai berikut: A. Posisi:           Guru Kimia  B. Persyaratan Umum: Laki-laki Muslim ahlus sunnah wal jama’ah Semangat dalam mencari ‘ilmu agama dan mengamalkannya Memiliki kemampuan membaca al-Qur’an dengan baik Sehat jasmani ",R.drawable.annajiyah))
        arrayList.add(Model("Al Wafi Islamic Boarding School - WIBS Campus A\n","Pesantren yang menggunakan metodologi Experiential Learning dan Active Learning Islamic Integrated. Merupakan pesantren (Islamic Boarding School) khusus PUTRA & PUTRI, SMP & SMA yang berstandard Internasional dengan berdasarkan Al-Quran dan Sunnah nabi Muhammad Shollallahu’alaihi wassalam sesuai pemahaman salafus sholih.",R.drawable.alwafi))
        arrayList.add(Model("Pondok Pesantren Annajiyah\n","Pesantren An Najiyah Bandung merupakan Pesantren berlandaskan Alquran dan Assunnah menurut Pemahaman salafus shalih yang terletak di Kota Bandung",R.drawable.annajiyah))
        arrayList.add(Model("Pondok Pesantren Al-Furqon Al-Islami\n","Sesuai pemahaman salaf shalih dalam aqidah, ibadah, akhlak dalam tatanan kehidupan bermasyarakat Negara Kesatuan Republik Indonesia",R.drawable.alwafi))

        val myAdapter = MyAdapter(arrayList,this)

        rv_row.layoutManager = LinearLayoutManager(this)
        rv_row.adapter = myAdapter
    }
}