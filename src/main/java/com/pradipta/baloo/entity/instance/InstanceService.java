package com.pradipta.baloo.entity.instance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstanceService {
    @Autowired
    private InstanceRepository instanceRepository;

    public Instance saveInstance(Instance instance) {
        return instanceRepository.save(instance);
    }
}
