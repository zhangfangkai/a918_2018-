package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by ZFK on 2018/4/21.
 */
@Controller
public class TestController {
    //RequestMapping表示使用哪个URL来对应
    @RequestMapping({"/test","/"})
    public String test(String username, Map<String, Object> context){
        context.put("username",username);
        return "test";//test对应WEB-INF/jsp
    }

    //@RequestMapping注解括号里面的表示访问的URL
    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView modelView = new ModelAndView();
        //类似于 request.setAttribute()
        modelView.addObject("name","张三");
        //配置返回的视图名，由于我们在springmvc.xml中配置了前缀和后缀，这里直接写视图名就好
        modelView.setViewName("hello");
        //modelView.setViewName("/WEB-INF/view/index.jsp");
        System.out.print("11111111");
        return modelView;
    }

    @RequestMapping("/jump")
    public ModelAndView jump() {
        ModelAndView mav = new ModelAndView("redirect:/test");
        return mav;
    }
}
