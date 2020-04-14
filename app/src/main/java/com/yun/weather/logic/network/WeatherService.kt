package com.yun.weather.logic.network

import com.yun.weather.YunApplication
import com.yun.weather.logic.model.DeilyResponse
import com.yun.weather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("v2.5/${YunApplication.key}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng")lng: String,@Path("lat") lat: String): Call<RealtimeResponse>

    @GET("v2.5/${YunApplication.key}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng")lng: String,@Path("lat") lat: String): Call<DeilyResponse>
}