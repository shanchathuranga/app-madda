package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.JobDAO;
import com.flash.system.core.entity.Job;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class JobDAOImpl extends BaseDAO implements JobDAO {

    public void addJob(Job job) throws Exception {
        try {
            begin();
            getSession().save(job);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateJob(Job job) throws Exception {
    }

    public void deleteJob(Job job) throws Exception {
        try {
            begin();
            getSession().delete(job);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public Job findByPrimaryKey(Long jobId) throws Exception {
        Job job = null;
        try {
            begin();
            job = (Job) getSession().load(Job.class, jobId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return job;
    }

    public List<Job> findAll() throws Exception {
        List<Job> jobs = null;
        try {
            begin();
            Query query = getSession().createQuery("from Job");
            jobs = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return jobs;
    }
}
