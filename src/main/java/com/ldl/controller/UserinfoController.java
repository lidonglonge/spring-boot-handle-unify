package com.ldl.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.ldl.entity.UserinfoEntity;

import com.ldl.response.ResponseResult;
import com.ldl.service.UserinfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lidonglonge@163.com
 * @since 2021-02-02
 */
@Slf4j
@Api(tags = "Mybatis-plus使用")
@RestController
@RequestMapping("/userinfoEntity")
public class UserinfoController {

    @Resource
    private UserinfoService userinfoService;


    @ApiOperationSupport(author = "lidonglonge@163.com")
    @ApiOperation(value = "访客列表")
    @ApiImplicitParam(name = "id", value = "一个需要的ID信息", required = true)
    @GetMapping("getUserinfo/{id}")
    public ResponseResult<List<UserinfoEntity>> getUserinfo(@PathVariable("id") Integer id) {
        log.info("一个需要的ID信息: " + id);

        Page<UserinfoEntity> userinfoPage = new Page<>(1, 50);
        QueryWrapper<UserinfoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("userName", "userPhone", "updataTime").orderByDesc("createTime");
        Page<UserinfoEntity> page = userinfoService.page(userinfoPage, queryWrapper);

        return ResponseResult.success(page.getRecords());
    }

}

