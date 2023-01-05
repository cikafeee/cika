package com.example.lagufavorit

object SongsData {
    private val songsName = arrayOf(
        "Golden hour",
        "Anti Hero",
        "We Don't Talk Anymore",
        "Diet Mountain Dew",
        "Youth",
        "Only",
        "Golden Hour",
        "About You",
        "Hard To Love",
        "Space Song",
        "Lucky",
        "Kill Bill",
        "Oceans & Engines",
        "Through the Night",
        "Some Nights",
        "How can I love the heartbreak, you're the one I love",
    )

    private val songsSinger = arrayOf(
        "Taylor Swift",
        "Charlie Puth, Selena Gomez",
        "Lana Del Rey",
        "Troye Sivan",
        "LeeHi",
        "JVKE",
        "The 1975",
        "Rose",
        "Beach House",
        "Jason Mraz, Colbi Caillat",
        "SZA",
        "Niki",
        "IU",
        "Taeyeon",
        "AKMU",
    )

    private val songsAlbums = arrayOf(
        "Midnights",
        "Nine Track Mind",
        "Born To Die",
        "Blue Neighbourhood",
        "4 ONLY",
        "Single",
        "Being Funny In A Foreign Language",
        "Born Pink",
        "Depression Cherry",
        "We Sing, We Dance, We Steal Things",
        "SOS",
        "Nicole",
        "Palette",
        "INVU",
        "SAILING",
    )

    private val songsDetails = arrayOf(
        "Lagu ini dirilis tahun 2022",
        "Lagu ini dirilis tahun 2016",
        "Lagu ini dirilis tahun 2012",
        "Lagu ini dirilis tahun 2015",
        "Lagu ini dirilis tahun 2021",
        "Lagu ini dirilis tahum 2022",
        "Lagu ini dirilis tahun 2022",
        "Lagu ini dirilis tahun 2022",
        "Lagu ini dirilis tahun 2015",
        "Lagu ini dirilis tahun 2008",
        "Lagu ini dirilis tahun 2022",
        "Lagu ini dirilis tahun 2022",
        "Lagu ini dirilis tahun 2017",
        "Lagu ini dirilis tahun 2022",
        "Lagu ini dirilis tahun 2019",
    )

    private val songsImages = intArrayOf(
        R.drawable.midnights,
        R.drawable.nine_track_mind,
        R.drawable.born_to_die,
        R.drawable.blue_neighbourhood,
        R.drawable.only,
        R.drawable.golden_hour,
        R.drawable.being_funny_in_a_foreign_language,
        R.drawable.born_pink,
        R.drawable.depression_cherry,
        R.drawable.we_sings_we_dance_we_steal_things,
        R.drawable.sos,
        R.drawable.nicole,
        R.drawable.palette,
        R.drawable.invu,
        R.drawable.sailing,
    )

    val listData : ArrayList<Songs>
        get() {
            val list = arrayListOf<Songs>()
            for (position in songsName.indices) {
                val songs = Songs()
                songs.name = songsName[position]
                songs.singer = songsSinger[position]
                songs.album = songsAlbums[position]
                songs.detail = songsDetails[position]
                songs.photo = songsImages[position]
                list.add(songs)
            }
            return list
        }
}