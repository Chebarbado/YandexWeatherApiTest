package com.rnr.chebarbado.yandexweatherapitest.presenters;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.rnr.chebarbado.yandexweatherapitest.interfaces.MainActivityView;
import com.rnr.chebarbado.yandexweatherapitest.pojo.CityInfo;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

@InjectViewState
public class MainActivityPresenter extends MvpPresenter<MainActivityView> implements Observer<CityInfo> {
    @Override
    public void attachView(MainActivityView view) {
        super.attachView(view);
        loadDate();
    }

    private void loadDate() {
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(CityInfo cityInfo) {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
