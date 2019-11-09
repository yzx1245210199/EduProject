package com.yzx.edu.service;

import com.yzx.edu.model.User;
import com.yzx.edu.service.base.IBaseService;

public interface IUserService extends IBaseService<User>{

    //特有的方法

    public User login(String username, String password);
}
