package com.mobile.looke.data.network;

import com.mobile.looke.data.response.ToppingDAO;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Endpoint {

    @GET("teste.json")
    Call<ToppingDAO> requestListToppings();
}