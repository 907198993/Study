package com.example.xypstydy.databing.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.xypstydy.R;
import com.example.xypstydy.databinding.ActivityBindAdapterBinding;

/**
 * create by Administrator
 * on: 2021/4/1
 * Time: 14:04
 */
public class BindingAdapterActivity  extends AppCompatActivity {

    ActivityBindAdapterBinding activityBindAdapterBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bind_adapter);
        activityBindAdapterBinding = DataBindingUtil.setContentView(this,R.layout.activity_bind_adapter);
        activityBindAdapterBinding.setImageUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1569760922081&di=77ffc0adbcfa628168b14665604e6efe&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2Fb215dd271e3367eeddc126d52cd1e5a5afe6e98112450-VIqcMR_fw658");
        activityBindAdapterBinding.setTestStr("xc");

    }
}
