package com.example.employeprj.repository;


import java.util.List;

import com.example.employeprj.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {


    List<Employee> findByProjectName(String projectName);


    List<Employee> findByName(String name);


    List<Employee> findByImplication(int implication);


    List<Employee> findByProjectNameAndName(String projectName, String name);

    List<Employee> findByProjectNameContaining(String keyword);
}


