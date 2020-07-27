package com.taofun.boot.platform.rbac.service.impl;

import com.taofun.boot.platform.rbac.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @ClassName : UserServiceImpl  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-07-26 17:04  //时间
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private JdbcTemplate    jdbcTemplate;
    public Map<String, Object> userInfo() {
        return  jdbcTemplate.queryForMap("select  *  from sys_user where user_id =1");
    }
}
