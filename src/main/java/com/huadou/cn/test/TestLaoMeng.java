package com.huadou.cn.test;

import java.net.URLEncoder;

/**
 * Created by jinliang on 16/6/25.
 */
public class TestLaoMeng {

    public static void main(String[] args) throws Exception {

      String result = DES.encryptDES("357816266896932","87654321");

        String utfStr = URLEncoder.encode(result,"UTF-8");
        System.out.println("" + result);
  System.out.println("" + utfStr);

    }
}
