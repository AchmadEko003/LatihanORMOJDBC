/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.JobDAO;
import entities.Job;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Igaz
 */
public class JobController {
    private SessionFactory sessionFactory;
    private JobDAO jdao;

    public JobController() {
    }

    public JobController(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.jdao = new JobDAO(sessionFactory);
    }
    /*
    * controller untuk mendapatkan allJobs
    */
    public List<Job> getAllJobs(){
        return jdao.getAllJobs();
    }
    /*
    * controller untuk mencari Jobs menggunakan search
    */
    public List<Job> searchJobs(Object object){
        return jdao.searchJobs(object);
    }
    /*
    * controller untuk mendapatkan idJobs
    */
    public Job getByIdJob(Object object){
        return jdao.getByIdJob(object);
    }
    /*
    * controller untuk insert data job
    */
    public boolean insertJob(Job job){
        return jdao.insertJob(job);
    }
    /*
    * controller untuk mengupdate job
    */
    public boolean updateJob(Job job){
        return jdao.updateJob(job);
    }
    /*
    * controller untuk menghapus jobs
    */
    public boolean deleteJob(Job job){
        return jdao.deleteJob(job);
    }
    
}
