package com.flash.system.core.dao;

import com.flash.system.core.entity.Service;
import java.util.List;

/**
 *
 * @author shan
 */
public interface ServiceDAO {

    public void addService(Service service) throws Exception;

    public void updateService(Service service) throws Exception;

    public void deleteService(Service service) throws Exception;

    public Service findByPrimaryKey(Long id) throws Exception;

    public List<Service> findAll() throws Exception;
}
