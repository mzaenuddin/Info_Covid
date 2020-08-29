package com.codbin.infocovid.data.models

import java.util.*

data class DailyReportTotalResponse(
    val active: Int,
    val confirmed: Int,
    val critical: Int,
    val date: String,
    val deaths: Int,
    val recovered: Int

)
