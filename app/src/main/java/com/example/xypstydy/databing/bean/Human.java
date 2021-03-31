package com.example.xypstydy.databing.bean;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

/**
 * create by Administrator
 * on: 2021/3/31
 * Time: 15:01
 */
public class Human {

    //其实写上了下面一句，就是BaseObservable，set，get, @Bindable,刷新都封装了。直接看构造方法
   public final ObservableField<String> humanName = new ObservableField<>();

    //其中也封装了基本数据类型:ObservableInt等
   public final ObservableInt age = new ObservableInt();

    public Human(String name,int age) {
        this.humanName.set(name);
        this.age.set(age);
    }
}
