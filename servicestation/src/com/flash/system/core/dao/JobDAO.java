package com.flash.system.core.dao;

/**
 *
 * @author shan
 */
public interface JobDAO {

    public void addJob(Job customer);
    public void updateJob(Job customer);
    public void deleteJob(Job customer);
    public Job findByPrimaryKey(Long id);
    public List<Job> findAll();

}
