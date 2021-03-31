package com.example.xypstydy.databing.ui;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableArrayMap;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableMap;

import com.example.xypstydy.R;
import com.example.xypstydy.databinding.ActivityCollectBinding;

import java.util.Random;

/**
 * create by Administrator
 * on: 2021/3/31
 * Time: 15:42
 */

public class ObservableCollectActivity  extends AppCompatActivity implements View.OnClickListener {

    ActivityCollectBinding activityCollectBinding;
    private ObservableList<String>  list = new ObservableArrayList<>();
    private ObservableMap<String ,String> map = new ObservableArrayMap<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
        activityCollectBinding = DataBindingUtil.setContentView(this,R.layout.activity_collect);
        activityCollectBinding.setOnClickListener(this);
        list.add("list值");
        map.put("name","map的值");
        activityCollectBinding.setList(list);
        activityCollectBinding.setMap(map);
        activityCollectBinding.setKey("name");

    }

    @Override
    public void onClick(View v) {
        int randowInt = new Random().nextInt(100);
         switch (v.getId()){
             case R.id.btn_index:
                 list.add(0,"list的值" + randowInt);
                 break;
             case R.id.btn_key:
                 map.put("name","map的值" + randowInt);
                 break;
         }
    }
}
