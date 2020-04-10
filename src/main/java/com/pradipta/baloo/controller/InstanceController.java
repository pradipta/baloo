package com.pradipta.baloo.controller;

import com.pradipta.baloo.entity.instance.Instance;
import com.pradipta.baloo.entity.instance.InstanceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instance")
public class InstanceController {
    @Autowired
    private InstanceHandler instanceHandler;

    @PostMapping("/add")
    public Instance addInstance(@RequestParam String name) {
        return instanceHandler.addInstance(name);
    }
}
