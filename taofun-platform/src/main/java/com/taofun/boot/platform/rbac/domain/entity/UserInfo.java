package com.taofun.boot.platform.rbac.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName : UserInfo  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-07-26 17:25  //时间
 */
@Data
@TableName("sys_user")
public class UserInfo {
    @TableField("user_id")
    @TableId
    private Integer userId;
    @TableField("user_name")
    private String  userName;
    @TableField("password")
    private String  password;
}
