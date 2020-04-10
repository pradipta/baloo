package com.pradipta.baloo.handler;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class CheckHandler {
    public String processRequest(HttpServletRequest request) {
        String username = request.getParameterMap().get("user_name") [0];
        String channel = request.getParameterMap().get("channel_name")[0];
        String command = request.getParameterMap().get("command")[0];
        String service = null;
        String[] textArray = request.getParameterMap().get("text");
        if (textArray.length>0) {
            service = textArray[0];
        }
        return username+" "+channel+" "+command+" "+service;
    }
}
