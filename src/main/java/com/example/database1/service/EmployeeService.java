package com.example.database1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.database1.entity.Employee;
import com.example.database1.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	
	public void addEmployee(Employee emp) {
		empRepo.save(emp);
	}
	
	public List<Employee> getAllEmployees(){
		List<Employee> emp = empRepo.findAll();
		return emp;
	}
	
	public void deleteEmployee(int id) {
		empRepo.deleteById(id);
	}
	
	public void deleteAllEmployees(Employee emp) {
		empRepo.deleteAll();
	}

}
