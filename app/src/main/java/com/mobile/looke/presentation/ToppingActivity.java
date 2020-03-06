package com.mobile.looke.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mobile.looke.R;
import com.mobile.looke.Topping;

import java.util.ArrayList;
import java.util.List;

public class ToppingActivity extends AppCompatActivity {

    private ToppingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_topping);

        getSupportActionBar().setTitle(getString(R.string.toolbar_title_toppings));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.toppingRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ToppingAdapter(mockListTopping());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
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