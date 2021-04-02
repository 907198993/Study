package com.example.xypstydy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.xypstydy.databinding.ActivityMainBinding;
import com.example.xypstydy.databing.ui.AlisActivity;
import com.example.xypstydy.databing.ui.BaseObservableActivity;
import com.example.xypstydy.databing.ui.BaseUseActivity;
import com.example.xypstydy.databing.ui.BindingAdapterActivity;
import com.example.xypstydy.databing.ui.DatabingActivity;
import com.example.xypstydy.databing.ui.IncludeActivity;
import com.example.xypstydy.databing.ui.ObservableCollectActivity;
import com.example.xypstydy.databing.ui.ObservableFieldAvtivity;
import com.example.xypstydy.databing.ui.RecyclerViewActivity;
import com.example.xypstydy.databing.ui.ViewStubActivity;
import com.example.xypstydy.databing.utils.ActivityUtils;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener {

     ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding =  DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_base:
                ActivityUtils.transfer(this, BaseUseActivity.class);
                break;
            case R.id.btn_alis:
                ActivityUtils.transfer(this, AlisActivity.class);
                break;
            case R.id.btn_recyclerView:
                ActivityUtils.transfer(this, RecyclerViewActivity.class);
                break;
            case R.id.btn_baseobservable:
                ActivityUtils.transfer(this, BaseObservableActivity.class);
                break;
            case R.id.btn_observableField:
                ActivityUtils.transfer(this, ObservableFieldAvtivity.class);
                break;
            case R.id.btn_observableCollection:
                ActivityUtils.transfer(this, ObservableCollectActivity.class);
                break;
            case R.id.btn_data:
                ActivityUtils.transfer(this, DatabingActivity.class);
                break;
            case R.id.btn_include:
                ActivityUtils.transfer(this, IncludeActivity.class);
                break;
            case R.id.btn_viewstub:
                ActivityUtils.transfer(this, ViewStubActivity.class);
                break;
            case R.id.btn_bind_adapter:
                ActivityUtils.transfer(this, BindingAdapterActivity.class);
                break;
        }
    }
}
