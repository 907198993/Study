package com.example.view_model.viewmodel;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.view_model.R;
import com.example.view_model.databinding.ActivityViewmodelBinding;

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

    }
}
