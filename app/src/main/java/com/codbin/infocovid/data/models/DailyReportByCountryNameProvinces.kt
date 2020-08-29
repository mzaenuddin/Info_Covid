package com.codbin.infocovid.data.models

data class DailyReportByCountryNameProvinces(
    val province: String,
    val confirmed: Int,
    val recovered: Int,
    val deaths: Int,
    val active: Int
)