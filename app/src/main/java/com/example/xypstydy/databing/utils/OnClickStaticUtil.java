package com.example.xypstydy.databing.utils;

import android.view.View;
import android.widget.Toast;

/**
 * create by Administrator
 * on: 2021/4/1
 * Time: 15:30
 */
public class OnClickStaticUtil {

     public static void onClickWithMe(View view){
         Toast.makeText(view.getContext(),"直接调用静态方法",Toast.LENGTH_LONG).show();
     }
}
