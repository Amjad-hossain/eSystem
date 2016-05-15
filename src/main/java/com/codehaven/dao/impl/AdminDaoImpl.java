package com.codehaven.dao.impl;

import com.codehaven.dao.AdminDao;
import com.codehaven.domain.Role;
import com.codehaven.domain.User;
import com.codehaven.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by coder on 1/23/16.
 */
@Repository("adminDao")
public class AdminDaoImpl implements AdminDao{

    private static final Logger logger = LoggerFactory.getLogger(AdminDaoImpl.class);

    @PersistenceContext private EntityManager entityManager;

    @Override
    public <T> T findById(Class<T> kClass, Object key) {

        return this.entityManager.find(kClass, key);
    }

    @Override
    public <T> List<T> findAll(String jpaString, Class<T> resultClass) {

        return this.entityManager.createQuery(jpaString, resultClass).getResultList();
    }

    @Override
    public <T> List<T> findAll(String jpaString, String searchKey, String sortOrder, Class<T> resultClass) {

        return this.entityManager.createQuery(jpaString, resultClass).setParameter("searchKey", searchKey).setParameter("sortOrder", sortOrder).getResultList();
    }

    @Override
    public void persist(Object entity) {

        this.entityManager.persist(entity);
    }

    @Override
    public User findUserByName(String uName) throws Exception{

        logger.debug("AMLOG:: uName:: " + uName);
        TypedQuery<User> query = this.entityManager.createQuery("SELECT u FROM User u WHERE u.userName = :uName", User.class);
        query.setParameter("uName", uName);
        User user = query.getSingleResult();
        logger.debug("AMLOG:: user:: " + user);
        return user;
    }

    @Override
    public List<User> findAll(int start, int length, String searchValue, String orderColumn, String orderDir) {

        String hsql = "SELECT u FROM User u " + (!Utils.isEmpty(searchValue) ? ("WHERE " +orderColumn + "= :searchKey") : "" + " order by " + orderColumn + " " + orderDir);
        logger.debug("AMLOG:: hsql:: " + hsql);

        TypedQuery<User> query = this.entityManager.createQuery(hsql, User.class);

        if(!Utils.isEmpty(searchValue))
        query.setParameter("searchKey", searchValue);
        query.setFirstResult(start);
        query.setMaxResults(length);
        return query.getResultList();
    }
}
