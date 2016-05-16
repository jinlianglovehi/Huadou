package com.huadou.cn.plateform.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.huadou.cn.plateform.pojo.User;
import com.huadou.cn.plateform.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *   信息模块
 */

@Controller
@RequestMapping("/user")
public class UserController {
	private static final String TAG = "UserController";
	private static final boolean DEBUG = true;

	@Resource
	private IUserService userService;
	@RequestMapping("/showUser/{id}")
	public String addData(HttpServletRequest request,Model model,@PathVariable( "id" ) int id){

		if(DEBUG){
			System.out.println(TAG + " toIndex "  + id );
		}
//		int userId = Integer.parseInt(request.getParameter("id"));
//		User user = this.userService.getUserById(userId);
//		model.addAttribute("user", user);
		return "/plateform/user";
	}
}
