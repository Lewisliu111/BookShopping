package com.liu.controller;


import com.liu.entity.Users;
import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/Account")
public class AccountController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/Login", method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView mv  = new ModelAndView("account/login");
        return mv;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> login1(
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password
    ){
        Map<String, String> ret = new HashMap<String, String>();
        System.out.println("username: " + username);
        System.out.println("password: " +password);

        Users users = userService.findByUsername(username);

        if (users == null) {
            ret.put("msg", "不存在该用户");
        }
        else if (users.getPassword().equals(password)) {
            ret.put("msg", "登录成功");
        }

        else {
            ret.put("msg", "密码错误");
        }


        return ret;

    }






}
