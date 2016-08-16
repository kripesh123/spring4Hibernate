/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kripesh.springhibernate4;
import com.kripesh.springhibernate4.configuration.AppConfig;
import com.kripesh.springhibernate4.model.Employee;
import com.kripesh.springhibernate4.service.EmployeeService;
import java.math.BigDecimal;
import java.util.List;
 
import org.joda.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
/**
 *
 * @author Admin
 */
public class MyApp {
    
    public static void main(String args[]){
         AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
 
        EmployeeService service = (EmployeeService) context.getBean("employeeService");
 
        /*
         * Create Employee1
         */
        Employee employee1 = new Employee();
        employee1.setName("Kripesh Bista");
        employee1.setJoiningDate(new LocalDate(2011, 11, 11));
        employee1.setSalary(new BigDecimal(12000));
        employee1.setSsn("ssn00000001");
 
        /*
         * Create Employee2
         */
        Employee employee2 = new Employee();
        employee2.setName("Suman Heuju");
        employee2.setJoiningDate(new LocalDate(2012, 12, 12));
        employee2.setSalary(new BigDecimal(25000));
        employee2.setSsn("ssn00000002");
 
        /*
         * Persist both Employees
         */
        service.saveEmployee(employee1);
        service.saveEmployee(employee2);
 
        /*
         * Get all employees list from database
         */
        List<Employee> employees = service.findAllEmployees();
        for (Employee emp : employees) {
            System.out.println(emp);
        }
 
        /*
         * delete an employee
         */
        service.deleteEmployeeBySsn("ssn00000002");
 
        /*
         * update an employee
         */
 
        Employee employee = service.findBySsn("ssn00000001");
        employee.setSalary(new BigDecimal(40000));
        service.updateEmployee(employee);
 
        /*
         * Get all employees list from database
         */
        List<Employee> employeeList = service.findAllEmployees();
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
 
        context.close();
    }
}
