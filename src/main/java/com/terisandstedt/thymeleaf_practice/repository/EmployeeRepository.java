package com.terisandstedt.thymeleaf_practice.repository;

import com.terisandstedt.thymeleaf_practice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByLastNameAsc();
}
