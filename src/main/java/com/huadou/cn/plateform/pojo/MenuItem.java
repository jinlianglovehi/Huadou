package com.huadou.cn.plateform.pojo;

import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by jinliang on 16/7/8.
 *
 *  用户界面菜单
 *  菜单是tree 层级结构.
 */
public class MenuItem {

    /**
     * 菜单常量定义
     */
    // 主菜单
    public static  final int  MAIN_MENU = 1 ;
    // 子菜单
    public static  final int  SUB_MENU =2 ;


    private String id ;

    private String menuName ;// 菜单名称

    private int parentId ;// 父菜单id
    private int  userId ; //某一个用户的菜单名称;

    private List<MenuItem> childMenus ; //子菜单

    /**
     * 创建时间
     */
    private Date createData ;
    /**
     * 更新时间
     */
    private Date updateData ;

    private String imageclass ;// 菜单前面携带的图标
    private int  menuType ; // 区分主菜单还是子菜单
    private String url ;// 连接左侧菜单


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreateData() {
        return createData;
    }

    public void setCreateData(Date createData) {
        this.createData = createData;
    }

    public Date getUpdateData() {
        return updateData;
    }

    public void setUpdateData(Date updateData) {
        this.updateData = updateData;
    }

    public List<MenuItem> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<MenuItem> childMenus) {
        this.childMenus = childMenus;
    }

    public int getMenuType() {
        return menuType;
    }

    public void setMenuType(int menuType) {
        this.menuType = menuType;
    }

    public String getImageclass() {
        return imageclass;
    }

    public void setImageclass(String imageclass) {
        this.imageclass = imageclass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
