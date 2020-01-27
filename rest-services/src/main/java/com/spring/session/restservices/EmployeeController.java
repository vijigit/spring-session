package com.spring.session.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.session.restservices.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
		
	}
	// /employee/1
	@GetMapping("/{employeeId}")
	public Employee getbyEmployeeId(@PathVariable("employeeId") String employeeId) {
		
		return employeeService.getByEmployeeId(employeeId);
		
	}
	// rmployee/byName?employeeName="xyz"
	@GetMapping("/byName")
	public Employee getByEmployeeName(@RequestParam("employeeName") String employeeName){
		return employeeService.getByEmployeeName(employeeName);
		
	}
	@PostMapping
	public List<Employee> saveEmployee(@RequestBody Employee employee){
		return employeeService.saveEmployee(employee);
		
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee){
		return employeeService.updateEmployee(employee);
		
	}
	
	@DeleteMapping("/{employeeId}")
	public List<Employee> deleteEmployee(@PathVariable("employeeId") String employeeId){
		return employeeService.deleteEmployee(employeeId);
		
	}

}
