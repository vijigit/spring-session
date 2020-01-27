package com.spring.session.service;

import com.spring.session.entity.Release;
import com.spring.session.repository.ReleaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReleaseService {
    @Autowired
    private ReleaseRepository releaseRepository;

    public Iterable<Release> listReleases() {
        return releaseRepository.findAll();
    }

}
