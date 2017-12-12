package com.fantj.fantjconsumermovie.controller;

import com.fantj.fantjconsumermovie.entity.User;
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

    @RequestMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return this.template.getForObject("http://127.0.0.1:7900/simple/"+id,User.class);
    }
}
