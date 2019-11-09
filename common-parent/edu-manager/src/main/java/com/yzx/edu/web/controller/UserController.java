package com.yzx.edu.web.controller;

import com.yzx.edu.model.User;
import com.yzx.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/login")
    public String login(){
        System.out.println("login....");
        return "Default";
    }

    @RequestMapping("/find")
    public String find(Integer id){
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }
    @RequestMapping("/manage")
    public String manager(){
        return "User/Manage";
    }

    @RequestMapping("/info")
    public String info(){
        return "User/Info";
    }
    @RequestMapping("/edit")
    public String edit(){
        return "User/Edit";
    }
    @RequestMapping("/update")
    public String update(){
        return "User/Update";
    }
}
