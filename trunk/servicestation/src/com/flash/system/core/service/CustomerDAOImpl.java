package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.CustomerDAO;
import com.flash.system.core.entity.Customer;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author shan
 */
public class CustomerDAOImpl extends BaseDAO implements CustomerDAO {

    public void addCustomer(Customer customer) throws Exception {
        try {
            begin();
            getSession().save(customer);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateCustomer(Customer customer) throws Exception {
        try {
            begin();
            getSession().update(customer);
            commit();
        } catch (HibernateException e) {
            begin();
            getSession().saveOrUpdate(customer);
            commit();
        }
    }

    public void deleteCustomer(Customer customer) throws Exception {
        try {
            begin();
            getSession().delete(customer);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public Customer findByPrimaryKey(Long customerId) throws Exception {
        Customer customer = null;
        try {
            begin();
            customer = (Customer) getSession().load(Customer.class, customerId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return customer;
    }

    public List<Customer> findAll() throws Exception {
        List<Customer> customers = null;
        try {
            begin();
            Query query = getSession().createQuery("from Customer");
            customers = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return customers;
    }

    public Customer findByEmail(String email) throws Exception {
        Customer customer = null;
        try {
            begin();
            Query query = getSession()
                    .createQuery("from Customer where email=?")
                    .setParameter(0, email);
            customer = (Customer) query.uniqueResult();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return customer;
    }

    public List<Customer> findCustomersByEmail(String mockEmail) throws Exception {
        List<Customer> customers = null;
        try {
            begin();
            Query query = getSession()
                    .createQuery("from Customer");
                    //.setParameter(0, mockEmail);
            commit();
        } catch (Exception e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return customers;
    }

    public List<Customer> findByFname(String fName) throws Exception {
        List<Customer> customers = null;
        return customers;
    }

    public List<Customer> findByLname(String lName) throws Exception {
        List<Customer> customers = null;
        return customers;
    }

    public List<Customer> findByNICNo(String NIC) throws Exception {
        List<Customer> customers = null;
        return customers;
    }

    public Customer findBytpMobile(String mobileNumber) throws Exception {
        Customer customer = null;
        return customer;
    }
}
