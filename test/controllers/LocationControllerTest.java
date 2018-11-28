/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Location;
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
 * @author Mukhlish
 */
public class LocationControllerTest {
    private SessionFactory factory = HibernateUtil.getSessionFactory();
    
    public LocationControllerTest() {
        
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
     * Test of insertLocation method, of class LocationController.
     */
    @Test
    public void testInsertLocation() {
        System.out.println("insertLocation");
        String locationId = "3800";
        String streetAddress = "tes";
        String postalCode = "3424";
        String city = "fth";
        String stateProvince = "bdb";
        String countryId = "IT";
        LocationController instance = new LocationController(factory);
        boolean expResult = true;
        boolean result = instance.insertLocation(locationId, streetAddress, postalCode, city, stateProvince, countryId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of deleteLocation method, of class LocationController.
     */
    @Test
    public void testDeleteLocation() {
        System.out.println("deleteLocation");
        String locationId = "3800";
        String City = "fth";
        LocationController instance = new LocationController(factory);
        boolean result = instance.deleteLocation(locationId, City);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of updatetLocation method, of class LocationController.
     */
    @Test
    public void testUpdatetLocation() {
        System.out.println("updatetLocation");
        String locationId = "3700";
        String streetAddress = "bismillah";
        String postalCode = "bismillah";
        String city = "bismillah";
        String stateProvince = "bismillah";
        String countryId = "IT";
        LocationController instance = new LocationController(factory);
        boolean result = instance.updatetLocation(locationId, streetAddress, postalCode, city, stateProvince, countryId);
        assertTrue(result);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getAllRegion method, of class LocationController.
     */
    @Test
    public void testGetAllRegion() {
        System.out.println("getAllRegion");
        LocationController instance = new LocationController(factory);
        List<Location> expResult = instance.getAllRegion();
        List<Location> result = instance.getAllRegion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of getRegionId method, of class LocationController.
     */
    @Test
    public void testGetRegionId() {
        System.out.println("getRegionId");
        Object object = null;
        LocationController instance = new LocationController(factory);
        Location expResult = instance.getRegionId(object);
        Location result = instance.getRegionId(object);
        assertEquals(expResult, result);
        assertSame(expResult, result);
        assertEquals("hmm", expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getSearch method, of class LocationController.
     */
    @Test
    public void testGetSearch() {
        System.out.println("getSearch");
        Object object = null;
        LocationController instance = new LocationController(factory);
        List<Location> expResult = instance.getSearch(object);
        List<Location> result = instance.getSearch(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
