package com.ldl.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: IndexController
 * @author: LiDL
 * @email:  lidonglonge@163.com
 * @create: 2021-02-02 9:44
 * @version: V1.0
 * @features: 功能描述:Knife4j 初始化使用
 */
@Slf4j
@Api(tags = "首页模块")
@RestController
public class IndexController {

    @ApiOperationSupport(author = "lidonglonge@163.com")
    @ApiOperation(value = "返回向客人问好")
    @ApiImplicitParam(name = "name",value = "姓名",required = true)
    @GetMapping("/sayHi")
    public ResponseEntity<String> sayHi(@RequestParam(value = "name")String name){
        log.info("问好人:{}", name);
        return ResponseEntity.ok("Hi:"+name);
    }
}