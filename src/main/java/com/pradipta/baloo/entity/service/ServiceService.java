package com.pradipta.baloo.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public com.pradipta.baloo.entity.service.Service addService(com.pradipta.baloo.entity.service.Service service) {
        return serviceRepository.save(service);
    }
}
