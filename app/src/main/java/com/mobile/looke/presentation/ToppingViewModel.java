package com.mobile.looke.presentation;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mobile.looke.data.domain.ResponseBody;
import com.mobile.looke.data.domain.Topping;
import com.mobile.looke.data.network.API;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ToppingViewModel extends ViewModel {

    public MutableLiveData<List<Topping>> toppingLiveData = new MutableLiveData();

    public void getListToppings() {

        Call<List<ResponseBody>> response = API.service().getData();
        response.enqueue(new Callback<List<ResponseBody>>() {
            @Override
            public void onResponse(Call<List<ResponseBody>> call, Response<List<ResponseBody>> response) {
                if(response.isSuccessful()) {
                    toppingLiveData.setValue(filterListOnlyToppings(response.body()));
                }
            }

            @Override
            public void onFailure(Call<List<ResponseBody>> call, Throwable t) {
                Log.e("response_error: ", t.toString());
            }
        });
    }

    // TODO implementation crate and filter list by body response (mocked list temporary)
    private List<Topping> filterListOnlyToppings(List<ResponseBody> body) {
        List<Topping> listFiltered = new ArrayList();

        listFiltered.add( new Topping("1742","Blueberry"));
        listFiltered.add( new Topping("3838","Pinapple"));
        listFiltered.add( new Topping("9494","Mango"));
        listFiltered.add( new Topping("3737","Cherry"));
        listFiltered.add( new Topping("3440","Banana"));
        listFiltered.add( new Topping("2626","Avocado"));

        return listFiltered;
    }
}