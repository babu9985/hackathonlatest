package com.example.database1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.database1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
