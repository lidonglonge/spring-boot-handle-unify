package com.ldl.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.ldl.response.ResponseResult;
import com.ldl.vo.Userinfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: ResponseResult
 * @author: LiDL
 * @email: lidonglonge@163.com
 * @create: 2021-02-02 10:47
 * @version: V1.0
 * @features: 功能描述:
 */
@Api(tags = "统一返回格式")
@RestController
@RequestMapping("result")
public class ResponseResultController {

    @ApiOperationSupport(author = "lidonglonge@163.com")
    @ApiOperation(value = "添加一个用户")
    @ApiImplicitParam(name = "userinfo", value = "用户信息", required = true)
    @PostMapping("insertUserinfo")
    public ResponseResult<Userinfo> insertUserinfo(@RequestParam(value = "userinfo")Userinfo userinfo){
        System.out.println(userinfo.toString());
        return ResponseResult.success(userinfo);
    }

}
