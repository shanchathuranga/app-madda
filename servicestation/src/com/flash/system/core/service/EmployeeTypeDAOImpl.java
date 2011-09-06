package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.EmployeeTypeDAO;
import com.flash.system.core.entity.EmployeeType;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class EmployeeTypeDAOImpl extends BaseDAO implements EmployeeTypeDAO {

    public void addEmployeeType(EmployeeType empType) throws Exception {
        try {
            begin();
            getSession().save(empType);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateEmployeeType(EmployeeType empType) throws Exception {
        try {
            begin();
            getSession().update(empType);
            commit();
        } catch (HibernateException e) {
            begin();
            getSession();
            commit();
        }
    }

    public void deleteEmployeeType(EmployeeType empType) throws Exception {
        try {
            begin();
            getSession().delete(empType);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public EmployeeType findByPrimaryKey(int EmployeeTypeId) throws Exception {
        EmployeeType customer = null;
        try {
            begin();
            customer = (EmployeeType) getSession().load(EmployeeType.class, EmployeeTypeId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return customer;
    }

    public List<EmployeeType> findAll() throws Exception {
        List<EmployeeType> employeeTyps = null;
        try {
            begin();
            Query query = getSession().createQuery("from EmployeeType");
            employeeTyps = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return employeeTyps;
    }
}
