package com.mobile.looke.data.network;

import com.mobile.looke.data.domain.ResponseBody;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Data {

    @GET("teste.json")
    Call<List<ResponseBody>> getData();
}