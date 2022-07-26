package com.main.java.exception;

import com.main.java.common.SuperEnumFace;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName BaseException
 * @Description TODO
 * @Author yoominic
 * @Date 2022/7/26 15:35 周二
 * @Version 1.0.0
 **/
@Getter
@AllArgsConstructor
public class BaseException extends RuntimeException {
    private int code;
    private String message;

    /**
     * 自定义异常枚举构造
     *
     * @param superEnumFace
     */
    public BaseException(SuperEnumFace superEnumFace) {
        this.code = superEnumFace.getCode();
        this.message = superEnumFace.getMessage();
    }

}
