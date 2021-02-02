package com.ldl.response;


import lombok.Data;

/**
 * @className: Result
 * @author: LiDL
 * @email: lidonglonge@163.com
 * @create: 2021-02-02 10:37
 * @version: V1.0
 * @features: 功能描述: 统一响应格式
 */
public class ResponseResult<T> {
    private int code;
    private String message;
    private T data;

    public static <T> ResponseResult<T> success(String message) {
        return success(message, null);
    }

    public static <T> ResponseResult<T> success(T data) {
        return success(ResponseEnum.SUCCESS.getMessage(), data);
    }

    public static <T> ResponseResult<T> success(String message, T data) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setCode(ResponseEnum.SUCCESS.getCode());
        responseResult.setMessage(message);
        responseResult.setData(data);
        return responseResult;
    }

    public static <T> ResponseResult<T> fail(String message) {
        return fail(message, null);
    }

    public static <T> ResponseResult<T> fail(T data) {
        return fail(ResponseEnum.FAIL.getMessage(), data);
    }

    public static <T> ResponseResult<T> fail(String message, T data) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setCode(ResponseEnum.FAIL.getCode());
        responseResult.setMessage(message);
        responseResult.setData(data);
        return responseResult;
    }

    public static <T> ResponseResult<T> error(ResponseEnum e) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setCode(e.getCode());
        responseResult.setMessage(e.getMessage());
        return responseResult;
    }

    public static <T> ResponseResult<T> error(ResponseEnum baseExceptionType, String message) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.setCode(baseExceptionType.getCode());
        responseResult.setMessage(message);
        return responseResult;
    }

    private ResponseResult() {
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
