package com.wildan.ndarusapp.utils

import com.wildan.ndarusapp.R
import com.wildan.ndarusapp.data.*

object DataDummy {

    /***
     * ===================== MAKHORIJUL HURUF =============================
     */

    fun generateMakhrojDummy(): List<MakhrojEntity>{
        var makhroj = ArrayList<MakhrojEntity>()

        makhroj.add(MakhrojEntity(
            "m1",
            "Hamzah",
            "AQSHAL HALQI : PANGKAL TENGGOROKAN\n\nHuruf hamzah keluar dari pangkal atau tenggorokan bawah (Dekat daerah pita suara)",
            "Sifat Huruf Hamzah",
            "1. Jahr (Udara Tertahan)\n2. Syiddah (Suara Tertahan)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)",
            "Sifat Kuat Huruf Hamzah : Jahr dan Syiddah\nSifat Lemahnya : Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Sandaran ke makhrojnya kuat. Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal)",
            R.drawable.ic_hamzah,
            "wvMv-TioB30"
        ))

        makhroj.add(MakhrojEntity(
            "m2",
            "Ba",
            "MAKHRAJ ASY SYAFATANI : DUA BIBIR\n\nHuruf Ba keeluar dari  dua bibir secara bersama-sama dalam keadaan tertutup",
            "Sifat Huruf Ba",
            "1. Jahr (Udara Tertahan)\n2. Syiddah (Suara Tertahan)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)\n6. Qalqalah (Memantul)",
            "Sifat Kuat Huruf Ba : Jahr, Syiddah, Qalqalah\nSifat Lemahnya : Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Sandaran ke makhrojnya kuat. Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal)\n\nCara mengucapkannya dengan menyentuhkan bibir atas dan bibir bawah",
            R.drawable.ic_ba,
            "ZWArlt5aOT4"
        ))

        makhroj.add(MakhrojEntity(
            "m3",
            "Ta",
            "THARAFUL LISAN : UJUNG LIDAH MENEMPEL PADA PANGKAL DUA GIGI SERI ATAS\n\nHuruf Ta keluar dari ujung lidah dari arah punggungnya dan menempel pada pangkal dua gigi seri atas.",
            "Sifat Huruf Ta",
            "1. Hams (Udara Mengalir)\n2. Syiddah (Suara Tertahan)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)",
            "Sifat Kuat Huruf Ta : Syiddah\nSifat Lemahnya : Hams, Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal)\n\nSaat mengucapkan huruf Ta, jangan sampai hams-nya terlalu mendominasi sehingga menghilangkan sifat syiddah-nya",
            R.drawable.ic_ta,
            "3m_TZd8ZyFw"
        ))

        makhroj.add(MakhrojEntity(
            "m4",
            "Tsa",
            "THARAFUL LISAN : UJUNG LIDAH MENEMPEL PADA UJUNG DUA GIGI SERI ATAS\n\nHuruf Tsa keluar dari ujung lidah dari arah punggungnya dan menempel pada ujung dua gigi seri atas",
            "Sifat Huruf Tsa",
            "1. Hams (Udara Mengalir)\n2. Rakhawah (Suara Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)",
            "Sifat Kuat Huruf Tsa : Tidak ada\nSifat Lemahnya : Hams, Rakhawah, Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal)\n\nCara mengucapkannya dengan mengeluarkan ujung lidah dan menyentuhkan ke ujung dua gigi seri atas. Dan ujung lidahnya tidak menempel ujung dua gigi seri bawah.",
            R.drawable.ic_tsa,
            "ndtzkBU_md4"
        ))

        makhroj.add(MakhrojEntity(
            "m5",
            "Jim",
            "WASATHUL LISAN : TENGAH LIDAH\n\nHuruf Jim keluar dari tengah lidah menempel pada langit-langit. Sehingga betul-betul tertutup sempurna.",
            "Sifat Huruf Jim",
            "1. Jahr (Udara Tertahan)\n2. Syiddah (Suara Tertahan)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)\n6. Qalqalah (Memantul)",
            "Sifat Kuat Huruf Jim : Jahr, Syiddah, dan Qalqalah\nSifat Lemahnya : Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah ke dasar mulut (istifal)\n\nPantulan (Qalqalah) pada huruf jim adalah suara yang tipis.",
            R.drawable.ic_jim,
            "PpaDPFWhVSw"
        ))

        makhroj.add(MakhrojEntity(
            "m6",
            "Kha",
            "WASATHUL HALQI : TENGGOROKAN TENGAH\n\nHuruf Kha keluar dari tenggorokan bagian tengah (katup tengah tenggorokan atau katup epligotis).",
            "Sifat Huruf Kha",
            "1. Hams (Udara Mengalir)\n2. Rakhawah (Suara Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)",
            "Sifat Lemah Huruf Kha : Hams, Rakhawah, istifal, infitah\nSifat Kuatnya : Tidak ada\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal)\n\nCara mengucapkannya dengan sedikit menekan katup epligotis.",
            R.drawable.ic_kha,
            "Df30bKl1nYQ"
        ))

        makhroj.add(MakhrojEntity(
            "m7",
            "Kho",
            "ADNAL HALQI : TENGGOROKAN ATAS\n\nHuruf Kho keluar dari tenggorokan atas, persentuhan antara bagian akar lidah (jadzrul lisan) dengan langit-langit mulut yang berdaging lunak (anak lidah atau tekak).",
            "Sifat Huruf Kho",
            "1. Hams (Udara Mengalir)\n2. Rakhawah (Suara Mengalir)\n3. Isti\'la (Suara Tebal)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)",
            "Sifat Kuat Huruf Kho : Isti\'la\nSifat Lemahnya : Hams, rakhawah, infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tebal dengan mengangkat pangkal lidah kelangit-langit mulut (isti\'la)\n\nCara mengucapkannya dengan menyentuhkan akar lidah ke bagian dari langit-langit.",
            R.drawable.ic_kho,
            "_ZnrlL-R38o"
        ))

        makhroj.add(MakhrojEntity(
            "m8",
            "Dal",
            "THARAFUL LISAN : UJUNG LIDAH\n\nHuruf Dal keluar dari ujung lidah dari arah punggungnya dan menempel pada pangkal dua gigi seri atas",
            "Sifat Huruf Dal",
            "1. Jahr (Udara Tertahan)\n2. Syiddah (Suara Tertahan)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)\n6. Qalqalah (Memantul)",
            "Sifat Kuat Huruf Dal : Jahr, Syiddah, dan Qalqalah\nSifat Lemahnya : Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah ke dasar mulut (istifal).\n\nPantulan (Qalqalah) pada huruf dal adalah suara yang tipis.",
            R.drawable.ic_dal,
            "P2QDjDTqV-k"
        ))

        makhroj.add(MakhrojEntity(
            "m9",
            "Dzal",
            "THARAFUL LISAN : UJUNG LIDAH MENEMPEL PADA UJUNG DUA GIGI SERI ATAS\n\nHuruf Dzal keluar dari ujung lidah dari arah punggungnya dan menempel pada ujung dua gigi seri atas.",
            "Sifat Huruf Dzal",
            "1. Jahr (Udara Tertahan)\n2. Rakhawah (Suara Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)",
            "Sifat Kuat Huruf Dzal : Jahr dan Syiddah\nSifat Lemahnya : Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal).\n\nCara mengucapkannya dengan mengeluarkan ujung lidah dan menyentuhkannya ke ujung dua gigi seri atas. Dan ujung lidahnya tidak menempel ujung dua gigi seri bawah.",
            R.drawable.ic_dzal,
            "WzVqMzb3Mm8"
        ))

        makhroj.add(MakhrojEntity(
            "m10",
            "Ra",
            "THARAFUL LISAN : UJUNG LIDAH\n\nHuruf Ra keluar dari ujugn lidah menempel gusi dua gigi seri atas sedikit lebih masuk ke punggung lidah dari makhraj nun",
            "Sifat Huruf Ra",
            "1. Jahr (Udara Tertahan)\n2. Bainiyyah (Suara Sedikit Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Idzlaq (Mudah Keluar)\n6. Takrir (Bergetar)\n7. Inhirah (Menyimpang)",
            "Sifat Kuat Huruf Ra : Jahr, Takrir, dan Inhiraf\nSifat Lemahnya : Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Bainiyyah dan Idzlaq",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut. Suara huruf tebal dengan mengangkat pangkal lidah ke langit-langit mulut.\n\nTebal (Tafkhim) dan Tipis (Tarqiq) ro :\nJika berhubungan dengan kasrah maka dibaca tipis. Sedangkan bila berhubungan dengan fathah ataupun dhammah maka dibaca tebal",
            R.drawable.ic_ra,
            "az_K_u7Ca7E"
        ))

        makhroj.add(MakhrojEntity(
            "m11",
            "Zay",
            "THARAFUL LISAN : UJUNG LIDAH (KEPALA LIDAHNYA) MENEMPEL DI DINDING 2 GIGI SERI BAWAH\n\nHuruf Zay keluar  dari ujung lidah paling depan (kepala lidah) pada dinding dua gigi seri bawah, sehingga suara keluar diantara gigi seri atas dan gigi seri bawah.",
            "Sifat Huruf Zay",
            "1. Jahr (Udara Tertahan)\n2. Rakhawah (Suara Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)\n6. Shafir (Berdesis)",
            "Sifat Kuat Huruf Zay : Jahr dan Shafir\nSifat Lemahnya : Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal).\n\nSebagian ulama membedakan desisan huruf-huruf shafir, huruf zay desisannya seperti suara lebah",
            R.drawable.ic_zay,
            "ahXqGxLdYYU"
        ))

        makhroj.add(MakhrojEntity(
            "m12",
            "Sin",
            "THARAFUL LISAN : UJUNG LIDAH (KEPALA LIDAHNYA) MENEMPEL DI DINDING 2 GIGI SERI BAWAH\n\nHuruf Sin keluar dari ujung lidah (kepala lidah) pada dinding dua gigi seri bawah, sehingga suara keluar diantara gigi seri atas dan gigi seri bawah.",
            "Sifat Huruf Sin",
            "1. Hams (Udara Mengalir)\n2. Rakhawah (Suara Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)\n6. Shafir (Berdesis)",
            "Sifat Kuat Huruf Sin : Shafir\nSifat Lemahnya : Hams, Rakhawah, Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal).\n\nSebagian ulama membedakan desisan huruf-huruf shafir, huruf sin desisannya seperti suara belalang.",
            R.drawable.ic_sin,
            "s5EcgmQqXvA"
        ))

        makhroj.add(MakhrojEntity(
            "m13",
            "Syin",
            "WASATHUL LISAN : TENGAH LIDAH\n\nHuruf Syin keluar dari tengah lidah tidak menempel pada langit-langit. Sehingga makhrajnya tidak tertutup.",
            "Sifat Huruf Syin",
            "1. Hams (Udara Mengalir)\n2. Rakhawah (Suara Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)\n6. Tafasysyi (Udara menyebar)",
            "Sifat Kuat Huruf Syin : Tafasysyi\nSifat Lemahnya : Hams, Rakhawah, Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal)\n\nSifat tafasysyi pada huruf syin akan terasa sempurna jika tidak terlalu membuka atau memonyongkan bibir",
            R.drawable.ic_syin,
            "yfrytwfI22g"
        ))

        makhroj.add(MakhrojEntity(
            "m14",
            "Shad",
            "THARAFUL LISAN : UJUNG LIDAH (KEPALA LIDAHNYA) MENEMPEL DI DINDING 2 GIGI SERI BAWAH\n\nHuruf Shad Keluar dari ujung lidah paling depan (kepala lidah) pada dinding dua gigi seri bawah, sehingga suara keluar diantara gigi seri atas dan gigi seri bawah.",
            "Sifat Huruf Shad",
            "1. Hams (Udara Mengalir)\n2. Rakhawah (Suara Mengalir)\n3. Isti\'la (Suara Tebal)\n4. Ithbaq (Suara sangat tebal)\n5. Ishmat (Sulit Keluar)\n6. Shafir (Berdesis)",
            "Sifat Kuat Huruf Shad : Isti\'la, Ithbaq, dan Shafir\nSifat Lemahnya : Hams dan Rakhawah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tebal dengan mengangkat pangkal lidah kelangit langit mulut (isti\'la), dan juga mengangkat suara dari tengah lidah, supaya suaranya menggumpal (ithbaq).\n\nSebagian ulama membedakan desisan huruf-huruf shafir, huruf shad desisannya seperti suara angsa.",
            R.drawable.ic_shad,
            "2aluLMAgefY"
        ))

        makhroj.add(MakhrojEntity(
            "m15",
            "Dhad",
            "HAFATUL LISAN : LIDAH BAGIAN TEPI\n\nHuruf Dhad Keluar dari salah satu tepi lidah atau dari kedua-duanya secara bersamaan menempel pada dinding dalam gigi-gigi geraham atas.",
            "Sifat Huruf Dhad",
            "1. Jahr (Udara Tertahan)\n2. Rakhawah (Suara Mengalir)\n3. Isti\'la (Suara Tebal)\n4. Ithbaq (Suara Sangat Tebal)\n5. Ishmat (Sulit Keluar)\n6. Isthithalah (Memanjangkan makhrajnya)",
            "Sifat Kuat Huruf Dhad : Jahr, Isti\'la, Ithbaq, dan Isthithalah\nSifat Lemahnya : Rakhawah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tebal dengan mengangkat pangkal lidah kelangit-langit mulut (Isti\'la), dan juga mengangkat suara dari tengah lidah, supaya suaranya menggumpal (ithbaq).\n\nCara mengucapkannya dengan meletakkan salah satu tepi lidah (dari ujung sampai pangkal lidah) atau kedua-duanya menekan dinding gigi-gigi geraham.",
            R.drawable.ic_dhad,
            "WqZGcIBdvD8"
        ))

        makhroj.add(MakhrojEntity(
            "m16",
            "Tha",
            "THARAFUL LISAN : UJUNG LIDAH\n\nHuruf Tha keluar dari ujung lidah dari arah punggungnya dan menempel pada pangkal dua gigi seri atas.",
            "Sifat Huruf Tha",
            "1. Jahr (Udara Tertahan)\n2. Syiddah (Suara Tertahan)\n3. Isti\'la (Suara Tebal)\n4. Ithbaq (Suara Sangat Tebal)\n5. Ishmat (Sulit Keluar)\n6. Qalqalah (Memantul)",
            "Sifat Kuat Huruf Tha : Jahr, Isti\'la, Syiddah, Ithbaq, Qalqalah\nSifat Lemahnya : Tidak Ada\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tebal dengan mengangkat pangkal lidah kelangit-langit mulut (isti\'la), dan juga mengangkat suara dari tengah lidah, supaya suaranya menggumpal (Ithbaq)\n\nPantulan (Qalqalah) pada huruf tha adalah suara yang tebal",
            R.drawable.ic_tha,
            "Ym2pbYQLHRE"
        ))

        makhroj.add(MakhrojEntity(
            "m17",
            "Zha",
            "THARAFUL LISAN : UJUNG LIDAH MENEMPEL PADA UJUNG DUA GIGI SERI ATAS\n\nHuruf Zha keluar dari ujung lidah dari arah punggungnya dan menempel pada ujung dua gigi seri atas.",
            "Sifat Huruf Zha",
            "1. Jahr (Udara Tertahan)\n2. Rakhawah (Suara Mengalir)\n3. Isti\'la (Suara Tebal)\n4. Ithbaq (Suara Sangat Tebal)\n5. Ishmat (Sulit Keluar)",
            "Sifat Kuat Huruf Zha : Jahr, Isti\'la, dan Ithbaq\nSifat Lemahnya : Rakhawah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tebal dengan mengangkat pangkal lidah kelangit-langit mulut (isti\'la), dan juga mengangkat suara dari tengah lidah, supaya suaranya menggumpal (ithbaq)\n\nCara mengucapkannya dengan mengeluarkan ujung lidah dan menyentuhkannya ke ujung dua gigi seri atas. Dan ujung lidahnya tidak menempel ujung dua gigi seri bawah",
            R.drawable.ic_zha,
            "SYKYHlW9MaM"
        ))

        makhroj.add(MakhrojEntity(
            "m18",
            "Ain",
            "WASATHUL HALQI : TENGGOROKAN TENGAH\n\nHuruf Ain keluar dari tenggorokan bagian tengah (katup tengah tenggorokan atau katup epligotis)",
            "Sifat Huruf Ain",
            "1. Jahr (Udara Tertahan)\n2. Bainiyyah (Suara Sedikit Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)",
            "Sifat Kuat Huruf Ain : Jahr\nSifat Lemahnya : Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Bainiyyah dan Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal)\n\nCara mengucapkannya dengan menekan katup epligotis.",
            R.drawable.ic_ain,
            "LznWw6M7u9o"
        ))

        makhroj.add(MakhrojEntity(
            "m19",
            "Ghayn",
            "ADNAL HALQI : TENGGOROKAN ATAS\n\nHuruf Ghayn keluar tenggorokan atas, persentuhan antara bagian akar lidah (jadzrul lisan) dengan langit-langit mulut yang berdaging lunak (anak lidah atau tekak).",
            "Sifat Huruf Ghayn",
            "1. Jahr (Udara Tertahan)\n2. Rakhawah (Suara Mengalir)\n3. Isti\'la (Suara Tebal)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)",
            "Sifat Kuat Huruf Ghayn : Jahr dan Isti\'la\nSifat Lemahnya : Rakhawah dan Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tebal dengan mengangkat pangkal lidah kelangit-langit mulut (isti\'la).\n\nCara mengucapkannya dengan menyentuhkan akar lidah ke bagian dari langit-langit.",
            R.drawable.ic_ghayn,
            "VUyrJp-MXBY"
        ))

        makhroj.add(MakhrojEntity(
            "m20",
            "Fa",
            "MAKHRAJ ASY SYAFATANI : DUA BIBIR\nBIBIR BAWAH BAGIAN PERUTNYA DENGAN UJUNG DUA GIGI SERI ATAS.\n\nHuruf Fa keluar dari bagian dalam (perut) bibir bawah dengan ujung dua gigi seri atas.",
            "Sifat Huruf Fa",
            "1. Hams (Udara Mengalir)\n2. Rakhawah (Suara Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Idzlaq (Mudah Keluar)",
            "Sifat Kuat Huruf Fa : Tidak Ada\nSifat Lemahnya : Hams, Rakhawah, dan Istifal\nSifat tidak kuat dan tidak lemah : Idzlaq",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal). Sebagian ulama qiraat mengatakan huruf fa punya sifat khas tersendiri yaitu TA\'AFFUF yaitu suara khas yang keluar dari bibir ketika mengucapkan fa.",
            R.drawable.ic_fa,
            "a_4DTJc5opo"
        ))

        makhroj.add(MakhrojEntity(
            "m21",
            "Qaf",
            "AQSHAL LISAN : LIDAH PALING DALAM\n\nHuruf Qaf keluar dari pangkal lidah menempel pada bagian daging dari langit-langit (bagian yang lunak).",
            "Sifat Huruf Qaf",
            "1. Jahr (Udara Tertahan)\n2. Syiddah (Suara Tertahan)\n3. Isti\'la (Suara tebal)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)\n6. Qalqalah (Memantul)",
            "Sifat Kuat Huruf Qaf : Jahr, Isti\'la, Syiddah, dan Qalqalah\nSifat Lemahnya : Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tebal dengan mengangkat pangkal lidah kelangit-langit mulut (isti\'la).\n\nPantulan (Qalqalah) pada huruf qaf adalah suara yang tebal.",
            R.drawable.ic_qaf,
            "gj_y7XXsUYg"
        ))

        makhroj.add(MakhrojEntity(
            "m22",
            "Kaf",
            "AQSHAL LISAN : LIDAH PALING DALAM\n\nHuruf kaf keluar dari pangkal lidah menempel pada bagian daging dan tulang (bagian yang keras) dari langit-langit secara bersamaan, dibawah makhraj qaf sedikit.",
            "Sifat Huruf Kaf",
            "1. Hams (Udara Mengalir)\n2. Syiddah (Suara Tertahan)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)",
            "Sifat Kuat Huruf Kaf : Syiddah\nSifat Lemahnya : Hams, Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal).\n\nJangan sampai hamsnya terlalu mendominasi sehingga menghilangkan sifat syiddahnya",
            R.drawable.ic_kaf,
            "r6ok4eVFr2w"
        ))

        makhroj.add(MakhrojEntity(
            "m23",
            "Lam",
            "HAFATUL LISAN : TEPI LIDAH BAGIAN DEPAN HINGGA UJUNGNYA\n\nHuruf Lam keluar dari ujung dua tepi lidah sampai pada akhir ujung lidah menempel pada gusi dari gigi-gigi bagian atas.",
            "Sifat Huruf Lam",
            "1. Jahr (Udara Tertahan)\n2. Bainiyyah (Suara sedikit mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Idzlaq (Mudah Keluar)\n6. Inhiraf (Menyimpang)",
            "Sifat Kuat Huruf Lam : Jahr dan Inhiraf\nSifat Lemahnya : Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Bainiyyah dan Idzlaq",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal).",
            R.drawable.ic_lam,
            "JvzWEQ9MJ34"
        ))

        makhroj.add(MakhrojEntity(
            "m24",
            "Mim",
            "MAKHRAJ ASY SYAFATANI : DUA BIBIR\n\nHuruf Mim keluar dari Dua bibir secara bersama-sama dalam keadaan tertutup.",
            "Sifat Huruf Mim",
            "1. Jahr (Udara Tertahan)\n2. Bainiyyah (Suara Sedikit Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Idzlaq (Mudah Keluar)\n6. Ghunnah (Berdengung)",
            "Sifat Kuat Huruf Mim : Jahr dan Ghunnah\nSifat Lemahnya : Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Bainiyyah dan Idzlaq",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal)\n\nHuruf mim yang berharakat, tetap suaranya keluar dari mulut sedangkan mim yang sukun dan tasydid suaranya keluar dari rongga hidung.",
            R.drawable.ic_mim,
            "kWuxqR-BoxI"
        ))

        makhroj.add(MakhrojEntity(
            "m25",
            "Nun",
            "THARAFUL LISAN : UJUNG LIDAH\n\nHuruf Nun keluar dari ujung lidah menempel pada gusi dua gigi seri atas.",
            "Sifat Huruf Nun",
            "1. Jahr (Udara Tertahan)\n2. Bainiyyah (Suara Mengalir Sedikit)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Idzlaq (Mudah Keluar)\n6. Ghunnah (Dengung)",
            "Sifat Kuat Huruf Nun : Jahr dan Ghunnah\nSifat Lemahnya : Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Bainiyyah dan Idzlaq",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal).\n\nHuruf nun yang berharakat, tetap suaranya keluar dari mulut sedangkan nun yang sukun dan tasydid suaranya keluar dari rongga hidung",
            R.drawable.ic_nun,
            "m1w9h2yhXds"
        ))

        makhroj.add(MakhrojEntity(
            "m26",
            "Ha",
            "AQSHAL HALQI : PANGKAL TENGGOROKAN\n\nHuruf Ha keluar dari pangkal atau tenggorokan bawah (dekat daerah pita suara).",
            "Sifat Huruf Ha",
            "1. Hams (Udara Mengalir)\n2. Rakhawah (Suara Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)",
            "Sifat Kuat Huruf Ha : Tidak ada\nSifat Lemahnya : Hams dan Rakhawah\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal)\n\nHuruf Ha berbunyi dengan menggetarkan pita suara. Letaknya pada bagian sekitar jakun",
            R.drawable.ic_ha,
            "Y_wjhcA1Dp0"
        ))

        makhroj.add(MakhrojEntity(
            "m27",
            "Wa",
            "MAKHRAJ ASY SYAFATANI : KEDUA BIBIR\n\nHuruf Wa keluar dari dua bibir secara bersama-sama dengan memonyongkannya sehingga ada celah untuk mengalirkan suara.",
            "Sifat Huruf Wa",
            "1. Jahr (Udara Tertahan)\n2. Rakhawah (Suara Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat(Sulit Keluar)\n6. Liin (Lembut)",
            "Sifat Kuat Huruf Wa : Jahr\nSifat Lemahnya : Hams, Rakhawah, Istifal, Infitah, dan Liin\nSifat tidak kuat dan tidak lemah : Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal)\n\nKetika mengucapkan wawu sukun sebelumnya berharakat fathah (Liin), bukan suara \'u\' dhammah yang tepat suara \'w\' wawu.",
            R.drawable.ic_wa,
            "64m9DrhjUZg"
        ))

        makhroj.add(MakhrojEntity(
            "m28",
            "Ya",
            "WASATHUL LISAN : TENGAH LIDAH\n\nHuruf Ya keluar dari tengah lidah tidak menempel pada langit-langit, sehingga makhrajnya tidak tertutup bersamaan dengan menurunnya pangkal lidah dan menaiknya tengah lidah.",
            "Sifat Huruf Ya",
            "1. Jahr (Udara Tertahan)\n2. Rakhawah (Suara Mengalir)\n3. Istifal (Suara Tipis)\n4. Infitah (Suara Terbuka)\n5. Ishmat (Sulit Keluar)\n6. Liin (Lembut)",
            "Sifat Kuat Huruf Ya : Jahr\nSifat Lemahnya : Istifal dan Infitah\nSifat tidak kuat dan tidak lemah : Bainiyyah dan Ishmat",
            "Suara huruf yang tipis dengan menghamparkan pangkal lidah kedasar mulut (istifal) Ketika mengucapkan ya sukun sebelumnya berharakat fathah (Liin), bukan suara \'i\' kasrah, yang tepat suaranya \'y\' ya.",
            R.drawable.ic_ya,
            "FNcboc_BtA0"
        ))

        return makhroj
    }


    /***
     * ===================== TAJWID =============================
     */

    fun generateMadDummy(): List<MadEntity> {
        var mad = ArrayList<MadEntity>()

        mad.add(MadEntity(
            "mad1",
            "Mad Arid Lissukun",
            "Mad Arid Lissukun adalah cara memanjangkan bacaan pada saat berhenti (waqof) - baik di akhir maupun di tengah ayat\n\n- Mad adalah panjang bacaan\n- Arid artinya yang bertemu\n- Lis artinya karena\n- Sukun artinya mati\n\nHukum Mad Arid Lissukun berlaku apabila huruf Mad Thobi\'i bertemu dengan huruf (hidup) berbasis Fathah, Fathatain, Kasrah, Kasratain, Dhammah dan Dhammatain yang berada di dalam satu kata atau kalimat\n\nPanjang bacaan Mad Arid Lissukun boleh 2, 4, atau 6 harakat.",
            R.drawable.mad_arid_lissukun
        ))

        mad.add(MadEntity(
            "mad2",
            "Mad Badal",
            "Yaitu mad yang terjadi karena ada huruf mad sebagai ganti dari hamzah yang dibuang.\nHal ini sejalan dengan kata BADAL yang berarti GANTI ukuran\nPanjangnya adalah 2 harakat/ketukan atau sama dengan 1 alif",
            R.drawable.mad_badal
        ))

        mad.add(MadEntity(
            "mad3",
            "Mad Iwadh Anit Tanwin",
            "Mad Iwadh Anit Tanwin atau sering disebut Mad Iwadh adalah salah satu cabang dari Hukum Mad Far\' yang berlaku untuk huruf Mad Thobi\'i berbasis Fathatain.\n\nIwadh artinya ganti waqof pada huruf Alif pengganti dari fathatain\nSama seperti hukum Mad Liin dan Mad Arid Lissukun, Mad Iwadh merupakan hukum mad yang berlaku pada saat bacaan berhenti (waqof), baik di ujung maupun di tengah ayat.\n\nPanjang bacaan Mad Iwadh adalah 1 alif atau 2 harakat. Dan cara membacanya adalah dengan menghilangkan tanwin menjadi huruf ashli, seperti cara membaca hukum Mad Thobi\'i.",
            R.drawable.mad_iwadh_anit_tanwin
        ))

        mad.add(MadEntity(
            "mad4",
            "Mad Jaiz Munfashil",
            "Mad Jaiz Munfashil adalah salah satu cabang dari Hukum Mad Far\'i.\n\n- Jaiz artinya boleh.\n- Munfashil artinya di luar kata atau terpisah\n\nMad Jaiz Munfashil berlaku apabila huruf Mad Thobi\'i bertemu dengan huruf Alif berharakat Fathah, Kasrah, atau Dhammah\nDi dalam Al quran, Mad Jaiz Munfashil diberi tanda garis tipis melengkung di bagian atas huruf Mad Thobi\'i atau berada di antara huruf Mad Thobi\'i dan huruf Alif",
            R.drawable.mad_jaiz_munfashil
        ))

        mad.add(MadEntity(
            "mad5",
            "Mad Lazim Harfi Mukhaffaf",
            "Mad Lazim Harfi Mukhaffaf adalah bagian dari hukum Mad Far\'i yang terjadi pada huruf-huruf tunggal pada permulaan surah-surah di dalam Al Quran. Dan hanya dibaca nama hurufnya saja.\n- Lazim artinya harus atau wajib\n- Hargi artinya huruf mad terjadi karena huruf (bukan pada kata/kalimat)\n- Mukhaffaf artinya ringan cara mengucapkannya\n\n- 1 Huruf Alif, cukup dibaca 1 harakat\n- 5 Huruf \'haya thahara\', yaitu ح ي ط ه ر dibaca panjang 2 harakat\n- 8 Huruf \'shadqafnun sama lam kaf \'ain\', yaitu ص ق ن س م ل ك ع \nDibaca 6 harakat. Tidak dibaca dengung (Idgham), kecuali huruf \'Ain pada surah Maryam dan huruf Mim bertasydid",
            R.drawable.mad_lazim_harfi_mukhaffaf
        ))

        mad.add(MadEntity(
            "mad6",
            "Mad Lazim Kilmi Mutsaqqal",
            "Mad Lazim Kilmi Mutsaqqal atau sering disebut Mad Lazim Muthawwal adalah salah satu cabang dari 11 Hukum Mad Far\'i\n\n- Lazim artinya pasti atau wajib\n- Kilmi atau kalimi artinya perkataan mad terjadi karena berada di dalam suatu perkataan (kata)\n- Mutsaqqal artinya diberatkan, berat cara mengucapkannya\n- Sedangkan Muthawwal artinya dipanjangkan\n\nHukum Mad Lazim Kilmi Mutsaqqal berlaku apabila huruf Mad Thobi\'i bertemu dengan huruf bertasydid\n\nPanjang bacaan Mad Lazim Kilmi Mutsaqqal adalah wajib 6 harakat (tidak dapat ditawar)",
            R.drawable.mad_lazim_kilmi_mutsaqqal
        ))

        mad.add(MadEntity(
            "mad7",
            "Mad Lazim Mukhaffaf Kalimi",
            "Mad Lazim Mukhaffaf Kalimi terjadi apabila huruf mad bertemu oleh huruf yang berbaris sukun dalam satu kata. Hanya terdapat pada 2 tempat di dalam Al Quran :\n\n- Surat Yunus ayat 51\n- Surat Yunus ayat 91\nMad Lazim Mukhaffaf kalimi dibaca panjang 6 harakat.",
            R.drawable.mad_lazim_mukhaffaf_kalimi
        ))

        mad.add(MadEntity(
            "mad8",
            "Mad Liin (Mad Layyin)",
            "Hukum Mad Liin berlaku apabila huruf berbaris Fathah bertemu dengan huruf Waw Sukun dan Ya sukun dan berada dalam satu kata atau kalimat dengan satu huruf setelahnya. Artinya jika terdapat lebih dari satu huruf setelahnya, maka tidak terjadi hukum Mad Liin.\n\nCara membacanya adalah dengan membaca huruf berbaris Fathah terlebih dahulu, lalu langsung disambung dengan Waw SUkun atau Ya sukun (dibaca panjang). Setelah itu dikunci dengan huruf sesudahnya.\nPanjang bacaan Mad Lin boleh 2 harakat, 4 harakat, atau 6 harakat (pilih salah satu).",
            R.drawable.mad_lin
        ))

        mad.add(MadEntity(
            "mad9",
            "Mad Tamkin",
            "Mad Tamkin adalah salah satu cabang dari hukum Mad Far\'i yang berlaku untuk huruf Waw Sukun bertemu Waw Berharakat, dan Ya Sukun bertemu Ya Berharakat.\n\n- Tamkin artinya penetapan\nPenetapan ini berlaku :\n\n- Apabila huruf berharakat Kasrah bertemu huruf Ya Sukun (يْ), dan Huruf setelahnya adalah huruf Ya berharakat (يَ يِ يُ)\n- Dan apabila huruf berharakat Dhammah bertemu Waw Sukun (وْ), dan setelahnya adalah huruf Waw Berharakat (وَ وِ وُ)\n\nMaka cara membacanya sama seperti membaca hukum Mad Thobi\'i, serta panjang bacaannya adalah 2 harakat",
            R.drawable.mad_tamkin
        ))

        mad.add(MadEntity(
            "mad10",
            "Mad Thabi\'i",
            "Mad Thobi\'i adalah salah satu cabang dari Hukum Mad. Mad Thobi\'i artinya biasa atau alami, yaitu tidak kurang dan tidak lebih. Dibaca panjang 1 alif atau 2 harakat.\n\nMad Thobi\'i berlaku apabila :\n- Huruf berharakat Fathah bertemu dengan alif (ا)\n- Huruf berharakat Kasrah bertemu huruf Ya Sukun (يْ)\n- Dan Dhammah bertemu Waw Sukun (وْ)\nMaka huruf-huruf tersebut dibaca panjang dua harakat.",
            R.drawable.mad_thabii
        ))

        mad.add(MadEntity(
            "mad11",
            "Mad Wajib Muttashil",
            "Mad Muttashil atau Mad Wajib, sering disebut juga dengan Mad Wajib Muttashil, merupakan salah satu cabang dari Hukum Mad Far\'i\n\n- Mad merupakan panjang bacaan\n- Wajib adalah harus\n- Muttashil artinya bersambung\n\nHukum Mad Wajib Muttashil adalah hukum tajwid yang berlaku apabila huruf Mad Thobi\'i bertemu dengan huruf Hamzah berharakat Fathah atau Fathatain, Kasrah atau Kasratain, dan Dhammah atau Dhammatain.\n\nKuncinya adalah huruf Mad Thobi\'i dan Hamzah dalam keadaan bersambung atau dalam satu kata.\n\nPanjang bacaan Hukum Mad Wajib Muttashil adalah 6 harakat (tidak dapat ditawar).",
            R.drawable.mad_wajib_muttashil
        ))

        return mad
    }

    fun generateQalqalahDummy(): List<QalqalahEntity> {
        var qalqalah = ArrayList<QalqalahEntity>()

        qalqalah.add(QalqalahEntity(
            "qalqalah1",
            "Qalqalah Qubro",
            "Huruf qalqalah ada 5 yaitu ق ط ب ج د atau supaya mudah diingat yaitu BA JU DI TO KO\n\n- Qalqalah Qubro yaitu Qalqalah yang berada diakhir kata atau karena diwaqafkan bukan karena sukun asli.\n\n- Cara membacanya yaitu dengan memantulkan suara dari makhroj hurufnya dengan pantulan yang kuat",
            R.drawable.qalqalah_qubro
        ))

        qalqalah.add(QalqalahEntity(
            "qalqalah2",
            "Qalqalah Shugro",
            "Huruf qalqalah ada 5 yaitu ق ط ب ج د atau supaya mudah diingat yaitu BA JU DI TO KO\n\n- Qalqalah Shugra atau Qalqalah yang berada ditengah kata atau dengan kata lain qalqalah dengan suku asli.\n\n- Cara membacanya yaitu dengan memantulkan suara dari makhraj hurufnya (ق ط ب ج د) dengan pantulan tidak begitu kuat",
            R.drawable.qalqalah_shugro
        ))

        return qalqalah
    }

    fun generateLamJalalahDummy(): List<LamJalalahEntity> {
        var lamJalalah = ArrayList<LamJalalahEntity>()

        lamJalalah.add(LamJalalahEntity(
            "lam1",
            "Lam Tafkhim",
            "Tafkhim artinya tebal atau berat. Maksudnya adalah membaca huruf Lam dengan bunyi tebal atau berat, seperti bunyi antara \"LAH dan LOH\". Bunyi \"Tafkhim\" itu terjadi apabila sebelum huruf Lam Jalalah ada harakat fathah (a) atau dhammah (u)",
            R.drawable.lam_tafkhim
        ))

        lamJalalah.add(LamJalalahEntity(
            "lam2",
            "Lam Tarqiq",
            "Tarqiq artinya tipis atau ringan. Maksudnya adalah membaca huruf Lam dengan bunyi tipis atau ringan, seperti bunyi \'LAH\'. Bunyi \'Tarqiq\' itu terjadi apabila sebelum huruf Lam Jalalah ada harakat kasrah (i)",
            R.drawable.lam_tarqiq
        ))

        return lamJalalah
    }

    fun generateMimSukunDummy(): List<MimSukunEntity> {
        var mimSukun = ArrayList<MimSukunEntity>()

        mimSukun.add(
            MimSukunEntity(
            "mim1",
            "Idgham Mitslain",
            "Idgham Mitslain atau sering disebut dengan Idgham Mimi adalah hukum tajwid yang berlaku untuk huruf Mim Sukun (مْ) bertemu dengan huruf Mim Berharokat (مَ مِ مُ).\n\n- Dinamakan Mitslain karena terjadinya pertemuan dua huruf yang makhraj dan sifatnya sama persis (identik), tapi \"dikhususkan\" hanya untuk huruf Mim Sukun bertemu Mim Berharakat.\n- Selain dari huruf Mim tersebut, maka yang berlaku untuk pertemuan 2 huruf yang sama (Sukun dan Berharakat) adalah Hukum Idgham Mutamasilain dan Hukum Mad Tamkin.",
            R.drawable.idgham_mitslain
        ))

        mimSukun.add(
            MimSukunEntity(
            "mim2",
            "Ikhfa Syafawi",
                "Ikhfa Syafawi adalah hukum tajwid yang berlaku apabila huruf Mim Sukun (مْ) bertemu dengan huruf Ba (ب)\n\n- Ikhfa artinya menyamarkan atau menyembunyikan\n- Syafawi artinya bibir\n\nDinamakan Ikhfa Syafawi karena makhraj dari huruf Mim dan Ba merupakan pertemuan antara bibir atas dan bibir bawah.",
            R.drawable.ikhfa_syafawi
        ))

        mimSukun.add(
            MimSukunEntity(
            "mim3",
            "Izhar Syafawi",
                "Hukum Izhar Syafawi adalah hukum tajwid yang berlaku apabila huruf Mim Sukun (مْ) bertemu dengan semua huruf hijaiyah, kecuali huruf Mim dan Ba",
            R.drawable.izhar_syafawi
        ))

        return mimSukun
    }

    fun generateNunSukunTanwinDummy(): List<NunSukunTanwinEntity> {
        var nunSukunTanwin = ArrayList<NunSukunTanwinEntity>()

        nunSukunTanwin.add(
            NunSukunTanwinEntity(
            "nun1",
            "Idgham Bighunnah",
            "Hukum Idgham Bighunnah atau sering disebut Idgham Ma'al Ghunnah adalah hukum tajwid yang berlaku apabila :\n\nNun Sukun (نْ) atau Tanwin bertemu dengan huruf Mim, Nun, Waw, Ya (م ن و ي) secara terpisah atau tidak dalam satu kata maupun kalimat. Maksud dari kata \"terpisah\" di sini akan dibagas di bagian bawah.\n\n- Bi artinya dengan\n- Ghunnah artinya dengung\n- Sementara Idgham artinya meleburkan satu huruf ke dalam huruf setelahnya, atau bahasa lainnya di-tasydid-kan.\n\nCara membaca Idgham Bighunnah adalah dengan meleburkan Nun Sukun atau Tanwin menjadi suara huruf di depannya, atau keempat huruf tersebut seolah diberi tanda tasydid, diiringi dengan menggunakan suara dengung 1 alif - 1 1/2 Alif atau sekitar 2 - 3 harakat.",
            R.drawable.idgham_bigunnah
        ))

        nunSukunTanwin.add(
            NunSukunTanwinEntity(
            "nun2",
            "Idgham Bilaghunnah",
            "Hukum Idgham Bilaghunnah adalah hukum tajwid yang berlaku apabila Nun Sukun (نْ) atau tanwin bertemu dengan lam (ل) atau Ro (ر) tanpa menggunakan suara dengung\n\n- Bila artinya tidak\n- Ghunnah artinya dengung\n- Sementara Idgham artinya meleburkan satu huruf ke dalam huruf setelahnya, atau bahasa lainnya di tasydid-kan.\n\nCara membacanya adalah dengan meleburkan Nun Sukun (نْ) atau Tanwin menjadi suara huruf Lam (ل) atau Ro (ر), atau lafaz kedua huruf tersebut seolah diberi tanda tasydid, tanpa diikuti suara dengung (ghunnah).",
            R.drawable.idgham_bilaghunnah
        ))

        nunSukunTanwin.add(
            NunSukunTanwinEntity(
            "nun3",
            "Ikhfa Haqiqi",
                "Ikhfa secara harfiah berarti menyamarkan atau menyembunyikan.\n\nDidalam ilmu tajwid, Ikhfa Haqiqi adalah menyamarkan huruf Nun Sukun (نْ) atau tanwin kedalam huruf sesudahnya.\n\nHuruf tersebut sebanyak 15 huruf yaitu:\n\nت ث د ذ ز س ش ص ض ط ظ ف ق ك\n\nKe-15 huruf tersebut tidak bertasydid dan harus dibaca dengung (ghunnah)\n\n Cara membacanya adalah dengan mengeluarkan suara Nun Sukun (نْ) atau Tanwin dari rongga hidung sehingga terlihat samar atau menjadi suara \'N\' atau \'NG\' kemudian disambut dengan dengung 1 - 1 1/2 Alif atau sekitar 2 - 3 harakat, setelah itu baru masuk ke huruf sesudahnya.",
            R.drawable.ikfa_haqiqi
        ))

        nunSukunTanwin.add(
            NunSukunTanwinEntity(
            "nun4",
            "Iqlab",
                "Iqlab adalah salah satu hukum tajwid yang berlaku apabila huruf Nun Sukun (نْ) atau Tanwin bertemu dengan huruf Ba (ب)\n\n- Menurut bahasa, Iqlab artinya mengubah atau menggantikan sesuatu dari bentuknya.\n- Cara membacanya adalah dengan menggantikan huruf Nun Sukun (نْ) atau Tanwin menjadi suara huruf mim sukun (مْ). Sehingga pada saat akan bertemu dengan huruf Ba (ب) bibir atas dan bawah dalam posisi tertutup, diiringi dengan suara dengung sekitar 2 harakat.\n\n- Hukum Iqlab di dalam Al Quran, sudah ditandai dengan huruf mim kecil (م) dan diletakkan di atas antara Nun Sukun (نْ) atau Tanwin dengan huruf Ba (ب)",
            R.drawable.iqlab
        ))

        nunSukunTanwin.add(
            NunSukunTanwinEntity(
            "nun5",
            "Izhar Halqi",
                "Izhar Halqi adalah salah satu cabang dari Hukum Izhar yang ada di dalam Ilmu Tajwid. Izhar artinya jelas atau terang.\n\nDinamakan Izhar Halqi berlaku apabila Nun Sukun (نْ) atau Tanwin bertemu dengan huruf Alif, \'Ain, Ghayn, Ha, Kha, Ha\' (ء) dan Hamzah (ا ع غ ح خ ه)\n\nNamun Nun Sukun (نْ) atau Tanwin jarang bertemu dengan huruf Hamzah (ء) akan tetapi huruf hamzah tetap salah satu huruf Izhar Halqi.\n\n- Cara membaca Izhar Halqi harus jelas atau terang, dan tidak berdengung.",
            R.drawable.izhar_halqi
        ))

        nunSukunTanwin.add(
            NunSukunTanwinEntity(
            "nun6",
            "Izhar Wajib",
                "Hukum Izhar Wajib atau disebut juga Izhar Mutlaq adalah salah satu cabang dari Hukum Izhar. Cara membacanya jelas atau terang dan tidak berdengung.\n\nIzhar dibaca apabila Nun Sukun (نْ) bertemu dengan huruf (ي و م ن) dalam keadaan SAMBUNG atau DALAM SATU KATA/KALIMAT.\n\nAda 4 kata Hukum Izhar Wajib di dalam Al Quran, yaitu :\n\n- Dunya\n- Shinwanun\n- Bunyanun\n- dan Qinwanun",
            R.drawable.izhar_wajib
        ))

        return nunSukunTanwin
    }


    fun generateIdghamDummy(): List<IdghamEntity> {
        var idgham = ArrayList<IdghamEntity>()

        idgham.add(
            IdghamEntity(
            "idgham1",
            "Idgham Mutajanisain",
            "Idgham Mutajanisain adalah hukum tajwid yang berlaku apabila terjadi pertemuan dua huruf yang berbeda sifat, namun sejenis tempat keluar suara atau makhraj-nya. Satu dalam keadaan sukun dan satu lagi berkharokat.\n\n- Mutajanisain artinya sejenis\n- Idgham artinya meleburkan satu huruf ke dalam huruf setelahnya (di-tasydid-kan).\n\nPanjang bacaannya adalah 2 harokat.\n\nCara membacanya adalah dengan \'mengabaikan\' huruf yang sukun, dan langsung masuk ke huruf yang berharokat, atau huruf yang sukun dileburkan ke huruf yang berharokat.\n\nHukum Idgham Mutajanisain berlaku untuk 8 huruf (ب ت ث د ذ ط ظ م)",
            R.drawable.idgham_mutajanisain
        ))

        idgham.add(
            IdghamEntity(
            "idgham2",
            "Idgham Mutamatsilain",
                "Idgham Mutamatsilain adalah hukum tajwid yang berlaku untuk pertemuan dua huruf yang sama sifat dan makhrajnya, satu dalam keadaan sukun dan satu lagi berharakat. Dua huruf tersebut berada di dalam kata atau kalimat yang terpisah.\n\n- Mutamatsilain artinya sama atau serupa\n- Idgham artinya meleburkan satu huruf ke dalam huruf setelahnya (di-tasydid-kan).\n\nCara membacanya adalah dengan memasukkan (meleburkan) huruf yang bersukun ke dalam huruf berharakat secara jelas atau terang dan tidak didengungkan. Hukum Idgham Mutamatsilain berlaku untuk semua huruf, kecuali :\n\n- Huruf Mim Sukun (مْ) bertemu huruf Mim Berharakat (مَ مِ مُ), yang berlaku adalah hukum Idgham Mitslain.\n- Huruf Nun Sukun (نْ) bertemu huruf Nun Berharakat (نَ نِ نُ), yang berlaku adalah hukum Idgham Bighunnah.",
            R.drawable.idgham_mutamatsilain
        ))

        return idgham
    }

    fun generateAlifLamDummy(): List<AlifLamEntity> {
        var alifLam = ArrayList<AlifLamEntity>()

        alifLam.add(
            AlifLamEntity(
            "aliflam1",
            "Alif Lam Qamariyah",
            "Al Qamariyah adalah \"Al\" yang dirangkai dengan kata benda(isim) yang diawali dengan salah satu dari huruf-huruf qamariyah.\n\n- Qamariyah artinya seperti Bulan.\n\nCara membaca \"Al\" Qamariyah harus jelas (izhhar), yakni tetap kelihatan bacaan lam sukunnya. Karena itulah hukum bacaan \"Al\" Qamariyah sering disebut dengan Izhhar Qamariyah\n\n- Jumlah huruf Qamariyah itu ada 14 huruf (ا ب غ ح ج ك و خ ف ع ق ي م ه)",
            R.drawable.alif_lam_qamariyah
        )
        )

        alifLam.add(
            AlifLamEntity(
            "aliflam2",
            "Alif Lam Syamsiyah",
                "Al Syamsiyah adalah \'Al \' atau alif lam yang dirangkai dengan kata benda (isim) yang diawali dengan salah satu dari huruf-huruf syamsiyah.\n\n- Kalau secara bahasa Syamsiyah artinya matahari\n- Cara membaca Al Syamsiyah yaitu dengan memasukkan (meng-idgham-kan) \'Al\' (lam sukun) ke huruf-huruf syamsiyah sehingga bacaan lam sukunnya hilang dan lebur ke dalam huruf syamsiyah yang mengikutinya.\n\nKarena membacanya dengan di-idghamkan, maka hukum bacaan \'Al\' Syamsiyah sering juga disebut dengan Idgham Syamsiyah\n\n- Jumlah huruf syamsiyah itu ada 14 huruf, yaitu : \n\nط ث ص ر ت ض ذ ن د س ظ ز ش ل",
            R.drawable.alif_lam_syamsiyah
        )
        )

        return alifLam
    }

    fun generateRoDummy(): List<RoEntity> {
        var ro = ArrayList<RoEntity>()

        ro.add(
            RoEntity(
            "ro1",
            "Ro Tafkhim",
            "Tafkhim menurut bahasa adalah tebal sedangkan menurut istilah Tafkhim adalah menebalkan huruf tertentu dengan cara menaikkan pangkal lidah\n\n- Cara membacanya yaitu dengan menaikkan pangkal lidah\n\nRo wajib hukumnya dibaca tebal (tafkhim) manakala :\n\n1. Ro bertanda baca fathah = رَحْمَةَ اللهِ\n\n2. Ro bertanda baca dhammah = كَفَرُوْا\n\n3. Ro bertanda sukun (mati), sedang huruf di belakangnya berupa huruf yang difathah = مَرْحَبًا\n\n4. Ro bertanda sukun, sedang huruf di belakangnya berupa huruf yang didhammah = ذُرِّيَّةً\n\n5. Ro yang bertanda baca sukun, sedang huruf di belakangnya berupa huruf yang dikashrah, namun kashrah ini bukan asli tetapi baru datang = أَمِ ارْتَابُوْا",
            R.drawable.ro_tafkhim
        )
        )

        ro.add(
            RoEntity(
            "ro2",
            "Ro Tarqiq",
                "Menurut bahasa, Tarqiq adalah tipis sedangkan menurut istilah Tarqiq adalah membunyikan huruf-huruf tertentu dengan suara atau bacaan tipis.\n\nCara membacanya yaitu dengan menarik bibir sedikit mundur sehingga agak meringis.\n\nRo Tarqiq dibaca apabila :\n\n- Huruf Ro itu sendiri di bertanda baca kasroh (رِ)\n- Huruf Ro dibaca sukun dan terletak setelah huruf yang dibaca kasroh, dan sesudahnya bukan huruf isti\'la",
            R.drawable.ro_tarqiq
        )
        )

        return ro
    }

    /***
     * ===================== AN NAS =============================
     */

    fun generateAnNas(): List<AnNasEntity>{
        var anNas = ArrayList<AnNasEntity>()

        anNas.add(AnNasEntity(
            1,
            "قل اعوذ برب الناس"
        ))

        anNas.add(AnNasEntity(
            2,
            "مالك ناس"
        ))

        anNas.add(AnNasEntity(
            3,
            "الهي الناس"
        ))

        anNas.add(AnNasEntity(
            4,
            "من شر الوسواس الخناس"
        ))

        anNas.add(AnNasEntity(
            5,
            "الذي يوسوس في صدور الناس"
        ))

        anNas.add(AnNasEntity(
            6,
            "من الجنه والناس"
        ))

        return anNas
    }


    /***
     * ===================== AL FALAQ =============================
     */

    fun generateAlFalaq(): List<AlFalaqEntity>{
        var alFalaq = ArrayList<AlFalaqEntity>()

        alFalaq.add(AlFalaqEntity(
            1,
            "قل اعوذ برب الفلق"
        ))

        alFalaq.add(AlFalaqEntity(
            2,
            "من شرما خلق"
        ))

        alFalaq.add(AlFalaqEntity(
            3,
            "ومن شر غاسق اذا وقب"
        ))

        alFalaq.add(AlFalaqEntity(
            4,
            "ومن شر النفاثات في العقد"
        ))

        alFalaq.add(AlFalaqEntity(
            5,
            "ومن شر حا سد اذا حسد"
        ))

        return alFalaq
    }


    /***
     * ===================== AL IKHLASH =============================
     */

    fun generateAlIkhlash(): List<AlIkhlashEntity>{
        var alIkhlash = ArrayList<AlIkhlashEntity>()

        alIkhlash.add(AlIkhlashEntity(
            1,
            "قل هو الله احد"
        ))

        alIkhlash.add(AlIkhlashEntity(
            2,
            "الله الصمد"
        ))

        alIkhlash.add(AlIkhlashEntity(
            3,
            "لم يلد ولم يولد"
        ))

        alIkhlash.add(AlIkhlashEntity(
            4,
            "ولم يكن له كفوا احد"
        ))

        return alIkhlash

    }

        /***
     * ===================== QUIZ TEORI =============================
     */

    fun generateQuizTeori(): List<QuizTeoriEntity> {
        var quizTeori = ArrayList<QuizTeoriEntity>()

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Hamzah (ء) adalah",
            "Jahr",
            "Hams",
            "Rakhawah",
            "Jahr"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak Huruf Hamzah (ء)",
            "Aqshal Halqi",
            "Wasathul Halqi",
            "Adnal Halqi",
            "Aqshal Halqi"
        ))


        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Hamzah (ء) adalah",
            "Jahr",
            "Ishmat",
            "Rakhawah",
            "Rakhawah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Ha (ه) adalah",
            "Jahr",
            "Isti\'la",
            "Hams",
            "Hams"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Ha (ه)",
            "Wasathul Halqi",
            "Aqshal Halqi",
            "Adnal Halqi",
            "Aqshal Halqi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Ha (ه) adalah",
            "Rakhawah",
            "Isti\'la",
            "Hams",
            "Isti\'la"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Kha (ح) adalah",
            "Idzlaq",
            "Isti\'la",
            "Rakhawah",
            "Rakhawah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Kha (ح)",
            "Wasathul Halqi",
            "Aqshal Halqi",
            "Adnal Halqi",
            "Wasathul Halqi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Kha (ح) adalah",
            "Hams",
            "Ithbaq",
            "Infitah",
            "Ithbaq"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Ain (ع) adalah",
            "Isti\'la",
            "Bainiyyah",
            "Rakhawah",
            "Bainiyyah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Ain (ع)",
            "Aqshal Halqi",
            "Adnal Halqi",
            "Wasathul Halqi",
            "Wasathul Halqi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Ain (ع) adalah",
            "Istifal",
            "Bainiyyah",
            "Idzlaq",
            "Idzlaq"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Ghayn (غ) adalah",
            "Isti\'la",
            "Idzlaq",
            "Ithbaq",
            "Isti'la"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Ghayn (غ)",
            "Aqshal Halqi",
            "Adnal Halqi",
            "Wasathul Halqi",
            "Adnal Halqi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Ghayn (غ) adalah",
            "Isti\'la",
            "Ishmat",
            "Ithbaq",
            "Ithbaq"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Kho (خ) adalah",
            "Infitah",
            "Idzlaq",
            "Ithbaq",
            "Infitah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Kho (خ)",
            "Adnal Halqi",
            "Aqshal Halqi",
            "Wasathul Halqi",
            "Adnal Halqi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Kho (خ) adalah",
            "Hams",
            "Tafasysyi",
            "Rakhawah",
            "Tafasysyi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Qaf (ق) adalah",
            "Hams",
            "Shafir",
            "Qalqalah",
            "Qalqalah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Qaf (ق)",
            "Aqshal Lisan",
            "Wasathul Lisan",
            "Hafatul Lisan",
            "Aqshal Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Qaf (ق) adalah",
            "Syiddah",
            "Shafir",
            "Qalqalah",
            "Shafir"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Kaf (ك) adalah",
            "Jahr",
            "Tafasysyi",
            "Ishmat",
            "Ishmat"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Kaf (ك)",
            "Wasathul Lisan",
            "Aqshal Lisan",
            "Hafatul Lisan",
            "Aqshal Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Kaf (ك) adalah",
            "Ishmat",
            "Hams",
            "Shafir",
            "Shafir"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Jim (ج) adalah",
            "Rakhawah",
            "Shafir",
            "Qalqalah",
            "Qalqalah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Jim (ج)",
            "Wasathul Lisan",
            "Aqshal Lisan",
            "Hafatul Lisan",
            "Wasathul Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Jim (ج) adalah",
            "Qalqalah",
            "Syiddah",
            "Idzlaq",
            "Idzlaq"
        ))


        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Syin (ش) adalah",
            "Tafasysyi",
            "Syiddah",
            "Idzlaq",
            "Tafasysyi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Syin (ش)",
            "Aqshal Lisan",
            "Hafatul Lisan",
            "Wasathul Lisan",
            "Wasathul Lisan"
        ))


        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Syin (ش) adalah",
            "Tafasysyi",
            "Rakhawah",
            "Idzlaq",
            "Idzlaq"
        ))


        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Ya (ي) adalah",
            "Hams",
            "Tafasysyi",
            "Liin",
            "Liin"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Ya (ي)",
            "Aqshal Lisan",
            "Hafatul Lisan",
            "Wasathul Lisan",
            "Wasathul Lisan"
        ))


        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Ya (ي) adalah",
            "Syiddah",
            "Hams",
            "Ishmat",
            "Syiddah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Dhad (ض) adalah",
            "Hams",
            "Isthithalah",
            "Idzlaq",
            "Isthithalah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Dhad (ض)",
            "Aqshal Lisan",
            "Hafatul Lisan",
            "Wasathul Lisan",
            "Hafatul Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Dhad (ض) adalah",
            "Ithbaq",
            "Isthithalah",
            "Shafir",
            "Shafir"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Lam (ل) adalah",
            "Qalqalah",
            "Ishmat",
            "Inhiraf",
            "Inhiraf"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Lam (ل)",
            "Aqshal Lisan",
            "Wasathul Lisan",
            "Hafatul Lisan",
            "Hafatul Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Lam (ل) adalah",
            "Qalqalah",
            "Ishmat",
            "Idzlaq",
            "Qalqalah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Nun (ن) adalah",
            "Ghunnah",
            "Rakhawah",
            "Inhiraf",
            "Ghunnah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Nun (ن)",
            "Hafatul Lisan",
            "Tharaful Lisan",
            "Makhraj Asy Syafatani",
            "Tharaful Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Nun (ن) adalah",
            "Rakhawah",
            "Ghunnah",
            "Idzlaq",
            "Rakhawah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Ro (ر) adalah",
            "Takrir",
            "Hams",
            "Rakhawah",
            "Takrir"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Ro (ر)",
            "Hafatul Lisan",
            "Makhraj Asy Syafatani",
            "Tharaful Lisan",
            "Tharaful Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Ro (ر) adalah",
            "Takrir",
            "Hams",
            "Bainiyyah",
            "Hams"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Ta (ت) adalah",
            "Ghunnah",
            "Hams",
            "Bainiyyah",
            "Hams"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Ta (ت)",
            "Tharaful Lisan",
            "Hafatul Lisan",
            "Makhraj Asy Syafatani",
            "Tharaful Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Ta (ت) adalah",
            "Idzlaq",
            "Hams",
            "Ishmat",
            "Idzlaq"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Tha (ط) adalah",
            "Ishmat",
            "Idzlaq",
            "Bainiyyah",
            "Ishmat"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Tha (ط)",
            "Tharaful Lisan",
            "Hafatul Lisan",
            "Makhraj Asy Syafatani",
            "Tharaful Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Tha (ط) adalah",
            "Jahr",
            "Ithbaq",
            "Tafasysyi",
            "Tafasysyi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Dal (د) adalah",
            "Qalqalah",
            "Idzlaq",
            "Rakhawah",
            "Qalqalah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Dal (د)",
            "Tharaful Lisan",
            "Hafatul Lisan",
            "Makhraj Asy Syafatani",
            "Tharaful Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Dal (د) adalah",
            "Ishmat",
            "Qalqalah",
            "Shafir",
            "Shafir"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Sin (س) adalah",
            "Syiddah",
            "Shafir",
            "Tafasysyi",
            "Shafir"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Sin (س) adalah",
            "Hafatul Lisan",
            "Tharaful Lisan",
            "Makhraj Asy Syafatani",
            "Tharaful Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Sin (س) adalah",
            "Hams",
            "Shafir",
            "Tafasysyi",
            "Tafasysyi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Shad (ص) adalah",
            "Syiddah",
            "Shafir",
            "Tafasysyi",
            "Shafir"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Shad (ص)",
            "Hafatul Lisan",
            "Tharaful Lisan",
            "Makhraj Asy Syafatani",
            "Tharaful Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Shad (ص) adalah",
            "Ithbaq",
            "Shafir",
            "Tafasysyi",
            "Tafasysyi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Zay (ز) adalah",
            "Idzlaq",
            "Shafir",
            "Tafasysyi",
            "Shafir"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Zay (ز)",
            "Makhraj Asy Syafatani",
            "Hafatul Lisan",
            "Tharaful Lisan",
            "Tharaful Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Zay (ز) adalah",
            "Ishmat",
            "Shafir",
            "Tafasysyi",
            "Tafasysyi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Dzal (ذ) adalah",
            "Rakhawah",
            "Qalqalah",
            "Tafasysyi",
            "Rakhawah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Dzal (ذ)",
            "Makhraj Asy Syafatani",
            "Hafatul Lisan",
            "Tharaful Lisan",
            "Tharaful Lisan"
        ))


        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Dzal (ذ) adalah",
            "Syiddah",
            "Ishmat",
            "Rakhawah",
            "Syiddah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Zha (ظ) adalah",
            "Rakhawah",
            "Shafir",
            "Tafasysyi",
            "Rakhawah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Zha (ظ)",
            "Makhraj Asy Syafatani",
            "Tharaful Lisan",
            "Hafatul Lisan",
            "Tharaful Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Zha (ظ) adalah",
            "Rakhawah",
            "Ithbaq",
            "Tafasysyi",
            "Tafasysyi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Tsa (ث) adalah",
            "Jahr",
            "Shafir",
            "Istifal",
            "Istifal"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Tsa (ث)",
            "Makhraj Asy Syafatani",
            "Tharaful Lisan",
            "Hafatul Lisan",
            "Tharaful Lisan"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Tsa (ث) adalah",
            "Hams",
            "Shafir",
            "Istifal",
            "Shafir"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Fa (ف) adalah",
            "Hams",
            "Jahr",
            "Ishmat",
            "Hams"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Fa (ف)",
            "Makhraj Asy Syafatani",
            "Tharaful Lisan",
            "Hafatul Lisan",
            "Makhraj Asy Syafatani"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Fa (ف) adalah",
            "Ishmat",
            "Hams",
            "Rakhawah",
            "Ishmat"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Wawu (و) adalah",
            "Hams",
            "Syiddah",
            "Liin",
            "Liin"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Wawu (و)",
            "Tharaful Lisan",
            "Makhraj Asy Syafatani",
            "Hafatul Lisan",
            "Makhraj Asy Syafatani"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Wawu (و) adalah",
            "Jahr",
            "Liin",
            "Ithbaq",
            "Ithbaq"
        ))


        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Ba (ب) adalah",
            "Qalqalah",
            "Hams",
            "Liin",
            "Qalqalah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Ba (ب)",
            "Makhraj Asy Syafatani",
            "Tharaful Lisan",
            "Hafatul Lisan",
            "Makhraj Asy Syafatani"
        ))


        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Ba (ب) adalah",
            "Qalqalah",
            "Liin",
            "Jahr",
            "Liin"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Salah satu sifat huruf Mim (م) adalah",
            "Ghunnah",
            "Rakhawah",
            "Liin",
            "Ghunnah"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Dimana letak huruf Mim (م) adalah",
            "Tharaful Lisan",
            "Hafatul Lisan",
            "Makhraj Asy Syafatani",
            "Makhraj Asy Syafatani"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Yang bukan sifat huruf Mim (م) adalah",
            "Ghunnah",
            "Bainiyyah",
            "Liin",
            "Liin"
        ))

        return quizTeori
    }

}