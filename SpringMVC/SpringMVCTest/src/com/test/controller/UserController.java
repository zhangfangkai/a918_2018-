package com.test.controller;

import com.test.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZFK on 2018/4/21.
 */
@Controller
@RequestMapping(value="/user")
public class UserController {
    private static List<User> userList;

   /* @Autowired
    private static User user;*/

    public UserController() {
        this.userList = new ArrayList<>();//初始化userlist
    }


    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String registerForm() {
        return "/user/registerForm";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@RequestParam("loginname") String loginname,
                           @RequestParam("username") String  username,
                           @RequestParam("password") String password) {
        User user = new User();
        user.setLoginame(loginname);
        user.setUsername(username);
        user.setPassword(password);
        //存储user信息
        userList.add(user);
        //跳转页面到登录页面
        return "/user/loginForm";
    }

    @RequestMapping(value = "login")
    public String login(@RequestParam("loginname") String loginname,
                        @RequestParam("password") String password,
                        Model model) {
        //到集合中查询用户是否存在
        for (User user : userList){
            if (user.getLoginame().equals(loginname)&& user.getPassword().equals(password)){
                model.addAttribute("user",user);
                return "/user/welcome";
            }
        }
        return "/user/loginForm";
    }
}
