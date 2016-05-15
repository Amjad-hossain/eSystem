package com.codehaven.service.impl;

import com.codehaven.dao.AdminDao;
import com.codehaven.domain.Organization;
import com.codehaven.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by coder on 1/3/16.
 */

@Service
@Transactional
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private  AdminDao adminDao;

    @Override
    public Organization findById(int id) {
        return adminDao.findById(Organization.class, id);
    }

    @Override
    public List<Organization> findAll() {
        return adminDao.findAll("SELECT o FROM Organization o", Organization.class);
    }

    @Override
    public void add(Organization organization) {
        adminDao.persist(organization);
    }
}
