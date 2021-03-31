package com.example.xypstydy.databing.utils;

import android.content.Context;
import android.content.Intent;

/**
 * create by Administrator
 * on: 2021/3/31
 * Time: 13:50
 */
public class ActivityUtils {

    public static void transfer(Context context, Class<?> clazz){
        Intent  intent = new Intent(context,clazz);
        context.startActivity(intent);

    }
}
