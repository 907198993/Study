package com.example.xypstydy.databing.adapter.viewHolder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/**
 * create by Administrator
 * on: 2021/4/2
 * Time: 10:40
 */
public class NbViewHolder  extends RecyclerView.ViewHolder{
    public ViewDataBinding binding;

    public NbViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding  = binding;
    }
}
