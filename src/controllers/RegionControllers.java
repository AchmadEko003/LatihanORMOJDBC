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
import org.hibernate.SessionFactory;

/**
 *
 * @author Nitani
 */
public class RegionControllers {

    private SessionFactory factory;
    private RegionDAO rdao;

    public RegionControllers() {
    }

    public RegionControllers(SessionFactory factory) {
        this.factory = factory;
        this.rdao = new RegionDAO(factory);
    }

    public List<Region> getAllRegion() {
        return rdao.getAllRegion();
    }

    public Region getRegionId(Object object) {
        return rdao.getRegionId(object);
    }

    public List<Region> getSearch(Object object) {
        return rdao.searchData(object);
    }

    public boolean insertData(Region region) {
        return rdao.insert(region);
    }

    public boolean updateData(Region region) {
        return rdao.update(region);
    }

    public boolean deleteData(Region region) {
        return rdao.delete(region);
    }
}
