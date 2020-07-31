package com.taofun.boot.app.exception;

/**
 * 自定义401无权限异常(UnauthorizedException)
 * @author
 * @date 2020/7/30 13:59
 */
public class CustomUnauthorizedException extends RuntimeException {

    public CustomUnauthorizedException(String msg){
        super(msg);
    }

    public CustomUnauthorizedException() {
        super();
    }
}
