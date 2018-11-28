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
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Nitani
 */
public class EmployeeControllers {

    private SessionFactory factory;
    private EmployeeDAO edao;

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

}
