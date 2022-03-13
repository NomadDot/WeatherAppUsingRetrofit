package com.example.retrofitrxjavatestproject.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import com.example.retrofitrxjavatestproject.model.WeatherData;

public interface WeatherAPI {

    public static final String BASE_URL = "https://api.weatherapi.com/v1/";

    @GET("current.json")
    Call<WeatherData> getCurrentWeather(@Query("key") String key,
                                        @Query("q") String name,
                                        @Query("aqi") String aqi);
}
