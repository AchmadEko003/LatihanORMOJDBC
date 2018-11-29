/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Job;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Igaz
 */
public class JobDAO {
    private SessionFactory sessionFactory;

    public JobDAO() {
    }

    public JobDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    /*
    * fungsi untuk menginsert, update, dan delete menggunakan kondisi if
    * line efektiveness DAO untuk insert, update, delete 
    */
    public boolean insertDatas(Job job, String data){
        boolean result = false;
        Session session = this.sessionFactory.openSession();
        Transaction  transaction = session.beginTransaction();
        try {
            if (data == "save") {
                session.save(job);
            } if (data == "update") {
                session.update(job);
            } if (data == "delete") {
                session.delete(job);
            }
            transaction.commit();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction!=null) {
                transaction.rollback();
            }
        } finally{
            session.close();
        }
        return result;
    }
    /*
    * fungsi untuk mendapatkan data allJobs
    * line efektiveness untuk getAllJobs dan searchJobs
    */
    public List<Job> getDatas(String query){
        List<Job> datas = new ArrayList<>();
        Session session = this.sessionFactory.openSession();
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
    /*
    * fungsi DAO untuk mendapatkan allJobs
    */
    public List<Job> getAllJobs(){
        String query = ("FROM Job");
        return getDatas(query);
    }
    /*
    * fungsi DAO untuk mencari allJobs
    */
    public List<Job> searchJobs(Object object){
        String query = ("FROM Job where jobId LIKE '%" + object + "%' OR jobTitle LIKE '%" + object + "%'");
        return getDatas(query);
    }
    /*
    * fungsi DAO untuk mencari berdasarkan idJobs
    */
    public Job getByIdJob(Object jobId){
        Job job = new Job();
        Session session = this.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            job = (Job)session.createQuery("FROM Job WHERE jobId LIKE '%" + jobId + "%'").uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction!=null) {
                transaction.rollback();
            }
        }
        return job;
    }
    /*
    * fungsi DAO untuk menambahkan Job
    */
    public boolean insertJob(Job job){
        return insertDatas(job, "save");
    }
    /*
    * fungsi DAO untuk mengupdate job
    */
    public boolean updateJob(Job job){
        return insertDatas(job, "update");
    }
    /*
    * fungsi DAO untuk menghapus job
    */
    public boolean deleteJob(Job job){
       return insertDatas(job, "delete");
    }
    
}
