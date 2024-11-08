package com.rehan.appsekolah

import android.os.Bundle
import android.view.Display.Mode
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rehan.appsekolah.Adapter.AdapterSekolah
import com.rehan.appsekolah.Model.ModelSekolah

class ListActivityWisata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_wisata)

        //data list wisata

        val listSekolah = listOf(
            ModelSekolah("SMAN 1 Banuhampu",R.drawable.banuhampu,"081122334455","Sekolah ini didirikan pada tahun 2003 dengan siswa pertama 2 kelas karena bangunan belum ada, maka sementara waktu proses pembelajaran dilaksanakan di SMPN 1 Banuhampu pada sore hari. Pada tahun 2004 dibangun 3 ruang belajar di Nagari Pakan Sinayan dengan dana APBD Kabupaten Agam, maka pembelajaran mulai dilaksankan di lokasi baru yaitu di Nagari Pakan Sinayan pada tanggal 1 Juli 2004 Pada tanggal 26 Maret 2005 sekolah ini diresmikan bersama 5 sekolah lain yang ada di Sumatera Barat oleh Menteri Pendidikan Nasional Bapak Dr. Bambang Sudibyo, MBA Pada acara peresmian itu dihadiri oleh pejabat tinggi Sumatera Barat dan Mantan Ketua MPR RI Amien Rais yang juga telah menjadi sesepuh masyarakat Banuhampu",
                -0.344421, 100.3672064),
            ModelSekolah("SMAN 1 Sumbar",R.drawable.sumbar,"089988776655","SMAN 1 Sumatera Barat adalah buah pemikiran dari Bapak Zainal Bakar semasa beliau menjabat sebagai Gubernur Sumatera Barat. Beliau prihatin dengan semakin minimnya putra Minangkabau yang berkecimpung di tingkat nasional. Berbeda jauh dengan zaman revolusi dimana putra-putri Minangkabau selalu memegang peranan penting. Maka dicanangkanlah pembangunan sekolah-sekolah unggul yang akan dikelola langsung oleh Pemerintah provinsi Sumatera Barat. Sekolah-sekolah tersebut direncanakan akan dibangun di Padang Panjang, Solok, Padang dan Lubuk Sikaping. Karena gedungnya belum ada, maka untuk melaksanakan misi ini dipilihlah SMAN 1 Padang Panjang untuk menyaring siswa-siswa terbaik tamatan SMP/MTs dari seluruh Sumatera Barat sebanyak 1 (satu) kelas yang dibiayai oleh Pemerintah Provinsi.",
                -0.4618394158426435, 100.42702961395982),
            ModelSekolah("SMAN 1 Bukittinggi", R.drawable.smansatubukik,"087766441155","SMA Negeri 1 Bukittinggi berasal dari pecahan SMA Negeri ABC Bukittinggi yang didirikan di Birugo pada tahun 1856 bertepatan pada masa-masa awal Kebangkitan Nasional yang pada masa itu pendidikan adalah hal yang sangat dibutuhkan oleh masyarakat. Sekolah ini berdiri atas prakarsa dr. A. Roesma.Pada saat Agresi Militer Belanda II, sekitar tahun 1949, SMA Negeri ABC Bukittinggi terpaksa dibubarkan, sebab pada saat itu sebagian guru dan siswanya terpaksa mengungsi ke daerah pedalaman. Meskipun begitu, pemerintah kolonial tetap membenarkan pendirian sekolah menengah secara terbatas yang pada saat itu dipimpin oleh Jaka Dt. Sati dan dibantu beberapa orang guru yang pada saat itu tidak ikut mengungsi.",
                -0.30284445467658166, 100.37392578907601),
            ModelSekolah("SMAN 2 Bukittinggi",R.drawable.smaduabukik,"082334541234","Berdasarkan hasil pengamatan pendeta Bundingh, pemerintahan Belanda dapat mengetahui bahwa pendidikan anak negeri di Hindia Nederland masih rendah. Begitu pula kepandaian guru-guru Melayu di Gouvernement Pesisir Barat pulau Perca (Sumatra) tidaklah mencukupi. Oleh sebab itu, tahun 1855 Pemerintah Belanda merencanakan untuk mendirikan Sekolah Raja (bahasa Belanda: Kweekschool) untuk mendidik anak negeri melalui Surat keputusan pendirian Sekolah Raja untuk mendidik anak negeri yang dikeluarkan pada tanggal 1 April 1856.",
                -0.3162620255280693, 100.37443079419764),
            ModelSekolah("SMAN 3 Bukittinggi",R.drawable.smatigabukik,"08348932197","Cikal bakal berdirinya SMA Negeri 3 Bukittinggi berasal dari nama Sekolah Guru (Kweek School) yaitu pada tahun 1873. Pada tanggal 1 Maret 1873 sekolah guru diubah nama menjadi KWEEK SCHOOL. Guru kepala D. Gerth diubah menjadi Van Wijk. Guru Belanda yang menjadi guru kedua yaitu Weide. Murid-muridnya diasramakan dekat sekolah. Murid-muridnya ini diawasi oleh guru Melayu yang bernama Raja Medan.",
                -0.31478938283582125, 100.38506506721279),
            ModelSekolah("SMAN 4 Bukittinggi", R.drawable.smaempatbukik,"083421546723","Pada kesempatan ini Kepala SMAN 4 Bukittinggi, Dra. Eli Noverma, M.Si melantik wakil kepala sekolah terpilih untuk 3 tahun kedepan yaitu Nur Islam, S.Pd, M.Si sebagai Wakil Kepala Sekolah Bidang Kurikulum, Erik Hadi Putra, S.Pd, Gr sebagai Wakil Kepala Sekolah Bidang Kesiswaan, Benny Fitraza Chaidir, S.Pd sebagai Wakil Kepala Sekolah Bidang Sarana dan Prasarana dan Paulina Virgianti, S.Pd terpilih kembali sebagai Wakil Kepala Sekolah Bidang Humas.",
                -0.283981726559829, 100.34349785372045),
            ModelSekolah("SMAN 5 Bukittinggi",R.drawable.smalimabukik,"093421678934"," Palang Merah Indonesia (PMI) Bukittinggi mengadakan sosialisasi mengenai peran dan kontribusi PMI di SMA Negeri 5 Bukittinggi yang diikuti oleh para siswa dan guru,Jumat, (25/10)Acara ini bertujuan untuk meningkatkan kesadaran sosial di kalangan pelajar dan memperkenalkan peran PMI di masyarakat.Pada kesempatan itu, Ketua PMI Bukittinggi, Chairunas, menjelaskan, bahwa dalam sosialisasi ini, PMI mengenalkan dua unit layanan utamanya.Kedua unit tersebut ialah, Unit Donor Darah (UDD) yang bertugas menyediakan pasokan darah bagi masyarakat, dan Unit Markas, yang bergerak dalam penanggulangan bencana serta menyediakan layanan ambulans dan mobil jenazah gratis untuk keperluan darurat masyarakat.",
                -0.3012368833198374, 100.3938543690638),
            ModelSekolah("SMAN 1 Padang",R.drawable.smasatupadang,"082321897645","SMA Negeri 1 Padang adalah salah satu sekolah menengah atas (SMA) berstatus negeri yang terletak di Kelurahan Lolong Belanti, Kecamatan Padang Utara, Kota Padang, Sumatera Barat. Sekolah ini beralamat di Jalan Belanti Raya No. 11, beberapa puluh meter ke arah barat dari Jalan Khatib Sulaiman, Padang. Sebelumnya, sekolah ini beralamat di Jalan Sudirman No. 1, tetapi kemudian direlokasi ke lokasi sekarang karena bangunan sekolah yang lama rusak berat akibat gempa bumi pada tahun 2009. Gedung sekolah yang baru dibangun di atas lahan seluas 1,6 hektare pada 10 November 2009 dan selesai pada 7 Agustus 2010.",
                -0.9193604377810701, 100.35372337373553),
            ModelSekolah("SMAN 2 PAdang",R.drawable.smasuapadang,"085623894567","Semenjak bulan Mei 1958, Kota Padang telah menjadi ibu kota Provinsi Sumatera Barat, sedangkan sebelumnya, ibu kota Provinsi Sumatra Tengah adalah kota Bukittinggi. Sehubungan dengan itu, untuk mengantisipasi bertambahnya penduduk usia sekolah, sedangkan kota Padang pada waktu itu hanya memiliki satu SMA negeri saja, yaitu yang terletak di Jalan Jenderal Sudirman (di gedung lama SMA Negeri 1 Padang sekarang ini.",
                -0.9295631296674439, 100.35360565398842),
            ModelSekolah("SMAN 3 Padang",R.drawable.smatigapadang,"084567438921","Pada akhir Tahun Ajaran 1976, hanya ada 2 buah SMA berstatus negeri yang menampung seluruh tamatan peserta didik SMP Negeri dan Swasta di Kota Padang. Kuota yang disediakan oleh kedua sekolah tersebut sangat sedikit dibandingkan dengan jumlah seluruh peserta didik tamatan SMP negeri dan swasta di Kota Padang pada masa itu. Dengan demikian, setiap tahun timbul rasa kecemasan dan kegelisahan dari para orang tua yang berkeinginan melanjutkan pendidikan putra dan putri mereka ke SMA negeri yang tersedia. Pemerintah melalui Proyek Pelita Nasional Tahun 1976/1977, mencanangkan berdirinya SMA ketiga di Kota Padang dengan tujuan untuk mencukupi kuota lulusan peserta didik agar dapat tertampung.",
                -0.9193881970688385, 100.3646135537209)
        )

        val adapterSekolah =AdapterSekolah(listSekolah)
        //recycle view
        val rvSekolah : RecyclerView = findViewById(R.id.rvSekolah)
        rvSekolah.adapter = adapterSekolah
        //set layout
        rvSekolah.apply {
            layoutManager = LinearLayoutManager(this@ListActivityWisata)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}