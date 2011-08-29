package com.flash.system.core.service;

import com.flash.system.core.dao.CustomerDAO;
import com.flash.system.core.entity.Customer;
import com.flash.system.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author shan
 */
public class CustomerDAOImpl implements CustomerDAO {

    public void addCustomer(Customer customer) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
    }

    public void updateCustomer(Customer customer) {
    }

    public void deleteCustomer(Customer customer) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();
        session.delete(customer);
        session.getTransaction().commit();
    }

    public Customer findByPrimaryKey(Long customerId) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();
        Customer customer = (Customer) session.load(Customer.class, customerId);
        session.getTransaction().commit();

        return customer;

    }

    public List<Customer> findAll() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from Customer");
        //query.setFirstResult((pageNumber - 1) * pageSize);
        //query.setMaxResults(pageSize);
        List<Customer> customers = query.list();
        session.getTransaction().commit();
        return customers;
    }
}
