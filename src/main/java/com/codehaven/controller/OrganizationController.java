package com.codehaven.controller;

import com.codehaven.domain.Organization;
import com.codehaven.domain.User;
import com.codehaven.service.OrganizationService;
import com.codehaven.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/**
 * Created by coder on 1/3/16.
 */

@Controller
public class OrganizationController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private OrganizationService organizationService;

    @RequestMapping( value = "/admin/orgList.do", method = RequestMethod.GET)
    public String readOrgs(ModelMap model) {

        logger.debug(">>> Org list reading.");
        return "org-list";
    }

    @RequestMapping( value = "/admin/orgs.do", method = RequestMethod.GET)
    public @ResponseBody Map readOrgsAsJson(ModelMap model) {

        logger.info(">>> readOrgsAsJson:: by ajax");
        List<Organization> orgs = organizationService.findAll();
        if(orgs != null && !orgs.isEmpty()) {
            logger.info("--- readOrgsAsJson:: size[{}]", orgs.size());
        } else {
            logger.info("--- readOrgsAsJson:: Empty list");
        }
        Map<String, List> response = new HashMap<String, List>();
        response.put("data", orgs);
        return response;
    }

    @RequestMapping( value = "/admin/org.do", method = RequestMethod.GET)
    public String getPersonForm(ModelMap model) {

        logger.info(">>> Add Organization form");
        model.addAttribute("organization", new Organization());
        return "organization";
    }


    @RequestMapping( value = "/admin/org.do", method = RequestMethod.POST)
    public String savePerson(@ModelAttribute("organization") Organization organization) {

        logger.debug(">>> Add org form : " + organization);
        organizationService.add(organization);
        return "redirect:./orgList.do";
    }
}
