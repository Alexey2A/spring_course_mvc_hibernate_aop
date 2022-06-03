package org.example.spring.mvc_hibernate_aop.service;

import org.example.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
}
