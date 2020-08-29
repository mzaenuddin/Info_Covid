package com.codbin.infocovid.data.api
import com.codbin.infocovid.data.models.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface ApiCovidService {
    //About Help
    @GET("help/countries?format=json")
    fun getListOfCountries(): Call<List<ListCountriesResponse>>

    @GET("docs.json")
    fun openAPIDocumentation(): Call<OpenAPIDocsResponse>

    // total
    @GET("totals?format=json")
    fun getLatestTotals(): Call<List<LatestTotalResponse>>

    @GET("totals?date-format=YYYY-MM-DD&format=json")
    fun getDailyReportTotals(
        @Query("date") selectedDate: String
    ):Call<List<DailyReportTotalResponse>>


    //country
    @GET("name?date-format=YYYY-MM-DD&format=json")
    fun getDailyReportByCountryName(
        @Query("date") selectedDate: String,
        @Query("name") selectedDate: String
    ): Call<List<DailyReportResponse>>


    @GET("all?format=json")
    fun getLatestAllCountries(
        @Query("date") selectedDate: String
    ): Call<List<LatestCountryResponse>>


    @GET("code?format")
    fun getLatestCountryDataByCode(
        @Query("code") selectedDate: String
    ): Call<List<LatestCountryResponse>>



    @GET("country?format=json&name=italy")
    fun getLatestCountryDataByName(): Call<List<LatestCountryResponse>>


    @GET("code?format=json&date-format=YYYY-MM-DD&date=2020-04-01&code=it")
    fun getDailyReportByCountryCode(
        @Query("date") selectedDate: String,
        @Query("code") selectedDate: String
    ): Call<List<DailyReportResponse>>

    @GET("all?date-format=YYYY-MM-DD&format=json&date=2020-04-01")
    fun getDailyReportAllCountries(
        @Query("date") selectedDate: String
    ): Call<List<DailyReportResponse>>


}