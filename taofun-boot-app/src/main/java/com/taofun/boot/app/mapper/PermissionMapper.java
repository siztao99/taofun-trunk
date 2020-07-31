package com.taofun.boot.app.mapper;

import com.taofun.boot.app.domain.PermissionDto;
import com.taofun.boot.app.domain.RoleDto;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * PermissionMapper
 * @author
 * @date 2020/7/31 21:45:42
 */
public interface PermissionMapper extends Mapper<PermissionDto> {
    /**
     * 根据Role查询Permission
     * @param roleDto
     * @return java.util.List<com.wang.model.PermissionDto>
     * @author
     * @date 2020/7/31 11:30
     */
    List<PermissionDto> findPermissionByRole(RoleDto roleDto);
}
