/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Location;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Nine
 */
public class LocationDAO {

    private SessionFactory factory;

    public LocationDAO() {
    }

    public LocationDAO(SessionFactory factory) {
        this.factory = factory;
    }

    public List<Location> data(String query) {
        List<Location> datas = new ArrayList<>();
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

    /**
     *
     * Line effectiveness = ef
     */
    public boolean getdatas(Location location, String ef) {
        boolean result = false;
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            if (ef == "save") {
                session.save(location);
            } else if (ef == "update") {
                session.update(location);
            } else if (ef == "delete") {
                session.delete(location);
            }
            transaction.commit();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

    public List<Location> getAllLocation() {
        return data("FROM Location");
    }
            
    public List<Location> searchData(Object object) {
        String query = "FROM LOCATION WHERE locationId LIKE '%" + object + "%'"
                + "OR streetAddress LIKE '%" + object + "%'"
                + "OR postalCode LIKE '%" + object + "%'"
                + "OR city LIKE '%" + object + "%'"
                + "OR stateProvince LIKE '%" + object + "%'"
                + "OR countryId LIKE '%" + object + "%'";
        return data(query);
    }

    public boolean save(Location location) {
        return getdatas(location, "save");
    }

    public boolean delete(Location location) {
        return getdatas(location, "delete");
    }

    public boolean update(Location location) {
        return getdatas(location, "update");
    }

    public Location getLocationId(Object id) {
        Location location = new Location();
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            location = (Location) session.createQuery("FROM LOCATION WHERE locationId = " + id).uniqueResult();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return location;
    }
}
