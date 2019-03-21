package com.dsx.hello.dubbo.service.user.provider.api.impl;


import com.dsx.hello.dubbo.service.user.api.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author 段顺兴
 * @create 2019/03/20 19:09
 * @description
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHi() {
        return serviceName;
    }
}
