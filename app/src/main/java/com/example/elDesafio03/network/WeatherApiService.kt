package com.example.elDesafio03.network

import com.example.elDesafio03.model.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    // obtiene el clima actual de una ciudad
    @GET("current.json")
    suspend fun getCurrentWeather(
        @Query("key") apiKey: String,
        @Query("q") query: String
    ): Response<WeatherResponse>
}
