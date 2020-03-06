package com.mobile.looke.presentation;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mobile.looke.data.response.ResponseBody;
import com.mobile.looke.data.domain.Topping;
import com.mobile.looke.data.network.API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                    toppingLiveData.setValue(filterListOnlyByToppings(response.body()));
                }
            }

            @Override
            public void onFailure(Call<List<ResponseBody>> call, Throwable t) {
                Log.e("response_error: ", t.toString());
            }
        });
    }

    private List<Topping> filterListOnlyByToppings(List<ResponseBody> body) {
        /** deny/allow duplicate toppings **/
        boolean allowDuplicateToppings = true;

        Map<String, String> map = new HashMap();
        List<Topping> list = new ArrayList();

        for(ResponseBody item : body) {
            for (Topping topping : item.getTopping()) {
                list.add(new Topping(topping.getId(), topping.getType()));

                /** remove toppings duplicate by keys in map **/
                if(!map.containsKey(topping.getId())) {
                    map.put(topping.getId(), topping.getType());
                }
            }
        }

        if(allowDuplicateToppings) {
            return list;
        }

        list.clear();

        /** create new list by map without duplicate toppings **/
        for(Map.Entry<String, String> test : map.entrySet()) {
            list.add(new Topping(test.getKey(), test.getValue()));
        }

        return list;
    }
}