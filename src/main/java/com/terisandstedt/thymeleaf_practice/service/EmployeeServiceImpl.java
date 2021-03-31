package com.terisandstedt.thymeleaf_practice.service;

import com.terisandstedt.thymeleaf_practice.entity.Employee;
import com.terisandstedt.thymeleaf_practice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        employeeRepository = repository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result =  employeeRepository.findById(id);

        if (!result.isPresent()) {throw new RuntimeException("Did not find employee id - " + id);}

        return result.orElse(null);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
