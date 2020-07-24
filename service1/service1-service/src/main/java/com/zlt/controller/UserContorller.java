package com.zlt.controller;

import com.zlt.pojo.User;
import com.zlt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserContorller {
    @Autowired(required=false)
    UserService userservice;

    @RequestMapping(value="/queryUsers",method={RequestMethod.GET})
    @ResponseBody
    public List<User> queryUsers(){
        return userservice.queryUsers();
    }

    @RequestMapping(value = "/findById/{id}", method={RequestMethod.GET})
    @ResponseBody
    public User queryById(@PathVariable("id") int id){
        return userservice.findById(id);
    }


}
