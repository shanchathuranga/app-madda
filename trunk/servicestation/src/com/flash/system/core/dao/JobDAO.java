package com.flash.system.core.dao;

import com.flash.system.core.entity.Job;
import java.util.List;

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
