package com.mobile.looke.data.network;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class API {

    private API(){
        // singleton class
    }

    public Retrofit initialize() {
         return new Retrofit.Builder()
                .baseUrl("https://sampletestingproject-4a8fc.web.app/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public static Data service() {
        return new API().initialize().create(Data.class);
    }
}