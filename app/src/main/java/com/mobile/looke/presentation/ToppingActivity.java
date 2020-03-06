package com.mobile.looke.presentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.mobile.looke.R;
import com.mobile.looke.Topping;
import com.mobile.looke.ToppingViewModel;
import java.util.List;

public class ToppingActivity extends AppCompatActivity {

    private ToppingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_topping);

        getSupportActionBar().setTitle(getString(R.string.toolbar_title_toppings));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ToppingViewModel viewModel = ViewModelProviders.of(this).get(ToppingViewModel.class);

        viewModel.toppingLiveData.observe(this, new Observer<List<Topping>>() {
            @Override
            public void onChanged(List<Topping> toppings) {
                RecyclerView recyclerView = findViewById(R.id.toppingRecyclerView);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(ToppingActivity.this));
                adapter = new ToppingAdapter(toppings);
                recyclerView.setAdapter(adapter);
            }
        });

        viewModel.getListToppings();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}