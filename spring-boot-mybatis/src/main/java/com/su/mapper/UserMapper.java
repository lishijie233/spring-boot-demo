package com.su.mapper;

import com.su.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @author Li Shijie
 */
@Repository
public interface UserMapper {
    /**
     * 查用户
     * @param id
     * @return
     * */
    UserInfo getUser(int id);
}
