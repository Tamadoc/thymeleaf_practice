package com.terisandstedt.thymeleaf_practice.service;

import com.terisandstedt.thymeleaf_practice.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void deleteById(int id);
}
