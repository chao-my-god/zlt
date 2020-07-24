package com.zlt.service.Impl;

import com.zlt.mapper.UserMapper;
import com.zlt.pojo.User;
import com.zlt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required=false)
    UserMapper usermapper;

    @Override
    public List<User> queryUsers() {
        return usermapper.findAll();
    }
    @Override
    public User findById(int id) {
        return usermapper.findById(id);
    }


}
