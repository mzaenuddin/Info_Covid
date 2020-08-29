package com.codbin.infocovid.data.models

import com.google.gson.annotations.SerializedName
import java.util.*

data class LatestCountryResponse(
    val code: String,
    val confirmed: Int,
    val country: String,
    val critical: Int,
    val deaths: Int,
    val lastChange: Date?,
    var lastUpdate: Date?,
    @SerializedName("latitude")
    var lat: Double,
    @SerializedName("longitude")
    var long: Double,
    var recovered: Int


    )