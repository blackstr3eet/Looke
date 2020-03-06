package com.mobile.looke.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.mobile.looke.R;
import com.mobile.looke.data.Topping;
import java.util.List;

public class ToppingAdapter extends RecyclerView.Adapter<ToppingAdapter.ToppingViewHolder> {

    private List<Topping> topping;

    public ToppingAdapter(final List<Topping> topping) {
        this.topping = topping;
    }

    @NonNull
    @Override
    public ToppingAdapter.ToppingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_topping, parent, false);
        return new ToppingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToppingViewHolder holder, int position) {
        holder.id.setText(topping.get(position).getId());
        holder.type.setText(topping.get(position).getType());
    }

    @Override
    public int getItemCount() {
        return topping.size();
    }

    public static class ToppingViewHolder extends RecyclerView.ViewHolder {

        public TextView id;
        public TextView type;

        public ToppingViewHolder(View view) {
            super(view);
            id = view.findViewById(R.id.toppingId);
            type = view.findViewById(R.id.toppingType);
        }
    }
}