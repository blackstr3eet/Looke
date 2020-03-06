package com.mobile.looke.presentation;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.mobile.looke.data.domain.Topping;
import java.util.ArrayList;
import java.util.List;

public class ToppingViewModel extends ViewModel {

    public MutableLiveData<List<Topping>> toppingLiveData = new MutableLiveData();

    public void getListToppings() {
        toppingLiveData.setValue(mockListTopping());
    }

    private List<Topping> mockListTopping() {
        List<Topping> list = new ArrayList();

        list.add(new Topping("5003", "Pie"));
        list.add(new Topping("3403", "Chocolate"));
        list.add(new Topping("8949", "Blueberry"));
        list.add(new Topping("9409", "Avocado"));

        list.add(new Topping("5003", "Pie"));
        list.add(new Topping("3403", "Chocolate"));
        list.add(new Topping("8949", "Blueberry"));
        list.add(new Topping("9409", "Avocado"));

        list.add(new Topping("5003", "Pie"));
        list.add(new Topping("3403", "Chocolate"));
        list.add(new Topping("8949", "Blueberry"));
        list.add(new Topping("9409", "Avocado"));

        list.add(new Topping("5003", "Pie"));
        list.add(new Topping("3403", "Chocolate"));
        list.add(new Topping("8949", "Blueberry"));
        list.add(new Topping("9409", "Avocado"));

        return list;
    }
}