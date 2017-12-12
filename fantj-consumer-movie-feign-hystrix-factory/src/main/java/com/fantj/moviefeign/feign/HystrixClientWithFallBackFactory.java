package com.fantj.moviefeign.feign;

import com.fantj.fantjconsumermovie.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by Fant.J.
 * 2017/12/3 14:07
 */
@Component
public interface HystrixClientWithFallBackFactory extends UserFeignClient {
}
