/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.EmployeeDAO;
import entities.Department;
import entities.Employee;
import entities.Job;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.hibernate.SessionFactory;

/**
 *
 * @author Nitani
 */
public class EmployeeControllers {

    private SessionFactory factory;
    private EmployeeDAO edao;
    java.util.Date date = new java.util.Date();

    public EmployeeControllers() {
    }

    public EmployeeControllers(SessionFactory factory) {
        this.factory = factory;
        this.edao = new EmployeeDAO(factory);
    }

    public List<Employee> gets() {
        return edao.getAllEmployee();
    }

    public Employee getEmployeeId(Object object) {
        return edao.getEmployeeId(object);
    }

    public boolean deleteData(Employee employee) {
        return edao.delete(employee);
    }

    public List<Employee> getSearch(Object object) {
        return edao.searchData(object);
    }

    public List<Job> getsJob() {
        return edao.selectJobId();
    }

    public List<Department> getsDepartment() {
        return edao.selectDepartmentId();
    }

    public boolean insertEmployee(String employeeId, String firstName, String lastName, String email, String phoneNumber, String hireDate, String jobId, String salary, String commissionPct, String managerId, String departmentId) {
        boolean result = false;
        int employeeid = Integer.valueOf(employeeId);
        try {
            DateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            Date dates = format.parse(hireDate);
            short sal = Short.valueOf(salary);
            short com = Short.valueOf(commissionPct);
            int managerid = Integer.valueOf(managerId);
            Employee emp = new Employee(managerid);
            Job job = new Job(jobId);
            Department department = new Department(Short.valueOf(departmentId));
            Employee employee = new Employee(employeeid, firstName, lastName, email, phoneNumber, dates, job, sal, com, emp, department);
            result = edao.insert(employee);
        } catch (Exception e) {
            e.getMessage();
        }
        return result;
    }
    
    public boolean updateEmployee(String employeeId, String firstName, String lastName, String email, String phoneNumber, String hireDate, String jobId, String salary, String commissionPct, String managerId, String departmentId) {
        boolean result = false;
        int employeeid = Integer.valueOf(employeeId);
        try {
            DateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            Date dates = format.parse(hireDate);
            short sal = Short.valueOf(salary);
            short com = Short.valueOf(commissionPct);
            int managerid = Integer.valueOf(managerId);
            Employee emp = new Employee(managerid);
            Job job = new Job(jobId);
            Department department = new Department(Short.valueOf(departmentId));
            Employee employee = new Employee(employeeid, firstName, lastName, email, phoneNumber, dates, job, sal, com, emp, department);
            result = edao.update(employee);
        } catch (Exception e) {
            e.getMessage();
        }
        return result;
    }
}
