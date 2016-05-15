package com.codehaven.listener;

import com.codehaven.domain.Permission;
import com.codehaven.exception.BadRequestException;
import org.springframework.util.StringUtils;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

/**
 * Created by coder on 12/31/15.
 */
public class PermissionListener {

    @PrePersist
    public void validPermission(Object obj) throws BadRequestException {

        Permission permission = doValidate(obj);
        permission.setCreatedOn(new Date());
    }

    @PreUpdate
    public void modifyPermission(Object obj) throws BadRequestException {

        Permission permission = (Permission) obj;
        permission.setModifiedOn(new Date());
    }

    private Permission doValidate(Object obj) throws BadRequestException {

        if (obj == null) {
            throw new BadRequestException(2000, 400, "Permission Not Found", "www.codehaven.com");
        }

        Permission permission = (Permission) obj;

        if(StringUtils.isEmpty(permission.getName())) {
            throw new BadRequestException(2000, 400, "Permission name is required", "www.codehaven.com");
        }

        if(StringUtils.isEmpty(permission.getDesp())) {
            throw new BadRequestException(2000, 400, "Permission description is required", "www.codehaven.com");
        }

        return permission;
    }
}
