package com.example.xypstydy.databing.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;

import com.example.xypstydy.BR;
import com.example.xypstydy.R;
import com.example.xypstydy.databinding.ActivityBaseobservableBinding;
import com.example.xypstydy.databing.bean.Dog;

/**
 * create by Administrator
 * on: 2021/3/31
 * Time: 13:54
 */
public class BaseObservableActivity  extends AppCompatActivity implements View.OnClickListener {
    ActivityBaseobservableBinding activityBaseobservableBinding;
    private Dog dog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseobservable);
        activityBaseobservableBinding = DataBindingUtil.setContentView(this,R.layout.activity_baseobservable);
        activityBaseobservableBinding.setOnClickListener(this);
        dog = new Dog("XX","颜色");
        activityBaseobservableBinding.setDog(dog);
        addListener();
    }

    private  void addListener(){
        dog.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if(propertyId == BR.name){
                    Log.e("看看刷新了哪", "刷新了name");
                } else if (propertyId == BR._all) {
                    Log.e("看看刷新了哪", "全部全部");
                } else {
                    Log.e("看看刷新了哪", "未知错误~");
                }
            }
        });
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_name:
                dog.setDataOnlyName("二哈","黑白相间");
                break;
            case R.id.btn_all:
                dog.setDataAll("金毛","金色");
                break;

        }
    }
}
