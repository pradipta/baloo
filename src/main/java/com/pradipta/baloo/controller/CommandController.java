package com.pradipta.baloo.controller;

import com.pradipta.baloo.handler.CheckHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class CommandController {
    @Autowired
    private CheckHandler checkHandler;

    @RequestMapping(value = "/command", method = RequestMethod.POST)
    public String receiveCommand(HttpServletRequest request) throws IOException {

        return checkHandler.processRequest(request);
    }
}
