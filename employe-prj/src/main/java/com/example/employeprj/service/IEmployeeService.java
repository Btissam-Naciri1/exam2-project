package com.example.employeprj.service;


import java.util.List;
import java.util.Optional;

import com.example.employeprj.model.Employee;

public interface IEmployeeService {

    List<Employee> getEmployeesByProject(String projectName);

    Optional<Employee> getEmployeeById(Integer id);

    void updateEmployee(Employee employee);

    void addEmployee(String name, String projectName, int implication);

    void deleteEmployee(Integer id);

    void saveEmployee(Employee employee);

}
