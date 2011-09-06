package com.flash.system.core.service;

import com.flash.system.core.dao.BaseDAO;
import com.flash.system.core.dao.OrderDAO;
import com.flash.system.core.entity.Order;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author shan
 */
public class OrderDAOImpl extends BaseDAO implements OrderDAO {

    public void addOrder(Order order) throws Exception {
        try {
            begin();
            getSession().save(order);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public void updateOrder(Order order) throws Exception {
        try {
            begin();
            getSession().update(order);
            commit();
        } catch (HibernateException e) {
            begin();
            getSession();
            commit();
        }
    }

    public void deleteOrder(Order order) throws Exception {
        try {
            begin();
            getSession().delete(order);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
    }

    public Order findByPrimaryKey(Long orderId) throws Exception {
        Order order = null;
        try {
            begin();
            order = (Order) getSession().load(Order.class, orderId);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return order;
    }

    public List<Order> findAll() throws Exception {
        List<Order> orders = null;
        try {
            begin();
            Query query = getSession().createQuery("from Order");
            orders = query.list();
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new Exception(e.getCause().getMessage());
        }
        return orders;
    }
}
