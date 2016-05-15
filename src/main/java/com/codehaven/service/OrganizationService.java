package com.codehaven.service;

import com.codehaven.domain.Organization;
import com.codehaven.domain.Role;

import java.util.List;

/**
 * Created by coder on 1/3/16.
 */
public interface OrganizationService {

    Organization findById(int id);

    List<Organization> findAll();

    void add(Organization organization);
}
