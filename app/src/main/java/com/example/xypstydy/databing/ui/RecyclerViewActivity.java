package com.example.xypstydy.databing.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.xypstydy.R;
import com.example.xypstydy.databinding.ActivityRecyclerviewBinding;
import com.example.xypstydy.databing.adapter.SimpleAdapter;

import java.util.ArrayList;

/**
 * create by Administrator
 * on: 2021/4/2
 * Time: 9:57
 */
public class RecyclerViewActivity extends AppCompatActivity {

    ActivityRecyclerviewBinding activityRecyclerviewBinding;
    private ArrayList<String> arrayList = new ArrayList<>();
    SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        activityRecyclerviewBinding  = DataBindingUtil.setContentView(this,R.layout.activity_recyclerview);
        for (int i = 0; i < 10; i++) {
            arrayList.add("");
        }
        activityRecyclerviewBinding.recy.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        simpleAdapter = new SimpleAdapter();
        simpleAdapter.setDataList(arrayList);
        activityRecyclerviewBinding.recy.setAdapter(simpleAdapter);
    }
}
