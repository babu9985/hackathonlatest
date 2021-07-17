package com.example.database1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.database1.entity.Employee;
import com.example.database1.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@EnableAutoConfiguration
@CrossOrigin
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@PostMapping(value="/employee/add")
	public String add(@RequestBody Employee emp) {
		empService.addEmployee(emp);
		return "Employee Saved Successfully";
	}
	
	@GetMapping(value="/employee/allEmployees")
	@ApiOperation("Test")
	public List<Employee> allEmployeesList(){
		return empService.getAllEmployees();
	}
	
	@DeleteMapping(value="/employee/delete/{id}")
	public String delete(@PathVariable int id) {
		empService.deleteEmployee(id);
		return "Record Deleted Successfully With Id : "+id;
	}
	
	@DeleteMapping(value="/employee/deleteall")
	public String deleteAll(Employee emp) {
		empService.deleteAllEmployees(emp);
		return "All Records Deleted Successfully";
	}
}
