package com.test.spring.session.springsession.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Employee {
	

	public Employee(String employeeName) {
		this.employeeName = employeeName;
	}

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employee_id")
	private int id;
	
	@Column(name="employee_name", nullable=false)
	private String employeeName;
}
