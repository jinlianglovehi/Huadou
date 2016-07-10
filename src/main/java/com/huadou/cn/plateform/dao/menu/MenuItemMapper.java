package com.huadou.cn.plateform.dao.menu;

import com.huadou.cn.plateform.pojo.MenuItem;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.awt.*;
import java.util.List;

/**
 * Created by jinliang on 16/7/8.
 *
 *  用户菜单dao
 *
 */
public interface MenuItemMapper {

    /**
     * 根据用户的id 获取用户的所有的菜单
     * 包含层级关系
     * @param userId
     * @return
     */
    @Select("select * from menu_item  where userId =#{userId}")
    @Results({
           @Result(property = "childMenus",column = "id",
             many = @Many(select = "com.huadou.cn.plateform.dao.menu.MenuItemMapper.getMenuItemsByParentId")
           )
    })
    List<MenuItem> getMenuItemsByUserId(String userId);


    /**
     * 根据父节点获取所有的子菜单
     * @param parentId
     * @return
     */
    @Select("select * from menu_item where parentId = #{parentId}")
    List<MenuItem> getMenuItemsByParentId(String parentId);
}
