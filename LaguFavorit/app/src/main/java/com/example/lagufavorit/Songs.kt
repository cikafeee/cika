package com.example.lagufavorit

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@kotlinx.parcelize.Parcelize
data class Songs(
    var name : String = "",
    var singer : String = "",
    var album : String = "",
    var detail : String = "",
    var photo : Int = 0,
) : Parcelable