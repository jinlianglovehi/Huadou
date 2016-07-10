package com.huadou.cn.plateform.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.huadou.cn.plateform.dao.UserInfoMapper;
import com.huadou.cn.plateform.pojo.RequestBean;
import com.huadou.cn.plateform.pojo.User;
import com.huadou.cn.plateform.service.IUserService;
import com.huadou.cn.utils.GsonUtils;
import com.huadou.cn.utils.Utils;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 *   用户信息管理Controller
 */

@Controller
@RequestMapping("/user")
public class UserController {
	private static final String TAG = "UserController";
	private static final boolean DEBUG = true;

	@Resource
	private IUserService userService;
	@Resource
	private UserInfoMapper userInfoMapper;
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


	/*
	*
	* (@Query("item") String item,@Query("card_id") String card,@Query("security_code") String code,@Query("record") String record,@Query("oemr_items") String oemr_items);
	*
	* */

	//  http://192.168.1.21:8080/user/getData.do?item=0&card_id=1&security_code=2&bind_card_id=3&record=4&oemr_items=5

//	@RequestMapping(value = "/getData", method = RequestMethod.POST)
//	public String setupForm(
//							@RequestParam("item") String item ,
//			                @RequestParam("card_id") String card_id,
//							@RequestParam("security_code")String security_code,
//							@RequestParam("record") String record ,
//							@RequestParam("oemr_items") String oemr_items ,
//						    ModelMap model) {
//
//		System.out.println("UserController item:"+item+ "cardId:"+card_id +",security_code:" +security_code+",record:"+record +",oemr_items:"+oemr_items);
//
//		return  null;
//	}

	/**
	 * 返回json 实例
	 * @param requestBean
	 * @param result
	 * @param model
     * @return
     */
	@ResponseBody
	@RequestMapping(value = "/getData", method = RequestMethod.POST)
	public String setupForm(@Valid @ModelAttribute("requestBean")
			 RequestBean requestBean, BindingResult result, ModelMap model
			) {



		System.out.println("UserController item:"+requestBean.getItem()+ ",cardId:"+requestBean.getCard_id() +",security_code:" +requestBean.getSecurity_code()+",record:"+requestBean.getRecord() +",oemr_items:"+requestBean.getOemr_items());

		return  "huhu";
	}


	@ResponseBody
	@RequestMapping(value = "getUserInfo",method = RequestMethod.GET)
	public String getUserInfo(){
	    List<User> list =	userInfoMapper.getAllUser();
		String result = GsonUtils.getInstance().toJson(list);
		return  result ;

	}

	// ##################### 管理用户界面Controller ##########################

	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String loginAction(@ModelAttribute("user") User user ){

		if(Utils.isDebug){
		    System.out.println("loginAction-"+ user.getUsername() + ",password:"+ user.getPassword());
		}
		return "redirect:/menu/getmenus/2";

	}



}
