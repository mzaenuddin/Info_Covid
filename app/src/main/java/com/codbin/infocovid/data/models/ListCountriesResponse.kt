package com.codbin.infocovid.data.models

import com.google.gson.annotations.SerializedName

data class ListCountriesResponse(
    val name: String,
    @SerializedName("alpha2code")
    val alpha2code: String,
    @SerializedName("alpha3code")
    val alpha3code: String,
    @SerializedName("latitude")
    val lat: Double,
    @SerializedName("longitude")
    val long: Double


)