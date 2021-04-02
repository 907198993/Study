package com.example.xypstydy.databing.ui;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.xypstydy.R;
import com.example.xypstydy.databinding.ActivityBaseuseBinding;
import com.example.xypstydy.databing.utils.OnClickUtil;


/**
 * create by Administrator
 * on: 2021/4/1
 * Time: 14:28
 */
public class BaseUseActivity  extends AppCompatActivity implements View.OnClickListener {

    ActivityBaseuseBinding activityBaseuseBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseuse);
        activityBaseuseBinding = DataBindingUtil.setContentView(this,R.layout.activity_baseuse);
        activityBaseuseBinding.setTextStr("数据");
        activityBaseuseBinding.setOnClickListener(this);
        activityBaseuseBinding.setOnClickUtil(new OnClickUtil());
    }

    @Override
    public void onClick(View v) {
        activityBaseuseBinding.txt.setText("点击设置的数据");
    }
}
