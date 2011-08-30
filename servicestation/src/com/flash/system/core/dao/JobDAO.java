package com.flash.system.core.dao;

import com.flash.system.core.entity.Job;
import java.util.List;

/**
 *
 * @author shan
 */
public interface JobDAO {

    public void addJob(Job customer) throws Exception;

    public void updateJob(Job customer) throws Exception;

    public void deleteJob(Job customer) throws Exception;

    public Job findByPrimaryKey(Long id) throws Exception;

    public List<Job> findAll() throws Exception;
}
