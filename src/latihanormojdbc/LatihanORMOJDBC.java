/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanormojdbc;

import controllers.RegionControllers;
import daos.EmployeeDAO;
import daos.LocationDAO;
import daos.RegionDAO;
import entities.Country;
import entities.Department;
import entities.Employee;
import entities.Job;
import entities.Location;
import entities.Region;
import java.math.BigDecimal;
import org.hibernate.SessionFactory;

/**
 *
 * @author Nitani
 */
public class LatihanORMOJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//        RegionDAO rdao = new RegionDAO(sessionFactory);
//        RegionControllers rc = new RegionControllers(sessionFactory);
//        EmployeeDAO edao = new EmployeeDAO(sessionFactory);
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        LocationDAO ldao = new LocationDAO(sessionFactory);
        for (Location location : ldao.getAllLocation()){
            System.out.println("Country ID" + location.getCountryId());
            System.out.println("City" + location.getCity());
            System.out.println("Department" + location.getDepartmentList());
            System.out.println("Loc ID" + location.getLocationId());
            System.out.println("Postal" + location.getPostalCode());
            System.out.println("Province" + location.getStateProvince());
            System.out.println("Address" + location.getStreetAddress());
        }
  
//        RegionDAO rdao = new RegionDAO(sessionFactory);
//        RegionControllers rc = new RegionControllers(sessionFactory);
//        EmployeeDAO edao = new EmployeeDAO(sessionFactory);
//        for (Region allregion : rdao.getAllRegion()) {
//            System.out.println(allregion.getRegionName());
//            for (Country country : allregion.getCountryList()) {
//                System.out.println("=="+country.getCountryName()+"==");
//                for (Location location : country.getLocationList()) {
//                    System.out.println("----"+location.getCity());
//                    for (Department department : location.getDepartmentList()) {
//                        System.out.println(">>>"+department.getDepartmentName());
//                        for (Employee employee : department.getEmployeeList()) {
//                            System.out.println(">"+employee.getLastName() + " with job " + employee.getJobId().getJobTitle());
//                        }
//                    }
//                }
//            }
//            System.out.println("");
//        }

//        for(Job emp : edao.selectJobId()){
//            System.out.println(emp.getJobId());
//        }
        //System.out.println(edao.getEmployeeId(98).getLastName());

//        BigDecimal nil = BigDecimal.valueOf(12);
//        Region region = new Region(nil, "Kal");
//        System.out.println(rc.deleteData(region));
//        System.out.println(rc.updateData(region));
//        for(Employee emp : edao.searchData("Eko")){
//            System.out.println(emp.getLastName());
//        }
    }
}
