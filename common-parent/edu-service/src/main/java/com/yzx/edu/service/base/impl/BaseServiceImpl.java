package com.yzx.edu.service.base.impl;

import com.yzx.edu.mapper.UserMapper;
import com.yzx.edu.service.base.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements IBaseService<T>{

    //统一管理dao
    @Autowired
    protected UserMapper userMapper;
}
