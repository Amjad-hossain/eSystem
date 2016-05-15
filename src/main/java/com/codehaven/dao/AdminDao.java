package com.codehaven.dao;


import com.codehaven.domain.Organization;
import com.codehaven.domain.User;

import java.util.List;

/**
 * Created by coder on 1/23/16.
 */
public interface AdminDao{

    <T> T findById( Class<T> kClass, Object key);

    <T> List<T> findAll(String jpaString, Class<T> resultClass);

    <T> List<T> findAll(String jpaString, String SearchKey, String sortOrder, Class<T> resultClass);

    void persist(Object entity);

    User findUserByName(String uName) throws Exception;

    List<User> findAll(int start, int length, String searchValue, String orderColumn, String orderDir);
}
