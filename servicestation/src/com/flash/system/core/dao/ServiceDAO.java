package com.flash.system.core.dao;

import com.flash.system.core.entity.Service;
import java.util.List;

/**
 *
 * @author shan
 */
public interface ServiceDAO {

    public void addService(Service customer) throws Exception;

    public void updateService(Service customer) throws Exception;

    public void deleteService(Service customer) throws Exception;

    public Service findByPrimaryKey(Long id) throws Exception;

    public List<Service> findAll() throws Exception;
}
