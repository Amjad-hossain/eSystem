package com.codehaven.domain;

import com.codehaven.listener.PermissionListener;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by coder on 12/31/15.
 */

@Entity
@Table(name = "PERMISSION")
public @Data class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", nullable = false)
    private Long id;

    private String name;

    private String desp;

    private boolean active;

    @ManyToOne
    @JoinColumn(name = "FEATURE_ID", nullable = false)
    private Feature feature;

    @Column(name="CREATED_ON", nullable = true)
    private Date createdOn;

    @Column(name="MODIFIED_ON", nullable = true)
    private Date modifiedOn;
}
