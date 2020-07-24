package com.zlt.mapper;

import com.zlt.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> findAll();
    User findById(int id);
    int deleteById(int id);
    int insert(User user);
    int update(User user);
}
