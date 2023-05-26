package com.ysj.ysj_free.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserLoginAspect {
    @Before("execution(* com.ysj.ysj_free.service.UserService.loginUser(..)) && args(id, password)")
    public void logBeforeUserLogin(String id, String password) {
        System.out.println("사용자 로그인 전 로깅 - ID: " + id);
    }

    @AfterReturning("execution(* com.ysj.ysj_free.service.UserService.loginUser(..)) && args(id, password)")
    public void logAfterUserLogin(String id, String password) {
        System.out.println("사용자 로그인 후 로깅 - ID: " + id);
    }
}
