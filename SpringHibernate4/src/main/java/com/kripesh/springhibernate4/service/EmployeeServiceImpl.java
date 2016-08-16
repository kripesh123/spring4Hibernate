/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.springhibernate4.service;
import com.kripesh.springhibernate4.dao.EmployeeDao;
import com.kripesh.springhibernate4.model.Employee;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Admin
 */
@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeDao dao;

    @Override
    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return dao.findAllEmployees();
    }

    @Override
    public void deleteEmployeeBySsn(String ssn) {
        dao.deleteEmployeeBySsn(ssn);
    }

    @Override
    public Employee findBySsn(String ssn) {
        return dao.findBySsn(ssn);
    }

    @Override
    public void updateEmployee(Employee employee) {
        dao.updateEmployee(employee);
    }
}
