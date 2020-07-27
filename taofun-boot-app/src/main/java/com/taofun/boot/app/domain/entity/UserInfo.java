package com.taofun.boot.app.domain.entity;


import lombok.Data;

/**
 * @ClassName : UserInfo  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-07-26 17:25  //时间
 */
@Data
public class UserInfo {
    private Integer userId;
    private String  userName;
    private String  password;
}
