package com.taofun.boot.app.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.taofun.boot.app.domain.entity.User;

import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 *
 * @author
 * @date 2020/7/30 10:34
 */
@Table(name = "user")
public class UserDto extends User {
    /**
     * 登录时间
     */
    @Transient
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date loginTime;

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}
