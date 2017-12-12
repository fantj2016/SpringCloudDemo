package com.fantj.moviefeign.feign;

import com.fantj.fantjconsumermovie.entity.User;
import com.fantj.moviefeign.feign.UserFeignClient;
import org.springframework.stereotype.Component;

/**
 * Created by Fant.J.
 * 2017/12/3 11:54
 */
@Component
public class HystrixFallBack implements UserFeignClient {
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }
}
