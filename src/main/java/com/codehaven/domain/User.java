package com.codehaven.domain;



import com.codehaven.listener.UserListener;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by coder on 10/17/15.
 */

@Entity
@EntityListeners({UserListener.class})
@Table(name = "USER")
public @Data class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", nullable = false)
    private Long id;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="DISPLAY_NAME")
    private String displayName;

    @Column(name="DISPLAY_NAME_CHANGED", nullable = true)
    private Date displayNameChanged;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PASSWORD_HASH", nullable = false)
    private String password;

    @Column(name = "role")
    private String role;

    @Column(name="LAST_LOGIN", nullable = true)
    private Date lastLogin;

    @Column(name="LAST_IP", nullable = true)
    private String lastIp;

    @Column(name="CREATED_ON", nullable = true)
    private Date createdOn;

    @Column(name="MODIFIED_ON", nullable = true)
    private Date modifiedOn;

    private String language;

    @Column(name="TIME_ZONE", nullable = true)
    private String timeZone;

  /*  @ManyToOne
    @JoinColumn(name = "ORGANIZATION_ID", nullable = false)
    private Organization organization;*/

    private boolean active;
}
