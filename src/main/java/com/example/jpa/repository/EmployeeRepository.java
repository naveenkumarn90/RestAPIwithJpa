package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.jpa.entity.Employee;

@RepositoryRestController(path="emp")
@CrossOrigin("http://localhost:4200/")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
