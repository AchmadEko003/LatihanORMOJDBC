/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Employee;
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
    
}
