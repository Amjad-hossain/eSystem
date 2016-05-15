package com.codehaven.domain;

import com.codehaven.listener.UserListener;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by coder on 12/31/15.
 */

@Entity
@Table(name = "ORGANIZATION")
public @Data class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", nullable = false)
    private Long id;

    @Column(name="NAME", nullable = false)
    private String name;

    @Column(name="DESP")
    private String desp;

    private String type;
}
