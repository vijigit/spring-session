package com.spring.session.service;

import com.spring.session.entity.Application;
import com.spring.session.repository.ApplicationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public Iterable<Application> listApplications() {
        return applicationRepository.findAll();
    }
    
    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }

}
