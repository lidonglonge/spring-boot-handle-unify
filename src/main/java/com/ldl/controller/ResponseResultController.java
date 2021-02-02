package com.ldl.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.ldl.response.ResponseResult;
import com.ldl.vo.Userinfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@Slf4j
@RestController
@RequestMapping("result")
public class ResponseResultController {

    // getLogger()的入参是当前类，否则输出日志的类名会是错误的, 如果使用lombok 直接使用注解 @Slf4j
    // private final Logger logger = LoggerFactory.getLogger(ResponseResultController.class);  logger.info("userinfo{}", userinfo);

    @ApiOperationSupport(author = "lidonglonge@163.com")
    @ApiOperation(value = "添加一个用户")
    @ApiImplicitParam(name = "userinfo", value = "用户信息", required = true)
    @PostMapping("insertUserinfo")
    public ResponseResult<Userinfo> insertUserinfo(Userinfo userinfo){
        /*
        * @RequestBody
        * @RequestParam(value = "userinfo")
         * */
        log.info("logTest, userinfo{}", userinfo);
        System.out.println(userinfo.toString());
        return ResponseResult.success(userinfo);
    }

}
