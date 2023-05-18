package com.lsgf.springboot08swagger.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Api("模块")
@ApiModel("用户实体类")
public class User {
    @ApiModelProperty("用户名")
    public String username;

    @ApiModelProperty("密码")
    private String password;
}
