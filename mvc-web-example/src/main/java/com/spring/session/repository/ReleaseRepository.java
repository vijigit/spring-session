package com.spring.session.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.session.entity.Release;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}