package com.example.xypstydy.databing.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xypstydy.R;
import com.example.xypstydy.databinding.ItemTestBinding;
import com.example.xypstydy.databing.adapter.viewHolder.NbViewHolder;
import com.lihang.nbadapter.BaseAdapter;

/**
 * create by Administrator
 * on: 2021/4/2
 * Time: 10:17
 */
public class SimpleAdapter extends BaseAdapter<String> {
    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup viewGroup, int viewType) {

     ItemTestBinding binding =  DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.item_test, viewGroup, false);
        return new NbViewHolder(binding);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
         NbViewHolder nbViewHolder = (NbViewHolder) viewHolder;
         ItemTestBinding itemTestBinding = (ItemTestBinding) nbViewHolder.binding;
         itemTestBinding.txt.setText("就这么使用");
    }
}
