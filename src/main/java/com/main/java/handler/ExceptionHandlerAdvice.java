package com.main.java.handler;

import com.main.java.common.Result;
import com.main.java.exception.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName ExceptionHandlerAdvice
 * @Description TODO
 * @Author yoominic
 * @Date 2022/7/26 15:39 周二
 * @Version 1.0.0
 **/
@Slf4j
@RestControllerAdvice
public class ExceptionHandlerAdvice {

    /**
     * 处理业务异常
     *
     * @param baseException
     * @return
     */
    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public Result exceptionHandler(BaseException baseException) {
        log.error("业务异常：{}", baseException.getMessage());
        return Result.error(baseException.getMessage());
    }

    /**
     * 未知异常处理
     *
     * @param exception
     * @return
     */
    public Result exceptionHandler(Exception exception) {
        log.error("运行时异常：{}", exception.getMessage());
        return Result.error(null);
    }


}
