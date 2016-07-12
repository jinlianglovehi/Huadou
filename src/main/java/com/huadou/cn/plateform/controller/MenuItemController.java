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
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView getMenuItems(@PathVariable( "userId" ) String userId,ModelMap model){
        if(Utils.isDebug){
            System.out.println("[16/7/10 下午4:02]getMenuItems,userId:"+userId);
        }
       List<MenuItem>  menuItems = menuItemMapper.getMainsMenuItemsByUserId(userId);
       if(Utils.isDebug){
           System.out.println("getMenuItems:"+ menuItems.size());
       }
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("menuitems",menuItems);
        return  modelAndView ;
    }

    /**
     * 根据 菜单定义的url 跳转到右侧内容
     */

    @RequestMapping(value = "/frame/{name}",method = RequestMethod.GET)
    public ModelAndView getMenuFrameByName(@PathVariable( "name" ) String name){

        if(Utils.isDebug){
            System.out.println("[16/7/10 下午6:24]getMenuFrameByName,name:"+ name);
        }

        ///menu/frame/pager_home

        ModelAndView modelAndView = new ModelAndView("jsp/menu/frame/"+name);
        return modelAndView  ;
    }

    @RequestMapping(value = "/md/{id}",method = RequestMethod.GET)
    public ModelAndView getMdMenuEdit(@PathVariable("id") String id){

        if(Utils.isDebug){
            System.out.println("[16/7/12 下午11:22]getMdMenuEdit");
        }
        
        ModelAndView modelAndView = new ModelAndView("jsp/markmd/md_page_edit");
        return modelAndView;
    }


}
