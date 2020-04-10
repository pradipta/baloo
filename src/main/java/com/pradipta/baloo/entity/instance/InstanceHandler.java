package com.pradipta.baloo.entity.instance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InstanceHandler {
    @Autowired
    private InstanceService instanceService;

    public Instance addInstance(String name) {
        Instance instance = new Instance();
        instance.setName(name);
        instance.setIsReserved(false);
        instanceService.saveInstance(instance);
        return instance;
    }
}
