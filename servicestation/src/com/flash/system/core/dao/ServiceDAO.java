package com.flash.system.core.dao;

import com.flash.system.core.entity.Service;
import java.util.List;

/**
 *
 * @author shan
 */
public interface ServiceDAO {

    public void addService(Service customer);
    public void updateService(Service customer);
    public void deleteService(Service customer);
    public Service findByPrimaryKey(Long id);
    public List<Service> findAll();

}
