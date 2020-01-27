package com.spring.session.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.session.restservices.entity.Employee;
import com.spring.session.restservices.exception.EmployeeNotFoundException;
import com.spring.session.restservices.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;

	public List<Employee> getAllEmployees() {
		return empRepository.findAll();
	}

	public Employee getByEmployeeId(String employeeId) {
		return empRepository.findById(employeeId).orElseThrow(EmployeeNotFoundException::new);

	}

	public Employee getByEmployeeName(String employeeName) {
		return empRepository.findByEmployeeName(employeeName).orElseThrow(EmployeeNotFoundException::new);
	}

	//@Transactional(propagation = Propagation.REQUIRED, rollbackFor= Exception.class)
	public List<Employee> saveEmployee(Employee employee) {
		empRepository.save(employee);
		return getAllEmployees();

	}
	
	public Employee updateEmployee(Employee employee) {
		Employee retievedemployee = empRepository.findById(employee.getId()).orElseThrow(EmployeeNotFoundException::new);
		retievedemployee.setEmployeeName(employee.getEmployeeName());
		empRepository.save(retievedemployee);
		return retievedemployee;

	}

	public List<Employee> deleteEmployee(String employeeId) {
		empRepository.deleteById(employeeId);
		return getAllEmployees();
	}
	
	

}
