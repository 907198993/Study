package com.example.xypstydy.databing.bean;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.xypstydy.BR;

/**
 * create by Administrator
 * on: 2021/3/31
 * Time: 13:17
 */
public class Dog extends BaseObservable {


    /**
     * @Bindable  标注用来表示哪个字段需要单向绑定
     * public 修饰的可以直接用@Bindable绑定
     * private 修饰的需要在get 方法上用@Bindable标注
     *
     *  notifychange刷新素有字段
     *  notifyPropertyChanged 刷新单个字段
     *  注意这里说的刷新全是被@Bindable绑定的
     *
     */

    @Bindable
    public String name;

    private  String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setDataOnlyName(String name, String color){
        this.name =name;
        this.color = color;
        notifyPropertyChanged(BR.name);
    }

    public void setDataAll(String name ,String color){
        this.name = name;
        this.color = color;
        notifyChange();
    }

    @Bindable
    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
