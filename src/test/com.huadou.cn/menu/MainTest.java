package com.huadou.cn.menu;

import com.google.gson.Gson;
import com.huadou.cn.entity.BLEDataItem;
import com.huadou.cn.entity.BLEDataItemDemo;
import com.huadou.cn.utils.UUIdUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinliang on 16/7/10.
 */
public class MainTest {
    public static void main(String[] args) {

//        System.out.println("uuid:"+ UUIdUtils.getUUID());


        BLEDataItem dataItem = new BLEDataItem() ;
        dataItem.setAge(20);
        dataItem.setName("huhu");

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("itemString","1");
        map.put("itemInteger",1);
        map.put("itemBoolean",true);
        dataItem.setMap(map);

        Gson gson = new Gson();
        String context  =gson.toJson(dataItem);
        System.out.println("__content:"+ context);

        System.out.println("__mapJson:"+ gson.toJson(map));
        System.out.println("-----------------------");

        BLEDataItem transBLEDataItem = gson.fromJson(context,BLEDataItem.class);
        System.out.println("__map:"+ transBLEDataItem.getMap());

//        String contextDemo = "" + transBLEDataItem.getMap() +"";
        BLEDataItemDemo itemDemo = gson.fromJson(context,BLEDataItemDemo.class);
        System.out.println("__str:"+ itemDemo.getMap());







    }
}
