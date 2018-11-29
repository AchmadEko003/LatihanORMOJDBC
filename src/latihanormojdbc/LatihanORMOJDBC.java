/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanormojdbc;

import controllers.JobController;
import controllers.RegionControllers;
import daos.EmployeeDAO;
import daos.JobDAO;
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
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        RegionDAO rdao = new RegionDAO(sessionFactory);
        RegionControllers rc = new RegionControllers(sessionFactory);
        EmployeeDAO edao = new EmployeeDAO(sessionFactory);
        JobDAO jdao = new JobDAO(sessionFactory);
        JobController jc = new JobController(sessionFactory);
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
        
        for (Job allJob : jc.getAllJobs()) {
            System.out.println(allJob.getJobId() + " - " + allJob.getJobTitle());
        }
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
