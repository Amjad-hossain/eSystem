package com.codehaven.service;

import com.codehaven.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by coder on 10/24/15.
 */


public interface UserService{

    User findById(int id);

    List<User> findAll();

    void addUser(User user);

    List<User> findAll(int start, int length, String searchValue, int orderColumn, String orderDir);
}
