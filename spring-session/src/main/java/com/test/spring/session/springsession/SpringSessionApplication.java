package com.test.spring.session.springsession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.test.spring.session.springsession.data.Employee;
import com.test.spring.session.springsession.data.EmployeeRepository;

@SpringBootApplication
public class SpringSessionApplication implements CommandLineRunner{

	@Autowired
	EmployeeRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(SpringSessionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Employee("Viji"));
		repository.save(new Employee("two"));
		repository.save(new Employee("three"));

		repository.findAll().forEach(System.out::println);
		
	}

}
