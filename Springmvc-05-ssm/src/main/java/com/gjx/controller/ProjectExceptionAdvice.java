package com.gjx.controller;

import com.gjx.exception.BusinessException;
import com.gjx.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException exception) {
//系统异常

        return new Result(exception.getCode(), null, exception.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Result doException(Exception exception) {
        System.out.println("哈哈哈哈哈，傻逼");
        return new Result(Code.SYSTEM_UNKNOW, null,"哈哈哈哈哈，傻逼");
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException exception) {
        System.out.println("哈哈哈哈哈，傻逼");
        return new Result(exception.getCode(), null, exception.getMessage());
    }
}
