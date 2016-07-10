package com.huadou.cn.menu;

import com.huadou.cn.base.BaseTest;
import com.huadou.cn.plateform.dao.UserInfoMapper;
import com.huadou.cn.plateform.dao.menu.MenuItemMapper;
import com.huadou.cn.plateform.pojo.MenuItem;
import com.huadou.cn.plateform.pojo.User;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jinliang on 16/7/10.
 */
public class TestMenuItem  extends BaseTest{


    @Resource
    private UserInfoMapper userInfoMapper ;

    @Resource
    private MenuItemMapper  menuItemMapper ;


    @Override
    public void testBefore() {

    }

    @Override
    public void test() {
        List<MenuItem> menuItems =  menuItemMapper.getMenuItemsByUserId("2");

        System.out.println("count:"+ menuItems.size());
        System.out.println(""+ menuItems.get(0).getMenuName());

        System.out.println("childSize:"+ menuItems.get(0).getChildMenus().size());
        System.out.println("childMenu:"+ menuItems.get(0).getChildMenus().get(0).getMenuName());
    }

    @Test
    public void testUUId(){



    }
    @Override
    public void testAfter() {

    }
}
