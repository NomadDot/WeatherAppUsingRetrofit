package com.example.retrofitrxjavatestproject.network;

import java.lang.ref.WeakReference;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static RetrofitClient instance = null;
    private WeatherAPI weatherAPI;

    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(weatherAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        weatherAPI = retrofit.create(WeatherAPI.class);
    }

    public static synchronized RetrofitClient getInstance() {
        if(instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
    }

    public WeatherAPI getWeatherAPI() {
        return weatherAPI;
    }


}
