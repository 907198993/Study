package com.example.xypstydy.databing.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.xypstydy.R;
import com.example.xypstydy.databinding.ActivityIncludeBinding;
import com.example.xypstydy.databing.bean.User;

/**
 * create by Administrator
 * on: 2021/4/1
 * Time: 13:25
 */
public class IncludeActivity  extends AppCompatActivity {

    ActivityIncludeBinding activityIncludeBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_include);
        activityIncludeBinding = DataBindingUtil.setContentView(this, R.layout.activity_include);
        User user = new User("我爱学习", 18);
        activityIncludeBinding.setUser(user);

    }
}
