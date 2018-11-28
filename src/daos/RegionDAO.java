/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Region;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Nitani
 */
public class RegionDAO {

    private SessionFactory factory;

    public RegionDAO() {
    }

    /**
     * ini ngeload semua data dari koneksi
     *
     * @param factory
     */
    public RegionDAO(SessionFactory factory) {
        this.factory = factory;
    }

    /**
     * get all data from table Regions
     *
     * @return
     */
    public boolean getdatas(Region region, String ef) {
        boolean result = false;
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            if (ef == "save") {
                session.save(region);
            } else if (ef == "update") {
                session.update(region);
            } else if (ef == "delete") {
                session.delete(region);
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

    public List<Region> data(String query) {
        List<Region> datas = new ArrayList<>();
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

    public List<Region> getAllRegion() {
        return data("from Region");
    }

    public List<Region> searchData(Object object) {
        String query = "from Region where regionId LIKE '%" + object + "%'"
                + " OR regionName LIKE '%" + object + "%'";
        return data(query);
    }

    public Region getRegionId(Object id) {
        Region datas = new Region();
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            datas = (Region) session.createQuery("from Region where regionId=" + id).uniqueResult();
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

    public boolean insert(Region region) {
        return getdatas(region, "save");
    }

    public boolean update(Region region) {
        return getdatas(region, "update");
    }

    public boolean delete(Region region) {
        return getdatas(region, "delete");
    }
}
