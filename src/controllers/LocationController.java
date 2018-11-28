/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.LocationDAO;
import entities.Country;
import entities.Location;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Kaukanoer
 */
public class LocationController {

    private SessionFactory factory;
    private LocationDAO ldao;

    public LocationController() {
    }

    public LocationController(SessionFactory factory) {
        this.factory = factory;
        this.ldao = new LocationDAO(factory);
    }

    public boolean insertLocation(String locationId, String streetAddress, String postalCode, String city, String stateProvince, String countryId) {
        Short departmentid = Short.valueOf(locationId);
        Country country = new Country(countryId);
        Location location = new Location(departmentid, streetAddress, postalCode, city, stateProvince, country);
        return ldao.save(location);
    }

    public boolean deleteLocation(String locationId, String City) {
        Short locationid = Short.valueOf(locationId);
        Location location = new Location(locationid, City);
        return ldao.delete(location);
    }
    
    public boolean updatetLocation(String locationId, String streetAddress, String postalCode, String city, String stateProvince, String countryId) {
        Short departmentid = Short.valueOf(locationId);
        Country country = new Country(countryId);
        Location location = new Location(departmentid, streetAddress, postalCode, city, stateProvince, country);
        return ldao.update(location);
    }

    public List<Location> getAllRegion() {
        return ldao.getAllLocation();
    }

    public Location getRegionId(Object object) {
        return ldao.getLocationId(object);
    }

    public List<Location> getSearch(Object object) {
        return ldao.searchData(object);
    }
}
