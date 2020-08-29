package com.codbin.infocovid.data.models

import com.google.gson.annotations.SerializedName

data class DailyReportResponse(
    val country: String,
    @SerializedName("latitude")
    val lat: Double,
    @SerializedName("longitude")
    val long: Double,
    val date: String,
    val provinces: List<DailyReportByCountryNameProvinces>

)