package com.example.emq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.emq.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
