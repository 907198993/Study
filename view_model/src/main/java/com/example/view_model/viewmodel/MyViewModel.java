package com.example.view_model.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.view_model.util.LogUtils;

/**
 * create by Administrator
 * on: 2021/4/2
 * Time: 15:47
 */
public class MyViewModel extends ViewModel {

    @Override
    protected void onCleared() {
        super.onCleared();
        LogUtils.i("MyViewModel的相关","Activity被杀死后也会被销毁");
    }
}
