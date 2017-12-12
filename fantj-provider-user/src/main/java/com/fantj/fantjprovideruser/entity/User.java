package com.fantj.fantjprovideruser.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Fant.J.
 * 2017/11/11 13:53
 */
@Entity
@Data
public class User implements Serializable{
    @Id
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Short age;
    @Column
    private BigDecimal balance;
}
