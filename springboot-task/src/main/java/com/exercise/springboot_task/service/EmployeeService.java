package com.exercise.springboot_task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.springboot_task.model.Employee;
import com.exercise.springboot_task.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	//Retrieve all employees
	public List<Employee> getAllEmployees() 
	{
		return empRepo.findAll();
	}

	//Retrieve employee by Id
	public Employee getEmployeeById(Long empId) throws Exception 
	{
		Employee employee = empRepo.findById(empId).orElseThrow(()-> new Exception("No details found for this emp id"));
		return employee;
	}

	//Create a new employee
	public Employee createEmployee(Employee emp) 
	{	
		return empRepo.save(emp);
	}
	
	

}
