package com.example.view_model.util;

import android.content.Context;
import android.content.Intent;

/**
 * create by Administrator
 * on: 2021/4/2
 * Time: 14:16
 */
public class ActivityUtils {

    public static void  jump(Context context,Class<?> clazz){
        Intent intent = new Intent(context,clazz);
        context.startActivity(intent);
    }
}
