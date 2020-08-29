package com.codbin.infocovid.di
import com.codbin.infocovid.data.api.ApiCovidService
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class AppModule {

    fun provideAPIService(): ApiCovidService {
        val httpClient = OkHttpClient.Builder()

        httpClient.addInterceptor { chain ->
            val request: Request =
                chain.request().newBuilder()
                    .addHeader("x-rapidapi-host","covid-19-data.p.rapidapi.com")
                    .addHeader("x-rapidapi-key","e6e8e00925mshd692e329716c770p1e041djsn7b589a98a0f7")
                    .build()
                    chain.proceed(request)
        }

        return Retrofit.Builder()
            .baseUrl("https://covid-19-data.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(httpClient.build())
            .build()
            .create(ApiCovidService::class.java)


    }
}