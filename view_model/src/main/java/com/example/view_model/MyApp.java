package com.example.view_model;

import android.app.Application;

/**
 * create by Administrator
 * on: 2021/4/2
 * Time: 15:39
 */
public class MyApp  extends Application {

    public static MyApp context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static MyApp getInstance(){
        if(context == null){
            context = new MyApp();
        }
        return context;
    }
}
