package com.example.view_model.viewmodel;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.example.view_model.R;
import com.example.view_model.databinding.ActivityViewmodelBinding;
import com.example.view_model.fragment.OneFragment;
import com.example.view_model.util.LogUtils;

/**
 * create by Administrator
 * on: 2021/4/2
 * Time: 14:16
 */
public class ViewModelActivity extends AppCompatActivity {

    ActivityViewmodelBinding activityViewmodelBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewmodel);
        activityViewmodelBinding = DataBindingUtil.setContentView(this,R.layout.activity_viewmodel);
        addFragment();
        MyViewModel myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        LogUtils.i("MyViewModel的相关", "onCreate ==> " + myViewModel.hashCode());
    }

    private void addFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        OneFragment oneFragment = OneFragment.newInstance(0);
        OneFragment oneFragment1 = OneFragment.newInstance(1);
        ft.add(R.id.framelayout,oneFragment);
        ft.add(R.id.framelayout_other,oneFragment1);
        ft.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        MyViewModel myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        LogUtils.i("MyViewModel的相关", "onStart ==> " + myViewModel.hashCode());
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyViewModel myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        LogUtils.i("MyViewModel的相关", "onResume ==> " + myViewModel.hashCode());
    }

    @Override
    protected void onPause() {
        super.onPause();
        MyViewModel myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        LogUtils.i("MyViewModel的相关", "onPause ==> " + myViewModel.hashCode());
    }

    @Override
    protected void onStop() {
        super.onStop();
        MyViewModel myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        LogUtils.i("MyViewModel的相关", "onStop ==> " + myViewModel.hashCode());
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyViewModel myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        LogUtils.i("MyViewModel的相关", "onDestroy ==> " + myViewModel.hashCode());
    }
}
