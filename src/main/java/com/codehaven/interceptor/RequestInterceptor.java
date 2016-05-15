package com.codehaven.interceptor;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by coder on 1/24/16.
 */
public class RequestInterceptor extends HandlerInterceptorAdapter implements ViewPreparer {

    private String orgId = "partex";

    @Autowired
    private TilesConfigurer tilesConfigurer;
    
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//        System.out.println("RequestInterceptor: REQUEST Intercepted for URI: " + request.getRequestURI());
        request.setAttribute("special", "I Love Animals!");

//        System.out.println("----------- tilesConfig:: " + tilesConfigurer.setDefinitions(""));

        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void execute(Request request, AttributeContext attributeContext) {
//        System.out.println("--------------- attribute : " + attributeContext.getTemplateAttribute());

    }
}
