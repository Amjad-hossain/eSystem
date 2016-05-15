package com.codehaven.service.impl;

import com.codehaven.controller.UserController;
import com.codehaven.dao.AdminDao;
import com.codehaven.domain.Role;
import com.codehaven.domain.User;
import com.codehaven.domain.UserLevel;
import com.codehaven.service.UserService;
import com.codehaven.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by coder on 10/24/15.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private AdminDao adminDao;

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public UserDetails loadUserByUsername(String uName) throws UsernameNotFoundException {

        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;

        logger.debug(">>> loadUserByUsername:: Get UserDetails start");
        List<String> roles = new ArrayList<String>();
        List featureList = new ArrayList();
        String fCode = "";
        String[] featureArr;
        User user = new User();
        String password = "";
        logger.debug("AMLOG:: uName[{}]", uName);
        if (Utils.isEmpty(uName)) {
            throw new UsernameNotFoundException("No such user: " + uName);
        }

        try {
            user = findUserByName(uName);
            logger.debug("AMLOG:: User:: " + user);
            if(user == null){
                throw new UsernameNotFoundException("No such user: " + uName);
            }

            if(UserLevel.ROLE_SUPER_ADMIN.getLabel().equals(user.getRole())){
                logger.debug("My User detail Service: --------- HI BOSS YOU ARE SUPER ADMIN ----------");
//                featureList = adminJdbcService.getAllFeatures();
                roles.add(UserLevel.ROLE_SUPER_ADMIN.getLabel());
            }else{
                logger.debug("My User detail Service: --------- YOU ARE A NORMAL USER ----------");
//                featureList = adminJdbcService.getUserFeatures(user.getId());
            }
            password = user.getPassword();

            for(Object object: featureList){
                Map map = (Map)object;
                fCode = map.get("featureCode") != null ? (String)map.get("featureCode"):"";
                roles.add(fCode);
            }

        } catch (Exception e) {
            throw new UsernameNotFoundException("No such user: " + uName);
        }

        return new org.springframework.security.core.userdetails.User(
                uName,
                password,
                true,
                accountNonExpired,
                credentialsNonExpired,
                accountNonLocked,
                getAuthorities(roles));
    }

    public Collection<? extends GrantedAuthority> getAuthorities(List<String> roles) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }

    public User findById(int id) {
        return adminDao.findById(User.class, id);
    }

    public List<User> findAll() {
        return adminDao.findAll("SELECT u FROM User u", User.class);
    }

    /*@Override
    public List<User> findAll(String searchKey, String sortOrder) {

        return adminDao.findAll("SELECT u FROM User u WHERE u.uName = :searchKey order by u.uName :sortOrder", searchKey, sortOrder, User.class);
    }*/

    @Override
    public List<User> findAll(int start, int length, String searchValue, int orderColumn, String orderDir) {

        return adminDao.findAll(start, length, searchValue, getUserOrderBy(orderColumn), orderDir);
    }

    private String getUserOrderBy(int orderColumn) {

        switch (orderColumn) {
            case 1:
                return "user_name";
            case 2:
                return "display_name";
            case 3:
                return "email";
        }
        return null;
    }

    public void addUser(User user) {
        adminDao.persist(user);
    }

    public User findUserByName(String uName) throws Exception {
        logger.debug("AMLOG:: findUserByName: " + uName);
        return adminDao.findUserByName(uName);
    }
}