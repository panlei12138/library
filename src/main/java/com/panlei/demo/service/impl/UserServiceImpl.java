package com.panlei.demo.service.impl;

import com.panlei.demo.bean.User;
import com.panlei.demo.bean.response.BaseRes;
import com.panlei.demo.dao.UserMapper;
import com.panlei.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public BaseRes register(User user) {
        Integer count = userMapper.selectCountByUserName(user.getUser_name());
        if(null == count || 0 == count) {
            userMapper.register(user);
            return new BaseRes();
        } else {
            return new BaseRes(0, "用户名已存在");
        }
    }

    @Override
    public BaseRes login(User req) {
        User user = userMapper.selectUserByUserName(req);
        if(null == user) {
            return new BaseRes(0, "用户不存在");
        }
        else if(!req.getPwd().equals(user.getPwd())) {
            return new BaseRes(0, "用户/密码错误");
        } else {
            return new BaseRes(user);
        }
    }
}
