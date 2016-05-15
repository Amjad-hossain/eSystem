package com.codehaven.service.impl;

import com.codehaven.dao.AdminDao;
import com.codehaven.domain.Role;
import com.codehaven.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by coder on 12/29/15.
 */

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService{

    @Autowired
    private AdminDao adminDao;

    @Override
    public Role findById(int id) {
        return adminDao.findById(Role.class, id);
    }

    @Override
    public List<Role> findAll() {
        return adminDao.findAll("SELECT r FROM Role r", Role.class);
    }

    @Override
    public void addRole(Role role) {
        adminDao.persist(role);
    }
}
