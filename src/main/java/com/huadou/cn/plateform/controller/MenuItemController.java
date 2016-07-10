package com.huadou.cn.plateform.controller;

import com.huadou.cn.plateform.dao.menu.MenuItemMapper;
import com.huadou.cn.plateform.pojo.MenuItem;
import com.huadou.cn.plateform.pojo.User;
import com.huadou.cn.utils.GsonUtils;
import com.huadou.cn.utils.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jinliang on 16/7/10.
 */

@Controller
@RequestMapping("/menu")
public class MenuItemController {

    @Resource
    private MenuItemMapper menuItemMapper;

    @RequestMapping(value = "/getmenus/{userId}",method = RequestMethod.GET)
    public String getMenuItems(@PathVariable( "userId" ) String userId,ModelMap model){


        if(Utils.isDebug){
            System.out.println("[16/7/10 下午4:02]getMenuItems,userId:"+userId);
        }

       List<MenuItem>  menuItems = menuItemMapper.getMainsMenuItemsByUserId(userId);
       if(Utils.isDebug){
           System.out.println("getMenuItems:"+ menuItems.size());
       }
        model.put("menuitems",menuItems);
        return  "index" ;

    }


}
