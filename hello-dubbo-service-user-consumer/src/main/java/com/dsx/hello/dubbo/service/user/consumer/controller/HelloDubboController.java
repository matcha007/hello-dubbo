package com.dsx.hello.dubbo.service.user.consumer.controller;


import com.dsx.hello.dubbo.service.user.api.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 段顺兴
 * @create 2019/03/20 20:56
 * @description
 */
@RestController
public class HelloDubboController {
    @Reference(version = "1.0.0",url = "dubbo://192.168.62.1:12345")
    private UserService userService;


    @GetMapping("/hi")
    public String sayHi() {
        return userService.sayHi();
    }
}
