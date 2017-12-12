package com.fantj.moviefeign.controller;

import com.fantj.fantjconsumermovie.entity.User;
import com.fantj.moviefeign.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Fant.J.
 * 2017/11/11 17:43
 */
@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/movie/{id}")
    public User findById(@PathVariable("id") Long id){
        return userFeignClient.findById(id);
    }

}
