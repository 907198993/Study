package com.example.view_model;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.view_model.databinding.ActivityMainBinding;
import com.example.view_model.util.ActivityUtils;
import com.example.view_model.viewmodel.ViewModelActivity;

/**
 *  1.viewmodel只会在activity存活，且只会创建一次，当销毁时，会主动调用onClered.
 *
 *  2.在activity存活时，只创建一次，name在此activity下的所有fragment都可以共享一个viewmodel
 *
 *  3.由于viewmodel生命周期可能长与activity生命周期，所以为了避免内存泄漏Google禁止在viewmodel
 *  中持有context或activity的view的引用，如果非得使用context,可以继承androidviewmodel类
 *  中获取applicationContext
 *
 *  4.
 */
public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_viewmodel:
                ActivityUtils.jump(this, ViewModelActivity.class);
                break;
        }
    }
}
