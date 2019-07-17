package ru.ifsoft.chat.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static ru.ifsoft.chat.constants.Constants.API_DOMAIN;

public class ApiClient {
    private static Retrofit retrofit = null;


    public static Retrofit getApiClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(API_DOMAIN)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
