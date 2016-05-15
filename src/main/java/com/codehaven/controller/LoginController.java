package com.codehaven.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by coder on 10/23/15.
 */
@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(value = "/forward.do", method = RequestMethod.GET)
	public String root(Model model) {
		logger.info(">>> Root controller!");
    /*    List<GrantedAuthority> grantedRoles = (List<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		if(grantedRoles != null) {
            logger.debug("AMLOG:: User granted role size: " + grantedRoles.size());
            for(GrantedAuthority grantedAuthority : grantedRoles) {
                logger.debug("AMLOG:: role: " + grantedAuthority.getAuthority());
                if(grantedAuthority.getAuthority().equals("ROLE_ADMIN")) {
                    return "redirect:/admin/users.do";
                }  if(grantedAuthority.getAuthority().equals("ROLE_USER")) {
                    return "redirect:/user/users.do";
                }
            }
        }*/
        return "redirect:/admin/users.do";
	}

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String login(Model model) {
        logger.info(">>> Login page");

        return "login";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        logger.info(">>> Access denied");
        return "accessDenied";
    }


}
