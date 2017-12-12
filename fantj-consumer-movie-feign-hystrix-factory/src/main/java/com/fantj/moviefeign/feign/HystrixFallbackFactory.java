package com.fantj.moviefeign.feign;

import com.fantj.fantjconsumermovie.entity.User;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by Fant.J.
 * 2017/12/3 14:04
 */
@Component
@Slf4j
public class HystrixFallbackFactory implements FallbackFactory<UserFeignClient>{
    @Override
    public UserFeignClient create(Throwable throwable) {
        log.info("fallback; reason was: " + throwable.getMessage());
        return id -> {
            User user = new User();
            user.setId(0L);
            return user;
        };
    }
}
