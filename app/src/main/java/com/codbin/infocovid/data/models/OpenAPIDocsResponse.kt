package com.codbin.infocovid.data.models

import com.google.gson.annotations.SerializedName

data class OpenAPIDocsResponse(
    @SerializedName("openapi")
    val openApi: String,
    val info: OpenAPIDocInfo

)
