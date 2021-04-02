package com.example.xypstydy.databing.ui;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.xypstydy.R;
import com.example.xypstydy.databinding.ActivityDatabingBinding;
import com.example.xypstydy.databing.bean.Human;

/**
 * create by Administrator
 * on: 2021/4/1
 * Time: 13:07
 */
public class DatabingActivity  extends AppCompatActivity implements View.OnClickListener {

    ActivityDatabingBinding activityDatabingBinding;
    Human human;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_databing);
        activityDatabingBinding = DataBindingUtil.setContentView(this,R.layout.activity_databing);
        human= new Human("HAHA",18);
        activityDatabingBinding.setHuman(human);
        activityDatabingBinding.btnSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_search:
                activityDatabingBinding.btnSearch.setText(human.humanName.get());
                break;
        }

    }
}
