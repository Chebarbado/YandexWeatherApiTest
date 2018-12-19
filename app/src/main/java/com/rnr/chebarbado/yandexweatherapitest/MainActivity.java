package com.rnr.chebarbado.yandexweatherapitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.rnr.chebarbado.yandexweatherapitest.interfaces.MainActivityView;
import com.rnr.chebarbado.yandexweatherapitest.presenters.MainActivityPresenter;

import java.util.ArrayList;

public class MainActivity extends MvpAppCompatActivity implements MainActivityView {

    @InjectPresenter
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        ArrayList<String>cities = new ArrayList<>(20);
        ArrayList<String>weather = new ArrayList<>(20);
        //Временный код
        for (int i = 0; i < 20; i++) {
            cities.add("Город такой-то");
            weather.add("25");
            RecyclerView rView = (RecyclerView) findViewById(R.id.countriesRecyclerView);
            RecyclerViewAdapter adapter = new RecyclerViewAdapter(cities,weather,this);
            rView.setLayoutManager(new LinearLayoutManager(this));
            rView.setAdapter(adapter);
        }

    }

    @Override
    public void filterByCountry() {

    }

    @Override
    public void showWeatherForDate() {

    }

    @Override
    public void loadWeatherInfoList() {

    }
}
