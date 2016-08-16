/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.springhibernate4.dao;

import com.kripesh.springhibernate4.model.Employee;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface EmployeeDao {
    void saveEmployee(Employee employee);
     
    List<Employee> findAllEmployees();
     
    void deleteEmployeeBySsn(String ssn);
     
    Employee findBySsn(String ssn);
     
    void updateEmployee(Employee employee);
}
