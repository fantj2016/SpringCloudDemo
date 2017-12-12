package com.fantj.fantjdiscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class ZuulFallBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulFallBackApplication.class, args);
	}
}
