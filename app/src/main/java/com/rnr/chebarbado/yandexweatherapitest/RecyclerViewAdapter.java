package com.rnr.chebarbado.yandexweatherapitest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private ArrayList<String> cities;
    private ArrayList<String> weather;
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> cities, ArrayList<String> weather, Context context) {
        this.cities = cities;
        this.weather = weather;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.city_list_item,null);
        RecyclerViewHolder rvh = new RecyclerViewHolder(layoutView);
        return rvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int i) {
        recyclerViewHolder.city.setText(cities.get(i));
        recyclerViewHolder.weather.setText(weather.get(i)+ " °");
    }

    @Override
    public int getItemCount() {
        return this.cities.size();
    }
}
