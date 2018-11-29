/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Employee;
import java.math.BigDecimal;
import java.util.List;
import latihanormojdbc.HibernateUtil;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import latihanormojdbc.HibernateUtil;
/**
 *
 * @author tikamhrdk
 */
public class EmployeeControllersTest {
    
    public EmployeeControllersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class EmployeeControllers.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        SessionFactory factory = HibernateUtil.getSessionFactory();
        EmployeeControllers instance = new EmployeeControllers(factory);
//        List<Employee> expResult = null;
        List<Employee> result = instance.gets();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class EmployeeControllers.
     */
    @Test
    public void testGetId() {
        System.out.println("getbyId");
        SessionFactory factory = HibernateUtil.getSessionFactory();
        EmployeeControllers instance = new EmployeeControllers(factory);
//        List<Employee> expResult = null;
        Employee result = instance.getEmployeeId(100);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Search method, of class EmployeeControllers.
     */
    @Test
    public void testSearch() {
        System.out.println("Search");
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Object data = 1;
        EmployeeControllers instance = new EmployeeControllers();
        for(Employee emp : instance.getSearch("Eko")){
            System.out.println(emp.getLastName());
        }
//        List<Employee> expResult = null;
        List<Employee> result = instance.getSearch("Eko");
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testDelete() {
        System.out.println("Search");
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Object data = 1;
        EmployeeControllers instance = new EmployeeControllers();
        Employee employee = new Employee(209);
        assertTrue(instance.deleteData(employee));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
