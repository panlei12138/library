package com.panlei.demo.service;

import com.panlei.demo.bean.User;
import com.panlei.demo.bean.response.BaseRes;

public interface UserService {
    BaseRes register(User user);

    BaseRes login(User user);
}
