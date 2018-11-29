/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Job;
import java.util.List;
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
        JobController instance = new JobController();
        List<Job> expResult = null;
        List<Job> result = instance.getAllJobs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchJobs method, of class JobController.
     */
    @Test
    public void testSearchJobs() {
        System.out.println("searchJobs");
        Object object = null;
        JobController instance = new JobController();
        List<Job> expResult = null;
        List<Job> result = instance.searchJobs(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByIdJob method, of class JobController.
     */
    @Test
    public void testGetByIdJob() {
        System.out.println("getByIdJob");
        Object object = null;
        JobController instance = new JobController();
        Job expResult = null;
        Job result = instance.getByIdJob(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertJob method, of class JobController.
     */
    @Test
    public void testInsertJob() {
        System.out.println("insertJob");
        String jobId = "";
        String jobTitle = "";
        String minSalary = "";
        String maxSalary = "";
        JobController instance = new JobController();
        boolean expResult = false;
        boolean result = instance.insertJob(jobId, jobTitle, minSalary, maxSalary);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateJob method, of class JobController.
     */
    @Test
    public void testUpdateJob() {
        System.out.println("updateJob");
        String jobId = "";
        String jobTitle = "";
        String minSalary = "";
        String maxSalary = "";
        JobController instance = new JobController();
        boolean expResult = false;
        boolean result = instance.updateJob(jobId, jobTitle, minSalary, maxSalary);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteJob method, of class JobController.
     */
    @Test
    public void testDeleteJob() {
        System.out.println("deleteJob");
        String jobId = "";
        String jobTile = "";
        JobController instance = new JobController();
        boolean expResult = false;
        boolean result = instance.deleteJob(jobId, jobTile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
