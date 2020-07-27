package com.taofun.boot.app.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ApiOperation:
 *   value：接口用途（必选）
 *   notes：备注说明（可选）
 *   httpMethod：请求方式（可选）
 *   response：返回参数类型（可选）
 *   tags：接口分组名（可选）
 * @ApiImplicitParams:（可选,当描述多个@ApiImplicitParam时候使用）
 *   @ApiImplicitParam:（接口入参描述；本身可选，对应子字段也全部可选）
 *     name：参数属性名
 *     value：参数说明
 *     required：是否必传 true/false
 *     paramType：请求参数的获取方式
 *       header --> @RequestHeader
 *       query -->  @RequestParam
 *       path -->  @PathVariable
 *       body  -->  @RequestBody
 *       form  --> 很少使用
 *     dataType：参数类型
 *     defaultValue：默认值
 * @Api：作用于Conntroller类上
 *   value：字段说明
 *   description：描述
 *   tags：分组
 * @ApiIgnore: 作用于接口入参参数列表，表示swagger忽略该入参
 * @ApiModelProperty:作用于入参实体对象的属性上（本身可选，对应子字段也全部可选）
 *   value：字段描述
 *   name：属性名字
 *   dataType：属性类型
 *   required：是否必传
 *   example：参数样例
 *   hidden：隐藏
 * @ApiResponses:(接口返回结果；可选，当描述多个@ApiResponse时候使用)
 *   @ApiResponse：（可选）
 *     code：HTTP请求返回码。（必选）
 *     message：返回信息。（必选）
 *     response：返回类型，需使用全类名。eg："com.xxx.dto.DemoRequestDTO.class"（可选）
 */
@RestController
public class AppController {

    /**
     *  用户登录认证
     * @param userName  用户名
     * @param password  密码
     * @return
     */
    @PostMapping("/userLogin")
    public String   index(@RequestParam(value = "userName",required = true)String userName,
                          @RequestParam(value = "password",required = false)String password
                          ){
        return "App Hello";
    }


    /**
     * 用户权限
     * @param userId
     * @return
     */
    @PostMapping("/user/permission")
    public List<Map<String, Object>> permission(@RequestParam(value = "userId",required = true)String userId){
        List<Map<String, Object>>   permissionList = new ArrayList<Map<String, Object>>();
        return permissionList;
    }
}
