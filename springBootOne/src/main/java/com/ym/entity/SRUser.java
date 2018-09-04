package com.ym.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/9/3 0003.
 */
@Api(description = "用户实体类")
public class SRUser {
    /**
     *  @ApiModelProperty 属性说明
     * value–字段说明
     * name–重写属性名字
     * dataType–重写属性类型
     * required–是否必填
     * example–举例说明
     * hidden–隐藏
     */
    @ApiModelProperty("用户名")//描述注解
    private String username;

    @ApiModelProperty(value = "密码",example = "数字,字母，下划线组成")
    private String password;

    @ApiModelProperty(value = "邮箱",example = "lf@qq.com")
    private String email;

    @ApiModelProperty("编码")
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
