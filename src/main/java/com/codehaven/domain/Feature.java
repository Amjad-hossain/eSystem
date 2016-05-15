package com.codehaven.domain;

import com.codehaven.listener.PermissionListener;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by coder on 12/31/15.
 */

@Entity
@Table(name = "FEATUER")
public @Data class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", nullable = false)
    private Long id;

    @Column(name="NAME", nullable = false)
    private String name;

    @Column(name="DESP")
    private String desp;
}
