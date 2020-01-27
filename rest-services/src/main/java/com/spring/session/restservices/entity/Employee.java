package com.spring.session.restservices.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Employee {
	
	@Id
	private String id; 
		
	private String employeeName;
	
	private int age;
	
	

}
