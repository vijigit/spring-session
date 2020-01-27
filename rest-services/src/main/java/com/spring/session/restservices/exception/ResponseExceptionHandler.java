package com.spring.session.restservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.session.restservices.EmployeeController;

@RestControllerAdvice(assignableTypes={EmployeeController.class})
public class ResponseExceptionHandler {
	
	@ExceptionHandler(value= {EmployeeNotFoundException.class})
	@ResponseBody ResponseEntity<String> employeeNotFoundException(EmployeeNotFoundException ex) {
		return new ResponseEntity<String>("Employee Not Found", HttpStatus.NOT_FOUND);
	}

	
}
