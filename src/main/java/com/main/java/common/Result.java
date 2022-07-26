package com.main.java.common;

import com.main.java.exception.BaseExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.ObjectUtils;

import java.io.Serializable;

/**
 * @ClassName Result
 * @Description TODO
 * @Author yoominic
 * @Date 2022/7/26 15:38 周二
 * @Version 1.0.0
 **/

@Data
@AllArgsConstructor
public class Result<T> implements Serializable {


    /**
     * 状态码
     */
    private int code;
    /**
     * 响应消息
     */
    private String message;
    /**
     * 响应数据
     */
    private T data;

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(SuperEnumFace superEnumFace) {
        this.code = superEnumFace.getCode();
        this.message = superEnumFace.getMessage();
    }

    public Result(SuperEnumFace superEnumFace, T data) {
        this.code = superEnumFace.getCode();
        this.message = superEnumFace.getMessage();
        this.data = data;
    }

    /**
     * 服务器错误
     *
     * @param message
     * @return
     */
    public static Result error(String message) {
        if (ObjectUtils.isEmpty(message)) {
            return new Result(BaseExceptionEnum.ERROR);
        } else {
            return new Result(BaseExceptionEnum.ERROR.getCode(), message);
        }
    }

    /**
     * @param data
     * @return
     */
    public static <T> Result success(T data) {
        return new Result(BaseExceptionEnum.SUCESS, data);
    }


}
