/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import daos.EmployeeDAO;
import entities.Employee;
import entities.Region;
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
        this.edao = new EmployeeDAO();
    }
    public List<Employee> getAllEmployee(){
        return edao.getAllEmployee();
    }
    public List<Employee> getIdEmployee(Object id){
        return edao. getIdEmployee(id);
    }
    public List<Employee> getSearchEmployee(Object data){
        return  edao.getSearchEmployee(data);
    }
    
}
