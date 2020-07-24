package com.zlt.service;

import com.zlt.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> queryUsers();
    public User findById(int id);
}
