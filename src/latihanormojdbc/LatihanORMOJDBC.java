/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanormojdbc;

import controllers.DepartmentController;
import controllers.EmployeeControllers;
import controllers.RegionControllers;
import daos.DepartmentDAO;
import daos.EmployeeDAO;
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
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        RegionDAO rdao = new RegionDAO(sessionFactory);
        RegionControllers rc = new RegionControllers(sessionFactory);
        EmployeeControllers ec = new EmployeeControllers(sessionFactory);
        EmployeeDAO edao = new EmployeeDAO(sessionFactory);
        DepartmentController dc = new DepartmentController(sessionFactory);

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
//        for (Region region : rdao.getAllRegion()) {
//            System.out.println(region.getRegionName());
//        }
        //System.out.println(edao.getEmployeeId(98).getLastName());
        //BigDecimal nil = BigDecimal.valueOf(209);
//        Employee emp = new Employee("209", "e", "k", "o", "12378", "09-09-2008", "IT_PROG", "5000", "0.0", "100", "100");
        Employee e = new Employee(211, "k");
        System.out.println(ec.deleteData(e));
        //Employee emp = new Employee(210, "e", "k", "o", "12378", "09-09-2008", 5000, 0.0, "100", e, "IT_PROG");
//        System.out.println(ec.insertEmployee("211", "e", "k", "o", "12378", "09/09/2018", "IT_PROG", "5000", "0.0", "100", "100"));
        //System.out.println(ec.updateEmployee("210", "e", "k", "ow", "12378", "09/09/2018", "IT_PROG", "5000", "0.0", "100", "100"));
//        System.out.println(edao.delete(e));
        //System.out.println(rc.updateData(region));

//        Employee e = new Employee(209);
//        System.out.println(edao.delete(e));
//        System.out.println(rc.updateData(region));
//        for(Employee emp : edao.searchData("Eko")){
//            System.out.println(emp.getLastName());
//        }
        //----------------------------------------getAll,getid,search Employees---------------------------------------
//        EmployeeDAO edao = new EmployeeDAO(sessionFactory);
//        System.out.println("GET ALL");
//        for (Employee allEmployee : edao.getAllEmployee()){
//            System.out.println (allEmployee.getEmployeeId()+" "+ allEmployee.getFirstName()
//                               +" "+ allEmployee.getLastName() +" "+ allEmployee.getEmail()
//                               +" "+ allEmployee.getPhoneNumber() +" "+ allEmployee.getHireDate()
//                               +" "+ allEmployee.getJobId() +" "+ allEmployee.getSalary()
//                               +" "+ allEmployee.getCommissionPct() +" "+ allEmployee.getManagerId()
//                               +" "+ allEmployee.getDepartmentId()); 
//            
//        }
//        System.out.println("GET BY ID");
//        for(Employee getid : edao.getIdEmployee(100)){
//            System.out.println(getid.getEmployeeId()+" "+ getid.getFirstName()
//                               +" "+ getid.getLastName() +" "+ getid.getEmail()
//                               +" "+ getid.getPhoneNumber() +" "+ getid.getHireDate()
//                               +" "+ getid.getJobId() +" "+ getid.getSalary()
//                               +" "+ getid.getCommissionPct() +" "+ getid.getManagerId()
//                               +" "+ getid.getDepartmentId());
//        System.out.println("SEARCH");
//        for(Employee getSearch : edao.getSearchEmployee("1")){
//            System.out.println(getSearch.getEmployeeId()+" "+ getSearch.getFirstName()
//                               +" "+ getSearch.getLastName() +" "+ getSearch.getEmail()
//                               +" "+ getSearch.getPhoneNumber() +" "+ getSearch.getHireDate()
//                               +" "+ getSearch.getJobId() +" "+ getSearch.getSalary()
//                               +" "+ getSearch.getCommissionPct() +" "+ getSearch.getManagerId()
//                               +" "+ getSearch.getDepartmentId());
//        }
    }
}
