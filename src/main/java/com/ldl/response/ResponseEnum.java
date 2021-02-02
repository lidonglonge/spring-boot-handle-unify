package com.ldl.response;

/**
 * @className: ResponseEnum
 * @author: LiDL
 * @email: lidonglonge@163.com
 * @create: 2021-02-02 10:34
 * @version: V1.0
 * @features: 功能描述: 统一返回代码和返回消息
 */
public enum ResponseEnum {

    /**
     * 请求返回码
     */
    SUCCESS(200, "请求成功"),
    FAIL(400, "请求失败"),

    /**
     * 异常返回码
     */
    USER_EXCEPTION(501, "用户操作异常"),
    SYSTEM_EXCEPTION(500, "系统异常");

    private final int code;
    private final String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
