package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.SupplierDAO;
import com.flash.system.core.entity.Supplier;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class SupplierDAOImpl extends BaseDAO implements SupplierDAO {

    public void addSupplier(Supplier supplier) throws Exception {
        try {
            begin();
            getSession().save(supplier);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateSupplier(Supplier supplier) throws Exception {
        try {
            begin();
            getSession().update(supplier);
            commit();
        } catch (HibernateException e) {
            begin();
            getSession().saveOrUpdate(supplier);
            commit();
        }
    }

    public void deleteSupplier(Supplier supplier) throws Exception {
        try {
            begin();
            getSession().delete(supplier);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public Supplier findByPrimaryKey(Long supplierId) throws Exception {
        Supplier supplier = null;
        try {
            begin();
            supplier = (Supplier) getSession().load(Supplier.class, supplierId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return supplier;
    }

    public List<Supplier> findAll() throws Exception {
        List<Supplier> suppliers = null;
        try {
            begin();
            Query query = getSession().createQuery("from Supplier");
            suppliers = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return suppliers;
    }
}
