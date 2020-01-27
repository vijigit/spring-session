package com.spring.session.restservices.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.session.restservices.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{

	Optional<Employee> findByEmployeeName(String employeeName);

	

}
