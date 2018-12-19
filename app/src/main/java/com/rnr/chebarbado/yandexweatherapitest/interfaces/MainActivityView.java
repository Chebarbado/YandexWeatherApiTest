package com.rnr.chebarbado.yandexweatherapitest.interfaces;

import com.arellomobile.mvp.MvpView;

public interface MainActivityView extends MvpView {
    void filterByCountry();
    void showWeatherForDate();
    void loadWeatherInfoList();
}
