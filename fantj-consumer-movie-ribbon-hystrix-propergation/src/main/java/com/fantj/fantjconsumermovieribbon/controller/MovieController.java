package com.fantj.fantjconsumermovieribbon.controller;

import com.fantj.fantjconsumermovieribbon.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.SessionScope;

/**
 * Created by Fant.J.
 * 2017/11/11 17:43
 */
@RestController
@SessionScope
public class MovieController {
    @Autowired
    private RestTemplate template;

/**
 * 让Hystrix在一个线程里运行(正常使用不需要配置，报错not found applicationContext时再添加)
 * commandProperties = {
        @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
    }
 */
@HystrixCommand(fallbackMethod = "findByIdFallback",commandProperties = {
@HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")})
@RequestMapping("/movie/{id}")
public User findById(@PathVariable Long id){
        return this.template.getForObject("http://provider-user3/simple/"+id,User.class);
    }

    public User findByIdFallback(Long id){
        User user = new User();
        user.setId(id);
        return user;
    }
}
