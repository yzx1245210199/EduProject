package com.yzx.edu.web.controller;

import com.yzx.edu.model.User;
import com.yzx.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/salary")
public class SalaryController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/find")
    public String find(Integer id){
        User user = userService.findById(id);
        System.out.println(user);
        return null;
    }
    @RequestMapping("/manage")
    public String manager(){
        return "salary/manage";
    }

    @RequestMapping("/info")
    public String info(){
        return "salary/info";
    }
    @RequestMapping("/edit")
    public String edit(){
        return "salary/edit";
    }
    @RequestMapping("/update")
    public String update(){
        return "salary/update";
    }
}
