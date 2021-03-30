package com.example.xypstydy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.xypstydy.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity  {

     ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding =  DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setTextStr("设置的数据");
        activityMainBinding.setHandler(MainActivity.this);
//
//        activityMainBinding.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                activityMainBinding.txt.setText("点击设置的数据");
//            }
//        });
    }

    public void onclickWithMe(){
        Toast.makeText(this,"提示",Toast.LENGTH_LONG).show();
    }
}
