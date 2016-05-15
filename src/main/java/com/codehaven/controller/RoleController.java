package com.codehaven.controller;

import com.codehaven.domain.Role;
import com.codehaven.domain.User;
import com.codehaven.service.RoleService;
import com.codehaven.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.TimeZone;

/**
 * Created by coder on 12/29/15.
 */

@Controller
public class RoleController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private RoleService roleService;

    @RequestMapping( value = "/role.do", method = RequestMethod.GET)
    public String getPersonForm(ModelMap model) {

        logger.debug(">>> Add role form");
        model.addAttribute("role", new Role());
        return "role";
    }

    @RequestMapping( value = "/role.do", method = RequestMethod.POST)
    public String savePerson(@ModelAttribute("role") Role role) {

        logger.debug(">>> Add roles form");
        roleService.addRole(role);
        return "redirect:./roles.do";
    }

    @RequestMapping( value = "/roles.do", method = RequestMethod.GET)
    public String readUsers(ModelMap model) {

        logger.debug(">>> role list reading.");
        List<Role> roles = roleService.findAll();
        model.addAttribute("roles", roles);
        return "role-list";
    }

}
