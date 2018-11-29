/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Job;
import java.util.List;
import latihanormojdbc.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Igaz
 */
public class JobControllerTest {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    public JobControllerTest() {
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
     * Test of getAllJobs method, of class JobController.
     */
    @Test
    public void testGetAllJobs() {
        System.out.println("getAllJobs");
        JobController instance = new JobController(sessionFactory);
        List<Job> expResult = instance.getAllJobs();
        List<Job> result = instance.getAllJobs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of searchJobs method, of class JobController.
     */
    @Test
    public void testSearchJobs() {
        System.out.println("searchJobs");
        Object object = null;
        JobController instance = new JobController(sessionFactory);
        List<Job> expResult = instance.searchJobs(object);
        List<Job> result = instance.searchJobs(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getByIdJob method, of class JobController.
     */
    @Test
    public void testGetByIdJob() {
        System.out.println("getByIdJob");
        Object object = null;
        JobController instance = new JobController(sessionFactory);
        Job expResult = instance.getByIdJob(object);
        Job result = instance.getByIdJob(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of insertJob method, of class JobController.
     */
    @Test
    public void testInsertJob() {
        System.out.println("insertJob");
        Job job = null;
        JobController instance = new JobController(sessionFactory);
        boolean expResult = false;
        boolean result = instance.insertJob(job);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateJob method, of class JobController.
     */
    @Test
    public void testUpdateJob() {
        System.out.println("updateJob");
        Job job = null;
        JobController instance = new JobController(sessionFactory);
        boolean expResult = false;
        boolean result = instance.updateJob(job);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteJob method, of class JobController.
     */
    @Test
    public void testDeleteJob() {
        System.out.println("deleteJob");
        Job job = new Job("ADE", "");
        JobController instance = new JobController(sessionFactory);
        boolean expResult = true;
        boolean result = instance.deleteJob(job);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
