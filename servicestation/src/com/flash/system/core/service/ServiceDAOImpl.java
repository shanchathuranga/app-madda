package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.ServiceDAO;
import com.flash.system.core.entity.Service;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class ServiceDAOImpl extends BaseDAO implements ServiceDAO {

    public void addService(Service service) throws Exception {
        try {
            begin();
            getSession().save(service);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateService(Service service) throws Exception {
        try {
            begin();
            getSession().update(service);
            commit();
        } catch (HibernateException e) {
            begin();
            getSession().saveOrUpdate(service);
        }
    }

    public void deleteService(Service service) throws Exception {
        try {
            begin();
            getSession().delete(service);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public Service findByPrimaryKey(Long serviceId) throws Exception {
        Service service = null;
        try {
            begin();
            service = (Service) getSession().load(Service.class, serviceId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return service;
    }

    public List<Service> findAll() throws Exception {
        List<Service> services = null;
        try {
            begin();
            Query query = getSession().createQuery("from Service");
            services = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return services;
    }
}
