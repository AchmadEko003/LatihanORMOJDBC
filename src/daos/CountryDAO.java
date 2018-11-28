/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Country;
import entities.Department;
import entities.Employee;
import entities.Region;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Andi SR
 */
public class CountryDAO {

    private SessionFactory factory;

    public CountryDAO() {
    }

    public CountryDAO(SessionFactory factory) {
        this.factory = factory;
    }

    public List<Country> getDatas(String query) {
        List<Country> datas = new ArrayList<>();
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

    public List<Country> getAllCountry() {
        return getDatas("FROM Country");
    }

    public List<Country> getById(Object countryId) {
        return getById("FROM Country WHERE countryId=" + countryId);
    }

    public List<Country> searchData(Object data) {
        String query = "FROM Country where countryId LIKE '%" + data + "%'"
                + "OR countryName like '%" + data + "%'"
                + "OR regionId LIKE '%" + data + "%'";
        return getDatas(query);
    }


    public boolean CrudCountry(Country country, String data) {
        boolean result = false;
        Session session = this.factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            if (data == "Save") {
                session.save(country);
            } else if (data == "Update") {
                session.update(country);
            } else if (data == "Delete") {
                session.delete(country);
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

    public boolean insertCountry(Country country) {
        return CrudCountry(country, "Save");
    }

    public boolean updateCountry(Country country) {
        return CrudCountry(country, "Update");
    }

    public boolean deleteCountry(Country country) {
        return CrudCountry(country, "Delete");
    }

}
