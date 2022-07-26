package com.main.java.exception;

import com.main.java.common.SuperEnumFace;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;

/**
 * @ClassName BaseExceptionEnum
 * @Description TODO
 * @Author yoominic
 * @Date 2022/7/26 15:36 周二
 * @Version 1.0.0
 **/

@AllArgsConstructor
public enum BaseExceptionEnum implements SuperEnumFace {

    SUCESS(200, "操作成功"),
    FAIL(400, "操作失败"),
    ERROR(500, "服务器异常，请稍后重试"),
    LOGIN_EXPIRE(401, "登录状态过期，请重新登陆");

    private int code;
    private String message;

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}


