/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.springhibernate4.service;

import com.kripesh.springhibernate4.model.Employee;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface EmployeeService {
     void saveEmployee(Employee employee);
 
    List<Employee> findAllEmployees();
 
    void deleteEmployeeBySsn(String ssn);
 
    Employee findBySsn(String ssn);
 
    void updateEmployee(Employee employee);
}
