package com.huadou.cn.utils;

import java.util.UUID;

/**
 * Created by jinliang on 16/7/10.
 */
public class UUIdUtils {

    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-","");
    }
}
