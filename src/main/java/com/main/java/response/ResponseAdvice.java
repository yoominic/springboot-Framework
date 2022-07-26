package com.main.java.response;

import com.main.java.common.Result;
import lombok.SneakyThrows;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName ResponseAdvice
 * @Description 统一返回结果增强
 * @Author yoominic
 * @Date 2022/7/26 15:41 周二
 * @Version 1.0.0
 **/

@RestControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return !returnType.getGenericParameterType().equals(Result.class);
    }


    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (methodParameter.getGenericParameterType().equals(String.class)) { //返回string类型
            return Result.success(o);
        } else if (o == null) { //返回void
            return null;
        } else {
            return o;
        }
    }
}
