package com.huadou.cn.plateform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * http://localhost:8080/CONSOLE/BindCardServlet?card_id=001085826700&security_code=pkoRi2xoOluJnYchED1/cA==&bind_card_id=001238357900
 * Created by jinliang on 16/6/26.
 */

@Controller
@RequestMapping("/console")
public class MengController {

    @ResponseBody()
    @RequestMapping(value = "/BindCardServlet", method = RequestMethod.GET)
    public String getMengData(@RequestParam("card_id") String card_id, @RequestParam("security_code")String security_code,
                                        @RequestParam("bind_card_id")String bind_card_id,
                                        ModelMap model){

        System.out.println("MengController data: "+card_id +",security_code:"+security_code +",bind_card_id:"+ bind_card_id);

        return  "huhu";
    }

}
