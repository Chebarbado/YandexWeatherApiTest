package com.rnr.chebarbado.yandexweatherapitest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView city;
    public TextView weather;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        city = (TextView) itemView.findViewById(R.id.city_list_item_title_text_view);
        weather = (TextView) itemView.findViewById(R.id.city_list_item_weather);
    }

    @Override
    public void onClick(View view) {

    }
}
