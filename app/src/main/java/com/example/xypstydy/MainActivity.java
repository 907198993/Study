package com.example.xypstydy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.xypstydy.databinding.ActivityMainBinding;
import com.example.xypstydy.databing.ui.BaseObservableActivity;
import com.example.xypstydy.databing.ui.ObservableCollectActivity;
import com.example.xypstydy.databing.ui.ObservableFieldAvtivity;
import com.example.xypstydy.databing.utils.ActivityUtils;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener {

     ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding =  DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_baseobservable:
                ActivityUtils.transfer(this, BaseObservableActivity.class);
                break;
            case R.id.btn_observableField:
                ActivityUtils.transfer(this, ObservableFieldAvtivity.class);
                break;
            case R.id.btn_observableCollection:
                ActivityUtils.transfer(this, ObservableCollectActivity.class);
                break;
        }
    }
}
