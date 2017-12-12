package com.fantj.fantjconsumermovieribbon;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.ZoneAvoidanceRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Fant.J.
 * 2017/11/30 18:56
 */
@SuppressWarnings("ALL")
@Configuration
@ExcludeFromComponentScan
//@RibbonClient(name = "provider-user",configuration = Config.class)
public class Config {
    @Autowired
    IClientConfig clientConfig;
    @Bean
    @ConditionalOnMissingBean
    public IRule ribbonRule(IClientConfig clientConfig) {
        return new RandomRule();
    }
}
