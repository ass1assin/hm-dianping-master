package com.hmdp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


//通过@EnableAspectJAutoProxy注解，Spring会自动为带有@Aspect注解的切面类创建代理，从而实现切面逻辑的织入。exposeProxy = true表示将代理对象暴露给AOP切面内部，允许在切面内部通过AopContext.currentProxy()方法获取代理对象。
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.hmdp.mapper")
@SpringBootApplication
public class HmDianPingApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmDianPingApplication.class, args);
    }

}
