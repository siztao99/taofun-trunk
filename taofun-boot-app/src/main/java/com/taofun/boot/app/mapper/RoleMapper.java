package com.taofun.boot.app.mapper;

import com.taofun.boot.app.domain.RoleDto;
import com.taofun.boot.app.domain.UserDto;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * RoleMapper
 * @author
 * @date 2018/8/31 14:42
 */
public interface RoleMapper extends Mapper<RoleDto> {
    /**
     * 根据User查询Role
     * @param userDto
     * @return java.util.List<com.wang.model.RoleDto>
     * @author
     * @date 2018/8/31 11:30
     */
    List<RoleDto> findRoleByUser(UserDto userDto);
}
