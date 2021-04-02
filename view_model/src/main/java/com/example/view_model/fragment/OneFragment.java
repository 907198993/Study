package com.example.view_model.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.view_model.R;
import com.example.view_model.databinding.FragmentOneBinding;
import com.example.view_model.viewmodel.MyViewModel;

/**
 * create by Administrator
 * on: 2021/4/2
 * Time: 15:26
 */
public class OneFragment extends Fragment {

    private int type;
    FragmentOneBinding fragmentOneBinding;

    public  static OneFragment newInstance(int type){
        OneFragment oneFragment  = new OneFragment();
        oneFragment.type  = type;
         return oneFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        fragmentOneBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_one,container,false);
        if(type ==0){
            fragmentOneBinding.relative.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            fragmentOneBinding.btnOne.setText("Fragment - One：打印当前ViewHolder");
        }else {
            fragmentOneBinding.relative.setBackgroundColor(getResources().getColor(R.color.color_2));
            fragmentOneBinding.btnOne.setText("Fragment - Two：打印当前ViewHolder");
        }

        fragmentOneBinding.btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(getActivity(),ViewModelProviders.of(getActivity()).get(MyViewModel.class).hashCode()+"",Toast.LENGTH_LONG).show();
            }
        });

        return fragmentOneBinding.getRoot();
    }
}
