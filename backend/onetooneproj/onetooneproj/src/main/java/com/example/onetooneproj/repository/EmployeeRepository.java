package com.example.onetooneproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetooneproj.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}