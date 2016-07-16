package com.huadou.cn.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinliang on 16/7/15.
 */
public class BLEDataItem {
    private String name ;
    private int age ;
    private Map<String,Object> map ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
