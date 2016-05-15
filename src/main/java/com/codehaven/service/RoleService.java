package com.codehaven.service;

import com.codehaven.domain.Role;

import java.util.List;

/**
 * Created by coder on 12/29/15.
 */
public interface RoleService {

    Role findById(int id);

    List<Role> findAll();

    void addRole(Role role);
}
