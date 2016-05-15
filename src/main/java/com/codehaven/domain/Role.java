package com.codehaven.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by coder on 12/29/15.
 */


@Entity
@Table(name = "ROLE")
public @Data class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", nullable = false)
    private Long id;

    @Column(name="NAME", nullable = false)
    private String name;

    @Column(name="DESP")
    private String desp;

}
