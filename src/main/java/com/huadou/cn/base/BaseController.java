package com.huadou.cn.base;

/**
 * Created by jinliang on 16/5/15.
 */
public interface BaseController {

    /**
     *  controller 接口的定义
     * @return
     */
    String addData() ;
    String deleteDataById() ;
    String updateDataById() ;

    //罗列多有的数据
    String selectListData() ;







}
