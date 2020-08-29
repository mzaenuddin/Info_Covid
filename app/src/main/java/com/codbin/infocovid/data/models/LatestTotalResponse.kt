package com.codbin.infocovid.data.models

import java.util.*

data class LatestTotalResponse(
    val confirmed: Int,
    val critical: Int,
    val deaths: Int,
    val lastChange: Date,
    val lastUpdate: Date,
    val recovered: Int


)
