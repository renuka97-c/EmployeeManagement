package com.exercise.springboot_task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.springboot_task.model.Employee;
import com.exercise.springboot_task.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired 
	private EmployeeService empService;
	
	//Retrieve list of employees
	@GetMapping("/employee")
	public List<Employee> getAllEmployees()
	{
		return empService.getAllEmployees();
	}
	
	//Retrieve single employee by ID
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value="id")Long empId) throws Exception
	{
		return ResponseEntity.ok(empService.getEmployeeById(empId));
	}
	
	//Create an employee
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee emp)
	{
		return empService.createEmployee(emp);
	}
	

}
