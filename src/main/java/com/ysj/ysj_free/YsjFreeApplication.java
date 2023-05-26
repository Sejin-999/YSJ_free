package com.ysj.ysj_free;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class YsjFreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(YsjFreeApplication.class, args);
    }

}
