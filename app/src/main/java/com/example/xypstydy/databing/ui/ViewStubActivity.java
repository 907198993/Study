package com.example.xypstydy.databing.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.xypstydy.R;
import com.example.xypstydy.databinding.ActivityViewstubBinding;
import com.example.xypstydy.databing.bean.User;

/**
 * create by Administrator
 * on: 2021/4/1
 * Time: 13:39
 * 简单介绍下viewStub：被viewStub包裹的。即使页面显示的时候，被包裹的布局也不会加载，
 * 除非调用inflate。这样算是对布局卡顿的优化了。include则算是代码里的布局优化。
 */
public class ViewStubActivity extends AppCompatActivity {

    ActivityViewstubBinding activityViewstubBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewstub);
        activityViewstubBinding = DataBindingUtil.setContentView(this,R.layout.activity_viewstub);
        User user = new User("xxx",19);
        activityViewstubBinding.viewStub.getViewStub().inflate();
        activityViewstubBinding.setUser(user);
    }
}
