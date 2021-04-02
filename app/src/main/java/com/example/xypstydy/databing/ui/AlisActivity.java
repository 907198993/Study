package com.example.xypstydy.databing.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.xypstydy.R;
import com.example.xypstydy.databinding.ActivityAlisBinding;
import com.example.xypstydy.databing.User;

/**
 * create by Administrator
 * on: 2021/4/1
 * Time: 15:40
 */
public class AlisActivity extends AppCompatActivity {

    private ActivityAlisBinding activityAlisBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alis);
        activityAlisBinding  = DataBindingUtil.setContentView(this,R.layout.activity_alis);
        User user = new User("USER",19);
        com.example.xypstydy.databing.bean.User user1 = new com.example.xypstydy.databing.bean.User("别名user",20);
        activityAlisBinding.setUser(user1);
        activityAlisBinding.setUser2Second(user);
    }
}
