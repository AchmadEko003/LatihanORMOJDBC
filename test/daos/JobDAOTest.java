/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Job;
import java.util.List;
import latihanormojdbc.HibernateUtil;
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
public class JobDAOTest {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    public JobDAOTest() {
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
     * Test of insertDatas method, of class JobDAO.
     */
    @Test
    public void testInsertDatas() {
        System.out.println("insertDatas");
        Job job = null;
        String data = "";
        JobDAO instance = new JobDAO();
        boolean expResult = false;
        boolean result = instance.insertDatas(job, data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatas method, of class JobDAO.
     */
    @Test
    public void testGetDatas() {
        System.out.println("getDatas");
        String query = "";
        JobDAO instance = new JobDAO();
        List<Job> expResult = null;
        List<Job> result = instance.getDatas(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllJobs method, of class JobDAO.
     */
    @Test
    public void testGetAllJobs() {
        System.out.println("getAllJobs");
        JobDAO instance = new JobDAO(sessionFactory);
        List<Job> expResult = instance.getAllJobs();
        List<Job> result = instance.getAllJobs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAllJobs1() {
        System.out.println("getAllJobs");
        JobDAO instance = new JobDAO(sessionFactory);
        List<Job> expResult = instance.getAllJobs();
        List<Job> result = instance.getAllJobs();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAllJobs2() {
        System.out.println("getAllJobs");
        JobDAO instance = new JobDAO(sessionFactory);
        List<Job> expResult = instance.getAllJobs();
        List<Job> result = instance.getAllJobs();
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of searchJobs method, of class JobDAO.
     */
    @Test
    public void testSearchJobs() {
        System.out.println("searchJobs");
        Object object = null;
        JobDAO instance = new JobDAO(sessionFactory);
        List<Job> expResult = instance.searchJobs(object);
        List<Job> result = instance.searchJobs(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchJobs1() {
        System.out.println("searchJobs");
        Object object = null;
        JobDAO instance = new JobDAO(sessionFactory);
        List<Job> expResult = instance.searchJobs(object);
        List<Job> result = instance.searchJobs(object);
        assertNotNull(object);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchJobs2() {
        System.out.println("searchJobs");
        Object object = null;
        JobDAO instance = new JobDAO(sessionFactory);
        List<Job> expResult = instance.searchJobs(object);
        List<Job> result = instance.searchJobs(object);
        assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getByIdJob method, of class JobDAO.
     */
    @Test
    public void testGetByIdJob() {
        System.out.println("getByIdJob");
        Object jobId = null;
        JobDAO instance = new JobDAO(sessionFactory);
        Job expResult = instance.getByIdJob(jobId);
        Job result = instance.getByIdJob(jobId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testGetByIdJob1() {
        System.out.println("getByIdJob");
        Object jobId = null;
        JobDAO instance = new JobDAO(sessionFactory);
        Job expResult = instance.getByIdJob(jobId);
        Job result = instance.getByIdJob(jobId);
        assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testGetByIdJob2() {
        System.out.println("getByIdJob");
        Object jobId = null;
        JobDAO instance = new JobDAO(sessionFactory);
        Job expResult = instance.getByIdJob(jobId);
        Job result = instance.getByIdJob(jobId);
        assertFalse(false);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of insertJob method, of class JobDAO.
     */
    @Test
    public void testInsertJob() {
        System.out.println("insertJob");
        Job job = null;
        JobDAO instance = new JobDAO(sessionFactory);
        boolean expResult = false;
        boolean result = instance.insertJob(job);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testInsertJob1() {
        System.out.println("insertJob");
        Job job = new Job("Adi", "Tukang ketik2");
        JobDAO instance = new JobDAO(sessionFactory);
        boolean result = instance.insertJob(job);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testInsertJob2() {
        System.out.println("insertJob");
        Job job = null;
        JobDAO instance = new JobDAO(sessionFactory);
        boolean expResult = false;
        boolean result = instance.insertJob(job);
        assertFalse(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateJob method, of class JobDAO.
     */
    @Test
    public void testUpdateJob() {
        System.out.println("updateJob");
        Job job = null;
        JobDAO instance = new JobDAO(sessionFactory);
        boolean expResult = false;
        boolean result = instance.updateJob(job);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateJob1() {
        System.out.println("updateJob");
        Job job = null;
        JobDAO instance = new JobDAO(sessionFactory);
        boolean expResult = false;
        boolean result = instance.updateJob(job);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateJob2() {
        System.out.println("updateJob");
        Job job = null;
        JobDAO instance = new JobDAO(sessionFactory);
        boolean result = instance.updateJob(job);
        assertFalse(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteJob method, of class JobDAO.
     */
    @Test
    public void testDeleteJob() {
        System.out.println("deleteJob");
        Job job = null;
        JobDAO instance = new JobDAO(sessionFactory);
        boolean expResult = false;
        boolean result = instance.deleteJob(job);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteJob1() {
        System.out.println("deleteJob");
        Job job = new Job("Andi", "");
        JobDAO instance = new JobDAO(sessionFactory);
        boolean expResult = false;
        boolean result = instance.deleteJob(job);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteJob2() {
        System.out.println("deleteJob");
        Job job = null;
        JobDAO instance = new JobDAO(sessionFactory);
        boolean expResult = false;
        boolean result = instance.deleteJob(job);
        assertFalse(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
