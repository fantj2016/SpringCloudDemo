package com.fantj.fantjconsumermovie.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Fant.J.
 * 2017/11/11 13:53
 */
@Data
public class User implements Serializable{
    private Long id;
    private String username;
    private String name;
    private Short age;
    private BigDecimal balance;
}
