package com.su.controller;

import com.su.entity.UserInfo;
import com.su.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Li Shijie
 */
@RestController
@RequestMapping("/testMyBatis")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUser/{id}")
    public UserInfo getUser(@PathVariable int id){
        return userService.getUser(id);
    }

}
