package com.codehaven.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coder on 5/15/16.
 */
public enum UserLevel {

    ROLE_SUPER_ADMIN( 1, "ROLE_SUPER_ADMIN", "ROLE_SUPER_ADMIN"),
    ROLE_ADMIN( 2, "ROLE_ADMIN", "ROLE_ADMIN"),
    ROLE_EMPLOYEE( 3, "ROLE_EMPLOYEE", "ROLE_EMPLOYEE"),
    ROLE_CREATE_EMPLOYEE( 4, "ROLE_CREATE_EMPLOYEE", "ROLE_CREATE_EMPLOYEE");

    private String label;
    private String value;
    private int code;

    private UserLevel(int code, String value, String label) {
        this.code = code;
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static String getLabelForValue(String value) {
        for (UserLevel type : values()) {
            if (type.getValue().equals(value)) {
                return type.getLabel();
            }
        }
        return value;
    }

    public static List getRoles() {
        List<UserLevel> rules = new ArrayList();
        rules.add(ROLE_ADMIN);
        rules.add(ROLE_EMPLOYEE);
        return rules;
    }
}
