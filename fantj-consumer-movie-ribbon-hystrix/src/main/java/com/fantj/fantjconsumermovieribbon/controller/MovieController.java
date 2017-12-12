package com.fantj.fantjconsumermovieribbon.controller;

import com.fantj.fantjconsumermovieribbon.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Fant.J.
 * 2017/11/11 17:43
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate template;

@HystrixCommand(fallbackMethod = "findByIdFallback")
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
