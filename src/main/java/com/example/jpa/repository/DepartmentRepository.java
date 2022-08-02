package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.jpa.entity.Department;

@RepositoryRestResource(path="dept")
@CrossOrigin("http://localhost:4200/")
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
