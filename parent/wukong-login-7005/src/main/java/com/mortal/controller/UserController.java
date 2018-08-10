package com.mortal.controller;

import com.mortal.pojo.Username;
import com.mortal.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/user/login")
    public String toLogin(String name, String password, Map<String, Object> map, HttpSession session) {
        if (!StringUtils.isEmpty(name) && !StringUtils.isEmpty(password)) {
            Username username = userService.findName(name);
            if (username != null && password.equals(username.getPassword())) {
                session.setAttribute("name",name);
                return "redirect:/main.start";
            } else {
                map.put("msg", "账号密码有误");
                return "login";
            }
        } else {
            map.put("msg", "账号密码为空");
            return "login";
        }
    }


}
