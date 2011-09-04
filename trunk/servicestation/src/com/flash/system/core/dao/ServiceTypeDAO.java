package com.flash.system.core.dao;

import com.flash.system.core.entity.ServiceType;
import java.util.List;

/**
 *
 * @author shan
 */
public interface ServiceTypeDAO {

    public void addServiceType(ServiceType serviceType) throws Exception;

    public void updateServiceType(ServiceType serviceType) throws Exception;

    public void deleteServiceType(ServiceType serviceType) throws Exception;

    public ServiceType findByPrimaryKey(Long serviceTypeId) throws Exception;

    public List<ServiceType> findAll() throws Exception;
}
