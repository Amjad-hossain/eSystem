package com.codehaven.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by coder on 12/31/15.
 */

@Entity
@Table(name = "ROLE_PERMISSION")
public @Data class RolePermission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", nullable = false)
    private Long id;

    private boolean active;

    @Column(name="CREATED_ON", nullable = true)
    private Date createdOn;

    @Column(name="MODIFIED_ON", nullable = true)
    private Date modifiedOn;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "PERMISSION_ID")
    private Permission permission;

}
