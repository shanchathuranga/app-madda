package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.ServiceTypeDAO;
import com.flash.system.core.entity.ServiceType;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class ServiceTypeDAOImpl extends BaseDAO implements ServiceTypeDAO {

    public void addServiceType(ServiceType serviceType) throws Exception {
        try {
            begin();
            getSession().save(serviceType);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateServiceType(ServiceType serviceType) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteServiceType(ServiceType serviceType) throws Exception {
        try {
            begin();
            getSession().delete(serviceType);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public ServiceType findByPrimaryKey(Long serviceTypeId) throws Exception {
        ServiceType serviceType = null;
        try {
            begin();
            serviceType = (ServiceType)getSession().load(ServiceType.class, serviceTypeId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return serviceType;
    }

    public List<ServiceType> findAll() throws Exception {
        List<ServiceType> services = null;
        try {
            begin();
            Query query = getSession().createQuery("from ServiceType");
            services = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return services;
    }

}
