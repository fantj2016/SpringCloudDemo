package com.fantj.fantjprovideruser.dao;

import com.fantj.fantjprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Fant.J.
 * 2017/11/11 14:01
 */
@Repository
public interface UserReposiry extends JpaRepository<User,Long>{

}
