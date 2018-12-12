package com.panlei.demo.dao;

import com.panlei.demo.bean.User;

public interface UserMapper {
    Integer selectCountByUserName(String user_name);

    void register(User user);

    User selectUserByUserName(User user);
}
