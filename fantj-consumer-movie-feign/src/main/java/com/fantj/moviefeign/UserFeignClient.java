package com.fantj.moviefeign;

import com.fantj.fantjconsumermovie.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Fant.J.
 * 2017/12/1 19:33
 */
@FeignClient("provider-user3")
public interface UserFeignClient {
    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User postUser(@RequestBody User user);
}
