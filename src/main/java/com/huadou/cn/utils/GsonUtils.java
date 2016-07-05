package com.huadou.cn.utils;

import com.google.gson.Gson;

/**
 * Created by jinliang on 16/6/30.
 *
 *
 *  gson 处理工具类
 *
 */
public class GsonUtils {
    public static  Gson instance ;
    public static  Gson getInstance(){
        if(instance==null){
            instance = new Gson();
        }
        return instance;
    }
}
