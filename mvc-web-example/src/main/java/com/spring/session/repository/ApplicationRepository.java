package com.spring.session.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.session.entity.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
