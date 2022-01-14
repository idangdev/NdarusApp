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
            "Mad Arid Lissukun 2",
            "Mad Arid Lissukun adalah cara memanjangkan bacaan pada saat berhenti (waqof) - baik di akhir maupun di tengah ayat\n\n- Mad adalah panjang bacaan\n- Arid artinya yang bertemu\n- Lis artinya karena\n- Sukun artinya mati\n\nHukum Mad Arid Lissukun berlaku apabila huruf Mad Thobi\'i bertemu dengan huruf (hidup) berbasis Fathah, Fathatain, Kasrah, Kasratain, Dhammah dan Dhammatain yang berada di dalam satu kata atau kalimat\n\nPanjang bacaan Mad Arid Lissukun boleh 2, 4, atau 6 harakat.",
            R.drawable.mad_arid_lissukun
        ))

        return mad
    }

    fun generateQalqalahDummy(): List<QalqalahEntity> {
        var qalqalah = ArrayList<QalqalahEntity>()

        qalqalah.add(QalqalahEntity(
            "qalqalah1",
            "Qalqalah Qubro",
            "Huruf qalqalah ada 5 yaitu ق ط ب ج د atau supaya mudah diingat yaitu BA JU DI TO KO\n\n- Qalqalah Qubro yaitu Qalqalah yang berada diakhir kata atau karena diwaqafkan bukan karena sukun asli.\n\n- Cara membacanya yaitu dengan memantulkan suara dari makhroj hurufnya dengan pantulan yang kuat",
            R.drawable.mad_arid_lissukun
        ))

        return qalqalah
    }

    fun generateLamJalalahDummy(): List<LamJalalahEntity> {
        var lamJalalah = ArrayList<LamJalalahEntity>()

        lamJalalah.add(LamJalalahEntity(
            "lam1",
            "Lam Tafkhim",
            "Tafkhim artinya tebal atau berat. Maksudnya adalah membaca huruf Lam dengan bunyi tebal atau berat, seperti bunyi antara \"LAH dan LOH\". Bunyi \"Tafkhim\" itu terjadi apabila sebelum huruf Lam Jalalah ada harakat fathah (a) atau dhammah (u)",
            R.drawable.mad_arid_lissukun
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
            R.drawable.mad_arid_lissukun
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
            R.drawable.mad_arid_lissukun
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
            R.drawable.mad_arid_lissukun
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
            R.drawable.mad_arid_lissukun
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
            R.drawable.mad_arid_lissukun
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
            "Apa nama presiden pertama Indonesia?",
            "Soekarno",
            "Soeharto",
            "Megawati",
            "Soekarno"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Apa nama presiden Indonesia sekarang?",
            "Soekarno",
            "Soeharto",
            "Jokowi",
            "Jokowi"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Ibukota Indonesia?",
            "Jakarta",
            "Pemalang",
            "Tegal",
            "Jakarta"
        ))

        quizTeori.add(QuizTeoriEntity(
            "Apa nama ibukota malaysia?",
            "Jakarta",
            "Pemalang",
            "Kuala Lumpur",
            "Kuala Lumpur"
        ))

        return quizTeori
    }

}