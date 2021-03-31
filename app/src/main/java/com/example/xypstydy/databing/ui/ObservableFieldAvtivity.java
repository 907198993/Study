package com.example.xypstydy.databing.ui;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.xypstydy.R;
import com.example.xypstydy.databinding.ActivityAbservableFieldBinding;
import com.example.xypstydy.databing.bean.Human;

/**
 * create by Administrator
 * on: 2021/3/31
 * Time: 15:05
 */
public class ObservableFieldAvtivity  extends AppCompatActivity implements View.OnClickListener {

    ActivityAbservableFieldBinding activityAbservableFieldBinding;
    Human human;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abservable_field);
        activityAbservableFieldBinding = DataBindingUtil.setContentView(this,R.layout.activity_abservable_field);
        activityAbservableFieldBinding.setOnClickListener(this);
        human = new Human("XIAO",18);
        activityAbservableFieldBinding.setHumen(human);
    }


    @Override
    public void onClick(View v) {
         switch (v.getId()){
             case R.id.btn_name:
                 human.humanName.set("yy");
                 break;

             case R.id.btn_age:
                 human.age.set(20);
                 break;
         }
    }
}
