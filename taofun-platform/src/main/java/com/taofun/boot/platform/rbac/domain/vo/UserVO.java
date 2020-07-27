package com.taofun.boot.platform.rbac.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName : UserVO  //类名
 * @Description :   //描述
 * @Author : HTB  //作者
 * @Date: 2020-07-26 17:28  //时间
 */

@ApiModel("用户对象")
public class UserVO {

    @ApiModelProperty(required = true,notes = "用户名",example = "blues")
    private String name;

    @ApiModelProperty(required = true,notes = "用户返回消息",example = "hello world")
    private String words;


    public UserVO(String name, String words) {
        this.name = name;
        this.words = words;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}
