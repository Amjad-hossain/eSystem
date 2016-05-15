package com.codehaven.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by coder on 12/31/15.
 */

@Entity
@Table(name = "ORGANIZATION_FEATURE")
public @Data class OrganizationFeature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", nullable = false)
    private Long id;

    private boolean active;

    @ManyToOne
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;

    @ManyToOne
    @JoinColumn(name = "FEATURe_ID")
    private Feature feature;

    @Column(name="CREATED_ON", nullable = true)
    private Date createdOn;

    @Column(name="MODIFIED_ON", nullable = true)
    private Date modifiedOn;
}
