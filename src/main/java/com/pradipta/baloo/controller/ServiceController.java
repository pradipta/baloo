package com.pradipta.baloo.controller;

import com.pradipta.baloo.entity.service.Service;
import com.pradipta.baloo.entity.service.ServiceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private ServiceHandler serviceHandler;
    @PostMapping("/add")
    public Service addService(@RequestParam String name) {
        return serviceHandler.addService(name);
    }
}
