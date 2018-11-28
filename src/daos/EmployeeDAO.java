/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Department;
import entities.Employee;
import entities.Job;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Nitani
 */
public class EmployeeDAO {

    private SessionFactory factory;

    public EmployeeDAO() {
    }

    public EmployeeDAO(SessionFactory factory) {
        this.factory = factory;
    }
    
    public List<Employee> data(String query) {
        List<Employee> datas = new ArrayList<>();
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            datas = session.createQuery(query).list();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return datas;
    }
    
    public List<Employee> getAllEmployee() {
        return data("from Employee");
    }
    
    public Employee getEmployeeId(Object id) {
        Employee datas = new Employee();
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            datas = (Employee) session.createQuery("from Employee where EMPLOYEE_ID=" + id).uniqueResult();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return datas;
    }
    
    public List<Employee> searchData(Object data) {
        String query = "FROM Employee where employee_id LIKE '%" + data + "%'"
                + " OR first_name LIKE '%" + data + "%'"
                + " OR last_name LIKE '%" + data + "%'"
                + " OR email LIKE '%" + data + "%'"
                + " OR phone_number LIKE '%" + data + "%'"
                + " OR hire_date LIKE '%" + data + "%'"
                + " OR job_id LIKE '%" + data + "%'"
                + " OR salary LIKE '%" + data + "%'"
                + " OR commission_pct LIKE '%" + data + "%'"
                + " OR manager_id LIKE '%" + data + "%'"
                + " OR department_id LIKE '%" + data + "%'";
        return data(query);
    }
    
    public List<Department> selectDepartmentId() {
        List<Department> datas = new ArrayList<>();
        String query = "FROM Department";
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            datas = session.createQuery(query).list();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return datas;
    }
    
    public List<Job> selectJobId() {
        List<Job> datas = new ArrayList<>();
        String query = "FROM Job";
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            datas = session.createQuery(query).list();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return datas;
    }
    //---------------------------------------------getAll,getid,search------------------------------------------
     public boolean datas (Employee employe, String le){
        boolean result = false;
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            if(le == "save" ){
                session.save(employe);
            }else if (le == "update"){
                session.update(employe);
            }else if (le == "delete"){
                session.delete(employe);
            }
            transaction.commit();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction != null){
                session.close();
            }
        }finally{
            session.close();
        }
        return result;
    }
    public List<Employee> datas(String query){
        List<Employee> datas = new ArrayList<>();
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            datas = session.createQuery(query).list();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction!=null){
                transaction.rollback();
            }
        }finally{
            session.close();
            
        }
        return datas;
    }
//    public List<Employee> getAllEmployee(){
//        return datas("From Employee");
//    }
    public List<Employee> getIdEmployee(Object id){
        List<Employee> datas = new ArrayList<>();
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            datas = session.createQuery("From Employee where employeeId= " + id).list();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction!=null){
                transaction.rollback();
            }
        }finally{
            session.close();
            
        }
        return datas;
    }
     public List<Employee> getSearchEmployee(Object data){
        String query = "FROM Employee where employeeId LIKE '%" + data + "%'"
                + " OR firstName LIKE '%" + data + "%'"
                + " OR lastName LIKE '%" + data + "%'"
                + " OR email LIKE '%" + data + "%'"
                + " OR phoneNumber LIKE '%" + data + "%'"
                + " OR hireDate LIKE '%" + data + "%'"
                + " OR jobId LIKE '%" + data + "%'"
                + " OR salary LIKE '%" + data + "%'"
                + " OR commissionPct LIKE '%" + data + "%'"
                + " OR managerId LIKE '%" + data + "%'"
                + " OR departmentId LIKE '%" + data + "%'";
        return datas(query);
    }
    
      public boolean insert(Employee employee){
         return datas(employee, "save");
     }
     
      public boolean update(Employee employee){
         return datas(employee, "update");
     }
      public boolean delete(Employee employee){
         return datas(employee, "delete");
     }
}
