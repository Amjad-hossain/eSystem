package com.codehaven.listener;

import com.codehaven.domain.User;
import com.codehaven.exception.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

/**
 * Created by coder on 12/31/15.
 */
public class UserListener {

    private static final Logger logger = LoggerFactory.getLogger(UserListener.class);

    @PrePersist
    public void validUser(Object obj) throws BadRequestException {

        User user = (User) obj;
        user.setCreatedOn(new Date());
    }

    @PreUpdate
    public void modifyUsr(Object obj) throws BadRequestException {

        User user = (User) obj;
        user.setModifiedOn(new Date());
    }


    private User doValidate(Object obj) throws BadRequestException {
        if (obj == null) {
            throw new BadRequestException(2000, 400, "User Not Found", "www.codehaven.com");
        }

        User user = (User) obj;

        if(StringUtils.isEmpty(user.getDisplayName())) {
            throw new BadRequestException(2000, 400, "User display name is required", "www.codehaven.com");
        }

        if(StringUtils.isEmpty(user.getUserName())) {
            throw new BadRequestException(2000, 400, "User name is empty", "www.codehaven.com");
        }

        if(StringUtils.isEmpty(user.getEmail())) {
            throw new BadRequestException(2000, 400, "User email is empty", "www.codehaven.com");
        }

        if(StringUtils.isEmpty(user.getTimeZone())) {
            throw new BadRequestException(2000, 400, "User timezone is empty", "www.codehaven.com");
        }

        return user;
    }
}
