package com.example.appferry.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
    private static String BASE_URL = "http://localhost:8000";
    private static Retrofit retrofit;

    public static ApiEndpoint endPoint(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiEndpoint service = retrofit.create(ApiEndpoint.class);
        return retrofit.create(ApiEndpoint.class);
    }
}
