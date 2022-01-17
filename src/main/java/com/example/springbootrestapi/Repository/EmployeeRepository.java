package com.example.springbootrestapi.Repository;


import com.example.springbootrestapi.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}