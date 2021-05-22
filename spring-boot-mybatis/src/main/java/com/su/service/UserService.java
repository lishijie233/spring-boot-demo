package com.su.service;


import com.su.entity.UserInfo;
import com.su.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Li Shijie
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UserInfo getUser(int id){
        return userMapper.getUser(id);
    }
}
