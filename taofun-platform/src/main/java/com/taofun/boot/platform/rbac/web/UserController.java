package com.taofun.boot.platform.rbac.web;

import cn.hutool.json.JSONUtil;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import com.taofun.boot.platform.rbac.dao.UserMapper;
import com.taofun.boot.platform.rbac.domain.entity.UserInfo;
import com.taofun.boot.platform.rbac.domain.model.Results;
import com.taofun.boot.platform.rbac.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * @ClassName : UserController  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-07-26 16:02  //时间
 */

@Api(value = "用户管理接口", tags = "用户管理接口")
@ApiSort(value = 2)// 大分类顺序
@RestController
public class UserController {
    @Autowired
    private IUserService    userService;

    @Autowired
    private UserMapper  userMapper;

    @ApiOperation(value = "获取用户数据", produces = "application/json")
    @GetMapping("/user")
    public Results<UserInfo> hello(){
        UserInfo    userInfo = userMapper.selectById(1L);
        Results<UserInfo>   results  = new Results<>(1,"查询用户信息",userInfo);
        return results;
    }
}
