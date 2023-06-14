package com.forest.system.controller;

import com.forest.core.common.Result;
import com.forest.core.common.ResultFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Api(description = "获取tokenAPI",tags = "获取token",value = "获取token", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping("/api")
public class GetToken {


    @GetMapping("/gettoken")
    @ApiOperation("第三方机构登录认证")
    public Result gettoken(){
        return ResultFactory.success();
    }

}
