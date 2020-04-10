package com.pradipta.baloo.entity.service;

import com.pradipta.baloo.entity.instance.Instance;
import com.pradipta.baloo.entity.instance.InstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServiceHandler {
    @Autowired
    private ServiceService serviceService;
    @Autowired
    private InstanceService instanceService;
    public Service addService (String name) {
        Service service = new Service();
        service.setName(name);
        List<Instance> availableInstances = instanceService.getAllInstance();
        service.setInstances(availableInstances);
        return serviceService.addService(service);
    }

    public List<Instance> checkWithParanms(String service) {
        return serviceService.findAllService()
                .stream()
                .filter(service1 -> service1.getName().equalsIgnoreCase(service))
                .findFirst()
                .map(service1 -> service1.getInstances())
                .get();
    }
}
