/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RegionDAO;
import entities.Region;
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

/**
 *
 * @author Nitani
 */
public class RegionControllersTest {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    public RegionControllersTest() {
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
     * Test of getAllRegion method, of class RegionControllers.
     */
    @Test
    public void testGetAllRegion() {
        System.out.println("getAllRegion");
        RegionControllers instance = new RegionControllers();
        List<Region> expResult = instance.getAllRegion();
        List<Region> result = instance.getAllRegion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegionId method, of class RegionControllers.
     */
    @Test
    public void testGetRegionId() {
        boolean hasil = true;
        System.out.println("getRegionId");
        Object object = 1;
        RegionControllers instance = new RegionControllers();
        Region result = instance.getRegionId(object);
        assertEquals(hasil, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSearch method, of class RegionControllers.
     */
    @Test
    public void testGetSearch() {
        System.out.println("getSearch");
        Object object = null;
        RegionControllers instance = new RegionControllers();
        List<Region> expResult = null;
        List<Region> result = instance.getSearch(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertData method, of class RegionControllers.
     */
    @Test
    public void testInsertData() {
        System.out.println("insertData");
        Region region = new Region(BigDecimal.valueOf(12), "Kal");
        RegionControllers instance = new RegionControllers(sessionFactory);
        boolean expResult = true;
        boolean result = instance.insertData(region);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteData method, of class RegionControllers.
     */
    @Test
    public void testDeleteData() {
        System.out.println("deleteData");
        Region region = null;
        RegionControllers instance = new RegionControllers();
        boolean expResult = false;
        boolean result = instance.deleteData(region);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
