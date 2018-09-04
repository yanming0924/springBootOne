package com.ym.controller;

import com.ym.entity.SRUser;
import com.ym.utils.CommonDTO;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ym on 2018/9/3 0003.
 */
@Api(description = "用户控制类")
@Controller
@RequestMapping(value="${modulePath}/user")
public class UserController {
    /**
     * 获取用户信息
     */
    //@ApiOperation()用于方法;表示一个http请求的操作
    @ApiOperation(value = "用户信息接口",
            notes = "获取用户信息接口",
            position = 0)
    //@ApiResponses 响应集配置
    @ApiResponses(value = {@ApiResponse(code = 100, message = "用户信息接口异常"),
            @ApiResponse(code = 200, message = "用户信息接口成功")})
    @ResponseBody // 返回json数据的注解
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public CommonDTO<SRUser> getUserInfo(@ApiParam("用户编码") SRUser user){
        CommonDTO<SRUser> detailDTO = new CommonDTO<>(0,1);
        try {
            //SRUser user = new SRUser();
            user.setUsername("ym");
            user.setPassword("123456");
            user.setEmail("1847452563@qq.com");
            detailDTO.setData(user);
        } catch (Exception e) {
            e.printStackTrace();
            detailDTO.setStatus(1);
            detailDTO.setCode(400);
            detailDTO.setMsg("获取用户信息异常："+e.getMessage());

        }

        return detailDTO;
    }
}
