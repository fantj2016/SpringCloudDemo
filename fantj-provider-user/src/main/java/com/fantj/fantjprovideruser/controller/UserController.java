package com.fantj.fantjprovideruser.controller;

import com.fantj.fantjprovideruser.dao.UserReposiry;
import com.fantj.fantjprovideruser.entity.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Fant.J.
 * 2017/11/11 14:03
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@RestController
public class UserController {

    @Autowired
    private UserReposiry userReposiry;
    @Autowired
    private EurekaClient eurekaClient;
//    @Autowired
//    private DiscoveryClient discoveryClient;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        return this.userReposiry.findOne(id);
    }

    @GetMapping("/eureka-instance")
    public String serviceUrl(){
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("PROVIDER-USER",false);
        return instanceInfo.getHomePageUrl();
    }
    @PostMapping("/user")
    public User postUser(@RequestBody User user){
        return user;
    }
}
